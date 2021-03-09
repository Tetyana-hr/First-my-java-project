public class HW2 {
    public static void main(String[] args) {
        int a = 19;
        int b = 5;

        int rest = a % b;
        System.out.println("Addition : " + (a + b));
        System.out.println("Subtraction : " + (a - b));
        System.out.println("Multiplication : " + (a * b));
        System.out.println("Division : " + ((0.0 + a) / b));
        System.out.println("Rest : " + rest);
        if (rest == 0){
            System.out.println("The number is even !");
        } else {
            System.out.println("The number is not even !");
        }

        System.out.println("\nExtra task\n");
        System.out.println("\uD83D\uDE40\n" +
                "\u263A\n" +
                "\uD83D\uDD25\n" +
                "\uD83C\uDF0A");
    }
}
