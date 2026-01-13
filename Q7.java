import java.util.Scanner;
public class Q7
{
	public static void main(String[] args) {
	//below program determines wheater the inputted number is even or odd number.
	int num;
	Scanner ki= new Scanner(System.in);
	System.out.println("Enter your number");
	num=ki.nextInt();
	if(num%2==0)
	{
	    System.out.println("even number");
	}
	else 
	{
	    System.out.println("odd number");
	}
	}
}

