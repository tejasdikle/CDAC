import java.util.Scanner;
class Calci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First double number ");
		if(sc.hasNextDouble()) {
			double num1 = sc.nextDouble();
			System.out.println("Enter Second double number");
			if(sc.hasNextDouble())
			{
				double num2 = sc.nextDouble();
				double avg = (num1+num2)/2;
				System.out.println("Avarge of both number "+avg);
			}
			else
			{
				System.out.println("**********Second number not double***********");
			}
		}
		else
		{
			System.out.println("**********first number not double***********");
		}
		sc.close();

	}

}
;