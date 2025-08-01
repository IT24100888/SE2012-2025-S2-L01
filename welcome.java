import java.util.Scanner;

public class Welcome{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		
		System.out.printf("Enter your first name: ");
		String firstName = scanner.nextLine();
		
		System.out.printf("Enter your last name: ");
		String lastName = scanner.nextLine();
		
		System.out.printf("Welcome to the second year "+ firstName + " " + lastName);
		
		//scanner.close();
	}
}