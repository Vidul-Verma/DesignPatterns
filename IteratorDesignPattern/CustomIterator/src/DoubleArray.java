
public class DoubleArray implements CustomArray{

	double[] doubleArray;
	
	DoubleArray(double[] arr){
		this.doubleArray = arr;
	}
	
	@Override
	public DoubleItr getIterator() {
		// TODO Auto-generated method stub
		return new DoubleItr(this);
	}
}
