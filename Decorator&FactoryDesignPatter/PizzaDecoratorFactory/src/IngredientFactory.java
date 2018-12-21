
public class IngredientFactory {
	
	public static Pizza addIngredient(Pizza pizza, String topping) {
		char[] toppingNames = topping.toCharArray();
		for(int i = 0 ; i < toppingNames.length; i++) {
			switch(toppingNames[i]) {
			case 'P':
			case 'p':
				pizza = new Pepperoni(pizza);
				break;
			case 'H':
			case 'h':
				pizza = new Hamburger(pizza);
				break;
			case 'S':
			case 's':
				pizza = new Sausage(pizza);
				break;
			case 'C':
			case 'c':
				pizza = new CanadianBacon(pizza);
				break;
			case 'E':
			case 'e':
				pizza = new ExtraCheese(pizza);
				break;
			case 'O':
			case 'o':
				pizza = new Onion(pizza);
				break;
			case 'G':
			case 'g':
				pizza = new GreenPepper(pizza);
				break;
			case 'B':
			case 'b':
				pizza = new BlackOlives(pizza);
				break;
			case 'n':
			case 'N':
				pizza = new GreenOlives(pizza);
				break;
			case 'M':
			case 'm':
				pizza = new Mushrooms(pizza);
				break;
			case 'A':
			case 'a':
				pizza = new Anchovies(pizza);
				break;
			case 'r':
			case 'R':
				pizza = new Beer(pizza);
				break;
			}
		}
		
		
		return pizza;
	}

}
