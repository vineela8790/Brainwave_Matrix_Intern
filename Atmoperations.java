import java.util.Scanner;
public class Atmoperations {     
 //the basic atm operations are
//  1.with draw
//  2.balance enquiry
//  3.deposit
//  4.pin generation
//  5.mini statement
public static void main(String[] args) 
	{
		int uname=0;
		int pwd=000;
		Scanner s =new Scanner(System.in);
		int c=0;
		int balance=1000;
		while(c!=3)
		{
			System.out.println("plz enter username");
			int un=s.nextInt();
			System.out.println("plz enter pwd");
			int p =s.nextInt();
			if(uname==un&&pwd==p)
			{
				System.out.println("success login");
				break;
			}
			else
			{
				System.out.println("invalid credintials");
				c++;
			}
			if(c==3)
			{
				System.out.println("number of attempts exceeded");
			}
			
			while(true)
			{
				
				System.out.println("1.deposit");
				System.out.println("2.balance");
				System.out.println("3.withdraw");
				System.out.println("4.for exit");
				System.out.println("plz select any one");
				int opt=s.nextInt();
				switch(opt)
				{
				case 1:System.out.println("enter amount deposit");
				int amount=s.nextInt();
				balance=balance+amount;
				break;
				case 2:System.out.println("current balance="+balance);
				break;
				case 3:System.out.println("enter the amount to be withdraw");
				int withdraw =s.nextInt();
				if(withdraw<balance)
				{
					balance =balance-withdraw;
					System.out.println("pls collect ur cash="+withdraw);
				}
				else
				{
					System.out.println("low balance");
				}
				break;
				case 4:System.exit(0);
				default:
					System.out.println("invalid input plz");
				
				}
			}
		}
		
		}
	}
