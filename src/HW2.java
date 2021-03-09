public class HW2 {
    public static void main(String[] args) {
        int a = 19;
        int b = 6;

        System.out.println("Addition : " + (a + b));
        System.out.println("Subtraction : " + (a - b));
        System.out.println("Multiplication : " + (a * b));
        System.out.println("Division : " + ((0.0 + a) / b));
        System.out.println("Rest : " + (a % b));

        if ((a % 2) == 0){
            System.out.println("The number a is even !");
        } else {
            System.out.println("The number a is not even !");
        }

        if ((b % 2) == 0){
            System.out.println("The number b is even !");
        } else {
            System.out.println("The number b is not even !");
        }

        System.out.println("\nExtra task\n");
        System.out.println("\uD83D\uDE40\n" +
                "\u263A\n" +
                "\uD83D\uDD25\n" +
                "\uD83C\uDF0A");
    }
}
