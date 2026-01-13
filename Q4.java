import java.util.Scanner;
public class Q4
{
	public static void main(String[] args) {
	/*below program calculates the current selling price when discount selling price and 
	discount percentage is entered by user*/
	Double dsp;
	Scanner read= new Scanner(System.in);
	Double csp,dis,dp;
	System.out.println("enter the discount selling price");
	dsp=read.nextDouble();
	System.out.println("enter the discount percentage");
	dp=read.nextDouble();
	
	csp=dsp/(1-dp/100);
	System.out.println("the current selling price is Rs"+ csp);

		
	}
}

