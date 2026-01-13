import java.util.Scanner;
public class Q6

{
	public static void main(String[] args) {
	/*below program calculates the area of trapezium when the lengths of parallel sides and height
	are inputted*/
	Double a,b,h,k;
	Scanner ki= new Scanner(System.in);
	System.out.println("enter length no.1 and length no.2 of parallel sides");
	a=ki.nextDouble();
	b=ki.nextDouble();
	System.out.println("enter the height of trapezium");
	h=ki.nextDouble();
	k= h * (a + b)/2;
	System.out.println("the area of trapezium is"+k+" m^2");

		
	}
}
