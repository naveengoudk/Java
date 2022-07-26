public class SidesOfTriangle {
    public static void main(String[] args) {
//        System.out.println("Side-1 Side-2 Hypotenuse");
        for (int i = 0; i < 500; i++) {
            for (int j = i + 1; j < 500; j++) {
                for (int k = j + 1; k < 500; k++) {
                    if (k * k == i * i + j * j) {
                        System.out.printf("S1-%d   S2-%d   Hyp-%d", i, j, k);
                        System.out.println();
                    }
                }

            }

        }
    }
}
