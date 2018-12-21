import java.util.Arrays;

import mystring.IndiscreetString;
import mystring.MyString;

public class DiscreteString implements MyString{
	
	IndiscreetString inDiscreteObject;
	int count;
	
	public DiscreteString() {
		// TODO Auto-generated constructor stub
		inDiscreteObject = new IndiscreetString();
		count = 0;
	}
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return inDiscreteObject.getText();
	}

	@Override
	public void reverse() {
		// TODO Auto-generated method stub
		inDiscreteObject.reverse();
	}

	@Override
	public void setText(String arg0) {
		// TODO Auto-generated method stub
		String tempString = arg0;
		String[] elements = tempString.split(" ");
		for(int i = 0 ; i < elements.length ; i++) {
			if(elements[i].equals("bum") || elements[i].equals("weewee") || elements[i].equals("knickers")|| elements[i].equals("poopoos")) {
				if(elements[i].equals("bum")) {
					elements[i] = "b*m ";
				}
				if(elements[i].equals("weewee")) {
					elements[i] = "w**w** ";
				}
				if(elements[i].equals("knickers")) {
					elements[i] = "kn*ckers ";
				}
				if(elements[i].equals("poopoos")) {
					elements[i] = "p**p**s ";
				}
				inDiscreteObject.setText(tempString);
				count++;
			}else {
				elements[i] = elements[i] + " ";
			}
			
			
			
		}
		String delimiter = "";
	    String result = String.join(delimiter, elements);
	    inDiscreteObject.setText(result);
		close();
		
		
	}
	
	public void close() {
		
		System.out.println("The user attempted to insert " + count + " naughty words");
	}

}
