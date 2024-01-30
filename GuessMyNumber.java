import java.util.*;
public class GuessMyNumber
{
   public static void main(String[] args)
   {
   Scanner s = new Scanner(System.in); //name scanner s
       System.out.println("Enter n: ");
       int n = s.nextInt();  // user input n 
       while(n<=0) // set user to input a positive integer to begin
       {
       System.out.println("Enter a positive integer for n: ");
       n = s.nextInt();
       }
       System.out.println("Welcome to Guess My Number!");
       System.out.println("Please think of a number between 0 and "+(n-1)+".");// set parameters to what user guesses get to half of their answer
       int low=0,high=n-1;
       String c;
       int guess;
       do
       {
       guess = (int)Math.ceil(((low+high)/2)+0.5);// rounds number up and returns it
       System.out.println("Is your number: "+guess+"?");
       System.out.println("Please enter C for correct, H for too high, or L for too low.");
       System.out.println("Enter your response (H/L/C): ");
       c=s.next();
       while(!(c.equals("H")||c.equals("L")||c.equals("C")))
       {
       s.next();
       System.out.println("Enter your response (H/L/C): ");
       c=s.next();      
       }
       if(c.equals("H"))
       {
       high=(low+high)/2;// if too high it will divide by 2
       }
       else if(c.equals("L"))
       {
       low=(low+high)/2;// if too low it 
       }
       }while(!c.equals("C")&guess!=0&guess!=n-1); //if correct guess C ends game
       System.out.println("Thank you for playing Guess My Number!");
   }
}