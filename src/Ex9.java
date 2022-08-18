import java.util.Scanner;
public class Ex9 {
    public static void main(String[] args) {
        int number1,number2,x,y,z,s,t,o;
        System.out.println("enter two number:");
        Scanner input=new Scanner(System.in);
        number1=input.nextInt();
        Scanner inp=new Scanner(System.in);
        number2=inp.nextInt();
        s=number1+number2;
        y=number1-number2;
        z=number1*number2;
        x=number1+number2/2;
        t=Math.abs(y);
        System.out.println("the sum ="+s);
        System.out.println("the difference ="+y);
        System.out.println("the product ="+z);
        System.out.println("the average ="+x);
        System.out.println("the distance ="+t);
        System.out.println("the maximum ="+Math.max(number1,number2));
        System.out.println("the minmum ="+Math.min(number1,number2));


    }
}
