import java.util.Scanner;

public class MainClass {
	static Machine m ;
	static Scanner sc;
	public static void main(String[] args) {
		m = new Machine();
		System.out.println("Enter input string: ");
		sc = new Scanner(System.in);
		String userInput = sc.next();
		while(!userInput.equals("q")) {
			StringBuilder sb = new StringBuilder(userInput);
			m.passInput(sb);
			userInput = sc.next();
		}
		System.out.println("Good bye!");
	}
	
}
