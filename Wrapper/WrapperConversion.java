public class WrapperConversion {
    public static void main(String[] args) {
        int i = Integer.parseInt(args[0]);
        System.out.println(i);

        String  a = Integer.toBinaryString(i);
        String  b = Integer.toOctalString(i);
        String  c = Integer.toHexString(i);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
    
}