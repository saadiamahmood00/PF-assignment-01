import java.util.Scanner;
public class Q5
{
	public static void main(String[] args) {
	/*below program calculates the power when voltage and current are inputted*/
	Double P;
	Scanner ki= new Scanner(System.in);
	Double V,I;
	System.out.println("enter the value of voltage");
	V=ki.nextDouble();
	System.out.println("enter the value of current");
	I=ki.nextDouble();
	P=V*I;
	System.out.println("power ="+P+"W");

		
	}
}





