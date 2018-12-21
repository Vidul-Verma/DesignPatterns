
public class IntegerArray implements CustomArray{
	
	int[] integerArray;
	
	IntegerArray(int[] arr){
		this.integerArray = arr;
	}
	
	@Override
	public IntegerItr getIterator() {
		// TODO Auto-generated method stub
		return new IntegerItr(this);
	}

}
