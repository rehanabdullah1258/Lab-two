public class Ex10 {
    public static void main(String[] args) {
        int number1=25;
        int number2=20;
        int s,d,p,a,b;
        s=number1+number2;
        d=number2-number1;
        p=number1*number2;
        a=s/2;
        b=Math.abs(d);
        System.out.println("the sum ="+s);
        System.out.println("the difference ="+d);
        System.out.println("the product ="+p);
        System.out.println("the average ="+a);
        System.out.println("the distance ="+b);
        System.out.println("the maximum ="+Math.max(number1,number2));
        System.out.println("the minimum ="+Math.min(number1,number2));
    }
}
