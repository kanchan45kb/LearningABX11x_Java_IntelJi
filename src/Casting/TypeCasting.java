package Casting;

public class TypeCasting {
    public static void main(String[] args) {
        //widening casting
        byte a = 10;
        int b = a;
        System.out.println(b); // Widening Implicit
        byte x = 20;
        int y =(int) x;
        System.out.println(y); // Explicit Widening
        // Narrowing casting
        int m = 200;
        byte n = (byte) m; // It convert 200 nunber into Binary and then collect only 8 bits from all digits.
        System.out.println("It convert 200 nunber into Binary and then collect only 8 bits from all digits.");
        System.out.println("Implicit Narrowing is not working need to use Explicit narrowing casting only");
        System.out.println(n); // Implicit Narrowing is not working need to use Explicit narrowing casting only.
         long z = 1000;
         byte l = (byte)z;
         System.out.println(l);

    }
}
