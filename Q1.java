
 import java.util.Scanner;
public class Q1 {
  

    public static void main(String[]agrs) {
        double P;
        Scanner read=new Scanner(System.in);
        double SOM,MM;
        //SOM=sum of obtained marks
        //MM=maximum marks
        //P=percentage
        System.out.println("enter the sum of obtained marks");
        SOM=read.nextDouble();
        System.out.println("enter maximium marks");
        MM=read.nextDouble();
        P=SOM/MM *100;
        System.out.println("percentage ="+P+"%");


    }
    
}
