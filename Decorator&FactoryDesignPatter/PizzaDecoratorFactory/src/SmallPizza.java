
public class SmallPizza extends Pizza{
	
	String description = "Small Pizza with";
	
	public double getCost() { return 8.00; }

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
