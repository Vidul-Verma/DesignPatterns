
public class BlackOlives extends ToppingDecorator{

	Pizza pizza;
	String description = " BlackOlives";
	double cost = 1.50;
	
	public BlackOlives(Pizza pizza) {
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
