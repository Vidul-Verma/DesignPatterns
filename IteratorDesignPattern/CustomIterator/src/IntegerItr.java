
public class IntegerItr implements Iterator{
	
	IntegerArray integers;
	private int currentPosition;
	
	public IntegerItr(IntegerArray obj){
		this.integers = obj; 
		currentPosition = 0;
	}
	@Override
	public Object First() {
		// TODO Auto-generated method stub
		return integers.integerArray[0];
	}

	@Override
	public Object Current() {
		// TODO Auto-generated method stub
		return integers.integerArray[currentPosition];
	}

	@Override
	public boolean isDone() {
		// TODO Auto-generated method stub
		if(currentPosition == integers.integerArray.length) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public boolean Next() {
		// TODO Auto-generated method stub
		if(!isDone()) {
			currentPosition ++;
			return true;
		}else {
			return false;
		}
		
		
		
	}

}
