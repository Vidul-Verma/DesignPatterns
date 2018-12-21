import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class MainClass {
	static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		Pizza myPizza = startProcess();
		
		
		while(true) {
			System.out.println("Enter toppings");
			System.out.println("P: Pepperoni");
			System.out.println("S: Sausage");
			System.out.println("H: Hamburger");
			System.out.println("C: Canadian Bacon");
			System.out.println("E: Extra cheese");
			System.out.println("O: Onions");
			System.out.println("G: Green Pepper");
			System.out.println("B: Black1 Olives");
			System.out.println("N: Green Olives");
			System.out.println("M: Mushroom");
			System.out.println("A: Anchovies");
			System.out.println("R: Beer");
			String topping = sc.next();
			if(topping.equals("q")) {
				System.out.println("Pizza cancelled");
				myPizza = startProcess();
				
				continue;
			}
			myPizza = IngredientFactory.addIngredient(myPizza, topping);
			System.out.println(myPizza.getDescription() + " - " + " $" + myPizza.getCost() );
			System.out.println(myPizza.getIngredientsCount() + " Ingredients");
			myPizza = startProcess();
			
		}
		
		
	}
	
	public static Pizza startProcess() {
		System.out.println("_______________________________");
		System.out.println("To make new Pizza!!");
		System.out.println("Enter Pizza size");
		System.out.println("1: Small");
		System.out.println("2: Medium");
		System.out.println("3: Large");
		System.out.println("4: Family");
		System.out.println("0: Exit");
		int size = sc.nextInt();
		if(size == 0) {
			System.out.println("Machine closing ...");
			System.exit(1);;
		}
		Pizza myPizza = PizzaFactory.makePizza(size);
		return myPizza;
	}
}
