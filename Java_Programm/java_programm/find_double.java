import java.util.Scanner;

public class Double 
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);            //Memory allocation

        System.out.println("Enter the First number of double :");
        if (sc.hasNextDouble())
        {
            double num1 = sc.nextDouble();
            System.out.println("Enter the second double value :");
            if (sc.hasNextDouble())
            {
                double num2 = sc.nextDouble();
                double avg = (num1+num2)/2;
                System.out.println("Average of two values :"+avg);
            }
            else
            {
                System.out.println("Second value is not double ");

            }
        }
        else
        {
            System.out.println("First value is not double:");
        }
        sc.close();
    }
    
}
