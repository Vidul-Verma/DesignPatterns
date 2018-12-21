
public class Medium extends Pizza{

	String description = "Medium pizza with";
	
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 10.00;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return description;
	}
	
	@Override
	public int getIngredientsCount() {
		// TODO Auto-generated method stub
		return 0;
	}	

}
