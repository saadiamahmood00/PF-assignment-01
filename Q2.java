
import java.util.Scanner;
public class Q2
{
	public static void main(String[] args) {
	//below program calculates the area and circumference of circle
	Double R;
	Double A,C;
	Scanner read= new Scanner(System.in);
	System.out.println("enter the value of radius of the circle");
	R=read.nextDouble();
	A=3.14*R*R;
	System.out.println("Area of the circle is="+ A+"m^2");
	C=2*3.14*R;
	System.out.println("Circumference of the circle is"+ C+"m");
	

		
	}
}