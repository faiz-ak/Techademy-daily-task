public class EvenSkip10Num {
        public static void main(String[] args) {
        System.out.println("Even numbers from 1 to 100 (excluding multiples of 10):");

        for (int i = 1; i <= 100; i++) {
            if (i%2 == 0 && i%10 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}

