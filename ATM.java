import java.util.*;
class A
{    
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        ATM a=new ATM();
        System.out.print("Enter id:");
        int id=sc.nextInt();
        System.out.println();
        if(id==123456789)
        {  
            System.out.print("Enter pin:");
            int pin=sc.nextInt();
            if(pin==1234)
            {
                a.atm();
            }
            else
            {   System.out.print("Enter valid pin:");
                pin=sc.nextInt();
                if(pin==1234)
                {
                    a.atm();
                }
                else
                {
                 System.out.print("Wrong pin");  
                }
            }
        }
        else
        {
            System.out.println("Wrong id");
        }
    }
}
class ATM
{   int bal=10000;
    String s;
    int i=1;
    public void atm()
    {
       Scanner sc=new Scanner(System.in);
       StringBuffer sb=new StringBuffer();
       Date date=new Date();
       System.out.print("choose an option\n1.Transactions History\n2.Withdraw\n3.Deposit\n4.Transfer\n5.Quit\nEnter your option:");
        int c=sc.nextInt();
        while(c!=5)
        {
        switch(c)
        {
            case 1:
                Transactions_History t=new Transactions_History(sb);
                //Transactions_History();
                break;
            case 2:
                System.out.print("Enter amount to Withdraw:");
                int Q=sc.nextInt();
                if(bal>=Q && Q>=500 &&Q<=24000)
                {  
                    bal=bal-Q;
                    System.out.println("Balance in your account is "+bal);
                    s=i+"."+date.toString()+" Withdraw-"+Q+"\n";
                    i=i+1;
                    sb.append(s);
                }
                else
                    {
                        System.out.println("Insufficient Amount");
                    }
                //Withdraw();
                break;
            case 3:
                System.out.print("Enter amount to Deposit:");
                int x=sc.nextInt();
                if(x>=100)
                {
                    bal=bal+x;
                    System.out.println("Balance in your account is "+bal);
                    s=i+"."+date.toString()+" Deposit-"+x+"\n";
                    i=i+1;
                    sb.append(s);
                }
                else
                {
                    System.out.println("Insufficient Amount");
                }
               //Deposit();
               break;
            case 4:
                System.out.print("Enter person id:");
                int h=sc.nextInt();
                if(h==987654321)
                {
                    System.out.print("Enter amount to Transfer:");
                    int y=sc.nextInt();
                    if(bal>=y)
                    {
                        System.out.println("Amount Transferred ");
                        bal=bal-y;
                        s=i+"."+date.toString()+" Transferred-"+y+"\n";
                        sb.append(s);
                        i=i+1;
                    }
                    else
                    {
                        System.out.println("Insufficient Amount");
                    }
                }
                //Transfer();
                break;
            default:
            System.out.println("Please enter correct option");
        }
        System.out.print("Enter your option:");
        c=sc.nextInt();
        }
        System.out.println();
        if(c==5)
        {
            System.out.println("****Thank you****");
        }
    }
}
class Transactions_History
{
    Transactions_History(StringBuffer sb)
    {
        System.out.println(sb);
    }
}
