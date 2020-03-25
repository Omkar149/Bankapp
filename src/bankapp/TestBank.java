package bankapp;

import java.util.Scanner;

public class TestBank {
	
	//Account a=new Account();
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int ch;
		final int sinterest=8;
		final int cinterest=10;
		
		//current c=new current(3,"pqr",3000,"abc");
		System.out.println("1.saving 2.current");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			saving s=new saving();
		     accept(s);
		     System.out.println("1.loan \t 2.exit");
		     int ch1=sc.nextInt();
		     switch(ch1)
		     {
		     case 1:
		    	 loan l=new loan();
		    	 System.out.println("1.simple \t 2.compund");
		    	 int ch2=sc.nextInt();
		    	 switch(ch2)
		    	 {
		    	 case 1:
		    		 System.out.println("-----simple interest-----");
		    		 System.out.println("Enter principal amount and no of year ");
		    		 int pamount=sc.nextInt();
		    		 int yr=sc.nextInt();
		    		 double tamount=pamount*(0.07)*yr;
		    		 double amount=tamount+pamount;
		    		 System.out.println("total amount to be paid from customer :"+amount);
		    		 break;
		    		 
		    	 case 2:
		    		 System.out.println("-----compound interest-----");
		    		 break;
		    		 
		    	 }
		    	 break;
		     case 2:
		    	 System.out.println("thanks...");
		    	 return ;
		     }
			break;
		case 2:
			current c=new current();
			accept(c);
			break;
		}
		

	}

	public static void accept(Account a)
	{
		System.out.println("Enter acc no,custname,balance");
		a.setAccno(sc.nextInt());
		a.setCustname(sc.next());
		a.setBalance(sc.nextInt());
		if(a instanceof saving)
		{
			System.out.println("Enter limit ");
			saving s=(saving)a;
			
			((saving) a).setLimit(sc.nextInt());
			
			System.out.println(s);
		}
		if(a instanceof current)
		{
			System.out.println("Enter company name");
			current c=(current)a;
			((current) a).setCompanyname(sc.next());
			System.out.println(c);
		}
	}
}
