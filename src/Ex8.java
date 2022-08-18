import java.util.Scanner;
public class Ex8 {
    public static void main(String[] args) {
        double number;
        double x,y;
        System.out.println("enter number:");
        Scanner input=new Scanner(System.in);
        number= input.nextInt();
        x=number*number;
        y=number*number*number;
        System.out.println("the square of number ="+x);
        System.out.println("the cube of number ="+y);
        System.out.println("the fourth of number ="+Math.pow(number,4));
    }
}
