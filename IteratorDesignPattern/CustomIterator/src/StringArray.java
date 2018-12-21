
public class StringArray implements CustomArray{
	
	String[] stringArray;
	
	StringArray(String[] arr){
		this.stringArray = arr;
	}
	
	@Override
	public StringItr getIterator() {
		// TODO Auto-generated method stub
		return new StringItr(this);
	}
}
