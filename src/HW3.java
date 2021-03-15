public class HW3 {
    public static void main(String[] args) {
//  Task1
        System.out.println("Task1\n");
        int a = 51;
        int b = 20;

        if (a == b) {
            System.out.println("Variables are equal");
        } else if (a < b) {
            System.out.println("Variable a is less than b");
        } else {
            System.out.println("Variable a is greater than b");
        };

// Task2
        System.out.println("\nTask2\n");
        int sum = a + b;
        if ( sum % 2 == 0) {
            System.out.println("Maybe a and b are even");
        } else {
            System.out.println("Some variable is odd");
        };

//  Task 3
//        int a = 50;
        System.out.println("\nTask3\n");
        if ( a > 10 ) {
            System.out.println("Variable a is greater than 10");
        } else {
            System.out.println("Variable a is less than 10");
        };
        if ( a < 100 ){
            System.out.println("Variable a is less than 100");
        } else {
            System.out.println("Variable a is greater than 100");
        };

        double division = 1.0 * a/2;
        if ( division > 20 ){
            System.out.println("Result of division a is > 20 and = " + (division));
        } else {
            System.out.println("Result of division a is < 20");
        };
        if ( a >= 5 && a <= 40){
            System.out.println("Variable a is " + (a) );
        } else {
            System.out.println("Variable a is " + (a) );
        };




    };
};

