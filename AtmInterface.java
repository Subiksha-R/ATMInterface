import java.util.Scanner;  
public class AtmInterface
{  
    private String accno;  
    private String name;  
    private long balance;
    Scanner sc = new Scanner(System.in); 
    
    public void openAccount() 
    {  
        System.out.print("Enter Account No: ");  
        accno = sc.next();  
        System.out.print("Enter Name: ");
        name = sc.next();  
        System.out.print("Enter some amount: ");  
        balance = sc.nextLong();  
    }  
  
    public void showAccount() 
    {  
        System.out.println("\n Name of account holder: " + name);  
        System.out.println("\n Account no.: " + accno);  
        System.out.println("\n Balance: " + balance);  
    }  
     public void getBalance()
	{
		System.out.println("Balance: " + balance);
	}
     
    public void deposit() 
    {  
        long amt;  
        System.out.println("Enter the amount you want to deposit: ");  
        amt = sc.nextLong();  
        balance = balance + amt;
        System.out.println("After Deposit balance is:  "+balance);
    }  
     
    public void withdrawal() 
    {  
        long amt;  
        System.out.println("Enter the amount you want to withdraw: ");  
        amt = sc.nextLong();  
        if (balance >= amt) 
        {  
            balance = balance - amt;  
            System.out.println("Balance after withdrawal: " + balance);  
        } 
        else 
        {  
            System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!" );  
        }  
    }  
    public static void main(String arg[]) 
    {  
        Scanner sc = new Scanner(System.in);   
        System.out.println("Enter User Details ");  
        AtmInterface C = new AtmInterface(); 
        C.openAccount();
        int ch;  
        do
        {  
            System.out.println("ATM Interface Application\n ");  
            System.out.println("1. Display all account details \n 2. Deposit the amount \n 3. Withdraw the amount \n 4. Balance check\n 5.Exit ");  
            System.out.println("Enter your choice: ");  
            ch = sc.nextInt();  
                switch (ch) 
                {  
                    case 1:  
                        C.showAccount(); 
                        break;
                    case 2:  
                        C.deposit();
                        break;
                     case 3:  
                        C.withdrawal();
                        break;  
                    case 4:  
                        C.getBalance(); 
                        break;
                    case 5:  
                        System.out.println("Session Expired"); 
                        break;  
                }  
         }  
            while (ch != 5);  
     }  
    }