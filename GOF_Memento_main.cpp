#include <iostream>
using namespace std;

class State;
class Memento;

class Originator {
	State	*state;
public:
	Memento *CreateMemento();
	void SetMemento( Memento*);
	void ChangeState(int x, int y);
	Originator(int x, int y) ;
	void Display();
};

class Memento {
	friend class Originator;

	void SetState(State* s);
	State* GetState(){
		return state;
	}
	State* state;
public:
	Memento();
};

class State {
	int		x, y;
public:
	State(int x, int y) {
		this->x=x;
		this->y=y;
	}
	State(){}
	void Display() {
		cout << "(" << x << "," << y << ")" << endl;
	}
	void SetXY(int x, int y) {
		this->x = x; this->y = y;
	}
	int GetX() {
		return x;
	}
	int GetY() {
		return y;
	}
};

Originator::Originator(int x, int y) {
	state = new State(x,y);
}
void Originator::Display() {
	state->Display();
}

void Originator::SetMemento( Memento* m) {
	State *s;
	s = m->GetState();
	state->SetXY(s->GetX(), s->GetY());
}

void Originator::ChangeState(int x, int y){
	state->SetXY(x,y);
}

Memento* Originator::CreateMemento(){
	Memento *m = new Memento;
	m->SetState (this->state);
	return	m;
}

void Memento::SetState(State* s){
		state->SetXY(s->GetX(), s->GetY());
}

Memento::Memento(){
		state = new State();
	}
int main() {
	Originator	org(1,1);
	Memento	*memento = org.CreateMemento();

	org.Display();

	org.ChangeState(3,4);

	org.Display();

	org.SetMemento(memento);

	org.Display();

	delete memento;
	return	0;
}
