
public class State2 implements State{
	char input;
	Machine machine;
	
	State2(Machine m){
		this.machine = m;
	}

	@Override
	public void inputA() {
		// TODO Auto-generated method stub
		System.out.println("Input a on "+ getStateName());
		machine.changeState(new State4(this.machine));
	}
	
	@Override
	public void inputB() {
		// TODO Auto-generated method stub
		System.out.println("Input b on "+ getStateName());
		machine.changeState(new State1(this.machine));
	}

	@Override
	public String getStateName() {
		// TODO Auto-generated method stub
		return "state2";
	}
}
