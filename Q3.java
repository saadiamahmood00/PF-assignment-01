import java.util.Scanner;
public class Q3
{
	public static void main(String[] args) {
	//below program calculates the discounted selling price
	Double dsp;
	Scanner read= new Scanner(System.in);
	Double csp,dis,dp;
	System.out.println("enter the current selling price");
	csp=read.nextDouble();
	System.out.println("enter the discount percentage");
	dp=read.nextDouble();
	dis=dp*csp/100;
	dsp=csp-dis;
	System.out.println("the discounted selling price is Rs"+ dsp);

		
	}
}
