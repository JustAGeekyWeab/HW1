import java.util.Scanner;

public class main{
public static void main (String[]args){

	apples apple = new apples(15);
	apple.setWeight(25);
	
	System.out.println("What apples do you need?");
	Scanner scan = new Scanner(System.in);
	int input = scan.nextInt();

	apple.setWeight(input);
}
}