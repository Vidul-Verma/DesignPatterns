
public class StringItr implements Iterator{
	
	StringArray strings;
	private int currentPosition;
	
	public StringItr(StringArray obj){
		currentPosition = 0; 
		this.strings = obj;
	}
	@Override
	public Object First() {
		// TODO Auto-generated method stub
		return strings.stringArray[0];
	}

	@Override
	public Object Current() {
		// TODO Auto-generated method stub
		return strings.stringArray[currentPosition];
	}

	@Override
	public boolean isDone() {
		// TODO Auto-generated method stub
		if(currentPosition == strings.stringArray.length) {
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
