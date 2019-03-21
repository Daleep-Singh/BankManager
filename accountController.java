
import java.util.Scanner;

public class accountController {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		accountInfo summary = new accountInfo(); //Creating observer 
		bankAccount daleep = new bankAccount(); //creating model
		daleep.addObserver(summary); //connecting observer to model
		
		Scanner scanner=new Scanner(System.in);
		while (true) {
			System.out.println("press 1 to withdraw, 2 to deposit, 3 to check balance");
			int line = scanner.nextInt();
			if (line == 1){
				System.out.println("how much to withdraw?");
				int line1 = scanner.nextInt();
				daleep.withdraw(line1);
			}
			if (line == 2){
				System.out.println("how much to deposit?");
				int line2 = scanner.nextInt();
				daleep.deposit(line2);
		}
			if (line == 3){
				System.out.println(daleep.getBalance());
				}
		}
	}
}
