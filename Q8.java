
import java.util.Scanner;
public class Q8
{
	public static void main(String[] args) {
	//below program calculate the area of triangle using heron's formula.
	Double a,b,c,A,s,d;
	Scanner ki= new Scanner(System.in);
	System.out.println("enter the length no.1 of the three sides of triangle");
	a=ki.nextDouble();
	System.out.println("enter the length no.2 of the three sides of triangle");
	b=ki.nextDouble();
	System.out.println("enter the length no.3 of the three sides of triangle");
	c=ki.nextDouble();
	s=(a+b+c)/2;
	System.out.println("semi perameter is"+s+"m");
	A= Math.sqrt((s-a)*(s-b)*(s-c));
	System.out.println("the area of trapezium is"+A+" m^2");
	
}
}
