
public class CanadianBacon extends ToppingDecorator{
	
	Pizza pizza;
	String description = " CanadianBacon";
	double cost = 2.75;
	
	public CanadianBacon(Pizza pizza) {
		// TODO Auto-generated constructor stub
		this.pizza = pizza;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return pizza.getDescription() + description;
	}
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return pizza.getCost() + cost;
	}	
	@Override
	public int getIngredientsCount() {
		// TODO Auto-generated method stub
		return pizza.getIngredientsCount() + 1;
	}	
}
