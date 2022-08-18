import java.sql.SQLOutput;
import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        double radius,area,perimeter;
        System.out.println("enter the radius of the circle");
        Scanner input=new Scanner(System.in);
        radius=input.nextInt();
        area=(Math.pow(radius,2)*Math.PI);
        perimeter=(2*Math.PI);
        System.out.println("circle area="+area);
        System.out.println("circle perimeter="+perimeter);
    }
}
