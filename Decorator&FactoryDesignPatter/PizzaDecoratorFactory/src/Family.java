
public class Family extends Pizza{

	String description = "Family pizza with";
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 16.00;
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
