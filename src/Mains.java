import java.util.Scanner;
public class Mains {
	public static void Mains (String[]args){

		apples apple = new apples(15);
		apple.setWeight(25);
		
		System.out.println("What apples do you need?");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();

		apple.setWeight(input);
	}
}
