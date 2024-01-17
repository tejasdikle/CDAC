import java.util.*;
public class Testemp 
{
	public static void main(String[]args)
	
	{
		Emp[]e1 = new Emp[10];
		for(int i=0;i<10;i++)
		{
			e1[i] = new Emp (i+1 ,"e "+(i+1));
		
		}
		System.out.println("Emp copy id =>" +e1[0].getId());
		System.out.println("Emp copy Name =>" +e1[0].getName());
		System.out.println("Number copy of emp =>" +Emp.getNoOfEmps());
		
	}
	

}
