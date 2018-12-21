
public class Onion extends ToppingDecorator{

	Pizza pizza;
	String description = " Onion";
	double cost = 1.50;
	
	public Onion(Pizza pizza) {
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
