import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sc = new Scanner(new File("./input.txt"));
		int numOfIntegers = sc.nextInt();
		int numOfDoubles = sc.nextInt();
		int numOfStrings = sc.nextInt();
		int[] integerArray = new int[numOfIntegers];
		String[] stringArray = new String[numOfStrings];
		double[] doubleArray = new double[numOfDoubles];
		for(int i = 0 ; i < integerArray.length ; i++) {
			integerArray[i] = sc.nextInt();
		}
		for(int i = 0 ; i < doubleArray.length ; i++) {
			doubleArray[i] = sc.nextDouble();
		}
		for(int i = 0; i < stringArray.length; i++) {
			stringArray[i] = sc.next();
		}
		
		IntegerArray intArrayObject = new IntegerArray(integerArray);
		IntegerItr intItr = intArrayObject.getIterator();
		StringArray stringArrayObject = new StringArray(stringArray);
		StringItr strItr = stringArrayObject.getIterator();
		DoubleArray doubleArrayObject = new DoubleArray(doubleArray);
		DoubleItr doubleItr = doubleArrayObject.getIterator();
		printAll(doubleItr);
		printAll(intItr);
		printAll(strItr);
	}
	
	static public void printAll(Iterator itr) {
		while(!itr.isDone()) {
			System.out.println(itr.Current());
			itr.Next();
		}
		
	}
}
