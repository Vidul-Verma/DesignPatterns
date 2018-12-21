
public class Machine {

	private State state;
	StringBuilder sb;
	String inputString;
	public Machine() {
		this.state = new State1(this);
	}
	
	void passInput(StringBuilder sb) {
		this.state =  new State1(this);
		this.sb = sb;
		this.inputString = sb.toString();
		for(int i = 0 ; i < this.sb.length() ; i++) {
			char input = sb.charAt(i);
			if(input == 'a') {
				this.state.inputA();
			}else if(input == 'b') {
				this.state.inputB();
			}else {
				this.state = new InvalidState(this);
				System.out.println("String" + inputString + "not accepted");
				break;
			}
		}
		checkAcceptance();
		this.state = new State1(this);
	}
	
	void checkAcceptance() {
		if(this.state.getStateName() == "state1") {
			System.out.println("String " + inputString + " accepted");
		}else {
			System.out.println("String " + inputString + " NOT accepted");
		}
	}
	
	public void changeState(State s) {
		this.state = s;
		System.out.println("changed to " + state.getStateName());
	}
}
