
public class PizzaFactory {

	public static Pizza makePizza(int size) {
		Pizza pizza = null;
		switch(size) {
		case 1:
			pizza = new SmallPizza();
			break;
		case 2:
			pizza = new Medium();
			break;
		case 3:
			pizza = new Large();
			break;
		case 4:
			pizza = new Family();
			break;
		}
		
		return pizza;
	}
}
