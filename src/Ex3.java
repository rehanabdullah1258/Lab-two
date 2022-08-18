
    import java.util.Scanner;
    public class Ex3 {
        public static void main(String[] args) {
            double length,width,area ,perimeter;

            System.out.println("enter the length of the rectangle");
            Scanner input=new Scanner(System.in);
            length=input.nextInt();
            System.out.println("enter the width of the rectangle");
            Scanner in=new Scanner(System.in);
            width=in.nextInt();
            area=(length*width);
            perimeter=(2*length*width);
            System.out.println("rectangle area="+area);
            System.out.println("rectangle perimeter="+perimeter);

        }}
