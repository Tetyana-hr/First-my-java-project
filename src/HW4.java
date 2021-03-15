public class HW4 {
    public static void main(String[] args) {
//        Task1
        System.out.println("Task1");
        for(int i = 0; i < 16; i++){
            System.out.println(i);
        }
//        Task2
        System.out.println("\nTask2\n");
        int num = 5; // Возводимое в степень число
        int res = num; // Результат возведения в степень
        int step = 1; // Начальный показатель степени

        while(res < 10000){
            System.out.println(num + " в степени " + step + " = " + res);
            step++;
            res = res * num;
        }
//        Task3
        System.out.println("\nTask3\n");

        for(int i = 40; i < 61; i++){
            if (i % 4 == 0){
                System.out.println(i);
            }
        }
        System.out.println("\nTask3_2\n");

        for(int i = 40; i < 61;i++){
            while (i % 4 == 0) {
                System.out.println(i);
                break;
            };
        };

        System.out.println("\nADD_TASK1\n");
        int len = 10;
        for (int i = 0 ; i < 10 ; i++){
            System.out.println();
            for( int j = 0; j < len ; j++){
                System.out.print(j);
            }
            len = len - 1;
        };

        System.out.println("\nADD_TASK2\n");
        int len1 = 10;
        int spaceEnd = 1;
        for (int i = 0 ; i < 10 ; i++){
            int spaceStart = 0;
            System.out.println();
            while (spaceStart < spaceEnd) {
                System.out.print(" ");
                spaceStart = spaceStart + 1;
            }
            for( int j = 0; j < len1 ; j++){
                System.out.print(j);
            }
            len1 = len1 - 1;
            spaceEnd = spaceEnd + 1;

        };

        System.out.println("\nADD_TASK3\n");
        int spEnd = 1;
        int leng = 10;
        int len2 = 1;
        int j = 9;
        for (int i = 0 ; i < 10 ; i++){
            int spStart = 0;
            System.out.println();
            while (spStart < spEnd) {
                System.out.print(" ");
                spStart = spStart + 1;
            }
                int statJ = j;
                for(; j >= len2 ; j--){
                     System.out.print(j);
                };


                for (int k = 0; k < leng; k++) {
                        System.out.print(k);
                };
            j = statJ - 1;

            leng = leng - 1;
            spEnd = spEnd + 1;
        };
    }

}

