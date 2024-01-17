import java.util.*;
class Canteen 
{
    public static void main(String []args )
    {
        System.out.println("=========================================================");
        System.out.println("                    Cateen menu card                     ");
        System.out.println("=========================================================");
        System.out.println("                *** Morning Lunch ***                    ");
        System.out.println("             ===========================                  ");
        System.out.println("                    1.Poha");
        System.out.println("                    2.Uttapa");
        System.out.println("                    3.Sandwich");
        System.out.println("                    4.Upma");
        System.out.println("                    5.Idli");
        System.out.println("                    6.Generate Bill");

        
        boolean exit = false;
        Scanner sc =new Scanner(System.in); //Memory allocate
        float totalamt = 0;
        while(!exit)
        {
        
            int qty;
            System.out.print( "Enter your choice here :"); 
            int ch = sc.nextInt();   
            switch(ch)
            {
                case 1:
                {
                    System.out.print("Enter the Poha Quantity (Price = 20):");
                    qty = sc.nextInt();
                    totalamt += qty * 20;
                    break;
                }
                case 2:
                {
                    System.out.print("Enter the Uttpa  Quantity (Price = 25):");
                    qty = sc.nextInt();
                    totalamt += qty * 25;
                    break;
                }
                case 3:
                {
                    System.out.print("Enter the Sandwitch Quantity (Price = 15):");
                    qty = sc.nextInt();
                    totalamt += qty * 15;
                    break;
                }
                case 4:
                {
                    System.out.print("Enter the Upma Quantity (Price = 20):");
                    qty = sc.nextInt();
                    totalamt += qty * 20;
                    break;
                }
                case 5:
                {
                    System.out.print("Enter the Edli Quantity (Price = 30):");
                    qty = sc.nextInt();
                    totalamt += qty * 30;
                    break;
                }
                case 6 :
                {
                    System.out.print("Total Bill  ===>  "+totalamt);
                    exit = true;
                    break;
                }
                default:
                {
                    System.out.print("Invalid Entry");
                   
                    
                }
            }
            
        }
        sc.close();
    
    }
    
}
