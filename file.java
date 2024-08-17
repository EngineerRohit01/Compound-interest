import java.util.Scanner;

public class file{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.print("ener Principle: ");
		int principle = scan.nextInt();

		System.out.print("ente time: ");
		float time = scan.nextFloat();

		System.out.print("enter Rate: ");
		float rate = scan.nextFloat();

		double Si = principle * Math.pow((1+rate/100),time);

		System.out.println("Simple interest is : " + Si);
	}
}