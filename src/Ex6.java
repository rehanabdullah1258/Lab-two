public class Ex6 {
    public static void main(String[] args) {
        String s="hello";
        String t="world";
        int x;
        x=s.length()+t.length();
        System.out.println(x);
        System.out.println(s.substring(1,2));
        System.out.println(s.substring(s.length()/2,s.length()));
        System.out.println(s+t);
        System.out.println(t+s);
    }
}
