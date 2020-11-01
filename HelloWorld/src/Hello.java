public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello World! Hi Osman");

        int myFirstNumber = 5;
        System.out.println(myFirstNumber);

        byte b1 = 3;
        short s1 = 10000;
        long l1 = 1000;
//        Small changes
        int myTotal = (myFirstNumber / 2);
        byte myNewByte = (byte) (myTotal / 2);
        long myLong = 5000L + 10L * (myNewByte + myTotal);
        System.out.println(myLong);
        int first = s1;
        System.out.println(first);

        float num1 = 5.25f;
        double num2 = 5.25d;
    }
}
