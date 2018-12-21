
public class Large extends Pizza{

	String description = "Large pizza with";
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 12.00;
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
