
public class DoubleItr implements Iterator{
	DoubleArray doubles;
	private int currentPosition;
	
	public DoubleItr(DoubleArray obj){
		currentPosition = 0; 
		this.doubles = obj;
	}
	@Override
	public Object First() {
		// TODO Auto-generated method stub
		return doubles.doubleArray[0];
	}

	@Override
	public Object Current() {
		// TODO Auto-generated method stub
		return doubles.doubleArray[currentPosition];
	}

	@Override
	public boolean isDone() {
		// TODO Auto-generated method stub
		if(currentPosition == doubles.doubleArray.length) {
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
