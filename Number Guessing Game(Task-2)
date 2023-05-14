import java.lang.*;
import java.util.*;
class A
{
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int num=(int)(100*Math.random());
        int gus,i;
        System.out.println("Start the game \n->You have 3 attempts ");
        System.out.println("Select any number from 1 to 100");
        for(i=1;i<=3;i++)
        {  
            System.out.println("Attempt "+i);
            gus=sc.nextInt();
            if (gus==num)
            {
                System.out.println("You win");
                break;
            }
            else
            {
                if (gus<num && i!=3)
                {
                    System.out.println("Guess greater than "+gus);
                }
                else if(gus>num && i !=3)
                {
                    System.out.println("Guess low than "+gus);
                }
               
            }
            }
            if (i==4)
            {
                System.out.println("Try again");
                System.out.println("The number is "+num);
            }
        }
    }
