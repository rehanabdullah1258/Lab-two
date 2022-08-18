import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        int numberone,numbertwo,numberthree,x;
        System.out.println("enter three numbers");
        System.out.println("enter number one");
        Scanner input=new Scanner(System.in);
        numberone= input.nextInt();
        System.out.println("enter number two");
        Scanner in=new Scanner(System.in);
        numbertwo= in.nextInt();
        System.out.println("enter number three");
        Scanner inp=new Scanner(System.in);
        numberthree= inp.nextInt();
        x=numberone+numbertwo+numberthree;
        System.out.println("the average of the numbers = "+(x/3));
}}
