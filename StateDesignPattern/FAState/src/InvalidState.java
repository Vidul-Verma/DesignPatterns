
public class InvalidState implements State {
	
	char input;
	Machine machine;
	
	InvalidState(Machine m){
		this.machine = m; 
	}

	@Override
	public void inputA() {
		// TODO Auto-generated method stub
	
	}
	
	@Override
	public void inputB() {
		// TODO Auto-generated method stub

	}
	
	@Override
	public String getStateName() {
		// TODO Auto-generated method stub
		return "InvalidState";
	}
}
