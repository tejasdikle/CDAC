package tester;

import java.util.Scanner;

import doa.BankAccountDaoImpl;

public class TransferFund {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in);)
		{
			BankAccountDaoImpl acctDao = new BankAccountDaoImpl();
			System.out.println("Enter source and destination account number for transfer funds");
			String mesg = acctDao.transeferFund(sc.nextInt(), sc.nextInt(), sc.nextDouble());
			System.out.println(mesg);
			acctDao.cleanup();
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
