import java.util.*;

class Calculator
{
    public static void main(String [] args)
    {
        System.out.println("======== Calculator ========");
        System.out.println("1.Addition");
        System.out.println("2.Substraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Exit");


        boolean exit = false;
        Scanner sc = new Scanner(System.in);  //Memory allocate

        while(!exit)
        {
            System.out.println("Enter ur choice :");
            int ch = sc.nextInt();
            switch (ch)
            {
                case 1:
                {
                    System.out.println("Enter two number for Addition:");
                    double num1 =sc.nextDouble();
                    double num2 =sc.nextDouble();
                    double res = num1 + num2; 
                    System.out.println("Result ===> "+res);
                    break;
                }
                case 2:
                {
                    System.out.println("Enter two number for Substaction:");
                    double num1 =sc.nextDouble();
                    double num2 =sc.nextDouble();
                    double res = num1 - num2; 
                    System.out.println("Result ===> "+res);
                    break;
                }
                case 3:
                {
                    System.out.println("Enter two number for Multiplication:");
                    double num1 =sc.nextDouble();
                    double num2 =sc.nextDouble();
                    double res = num1 * num2; 
                    System.out.println("Result ===> "+res);
                    break;
                    
                }
                case 4:
                {
                    System.out.println("Enter two number for Division:");
                    double num1 =sc.nextDouble();
                    double num2 =sc.nextDouble();
                    double res = num1 / num2; 
                    System.out.println("Result ===> "+res);
                    break;
                }
                default:
                {
                    System.out.println("Invalid Input ");
                    exit = true;
                }
                
            }
        }sc.close();
    }
}