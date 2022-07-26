public class Pattern {
    static void pattern(int Spaces, int hipens) {
        while (hipens < 12) {
            for (int i = 0; i < Spaces; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < hipens; i++) {
                System.out.print("-");
            }
            for (int i = 0; i < Spaces; i++) {
                System.out.print(" ");
            }
            Spaces -= 1;
            hipens += 2;
            System.out.println();

        }

        Spaces += 2;
        hipens -= 4;

        while (Spaces < 5) {
            for (int i = 0; i < Spaces; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < hipens; i++) {
                System.out.print("-");
            }
            for (int i = 0; i < Spaces; i++) {
                System.out.print(" ");
            }
            Spaces += 1;
            hipens -= 2;
            System.out.println();

        }

    }

    public static void main(String[] args) {
        int Spaces = 4;
        int hipens = 2;
        pattern(Spaces, hipens);

    }
}
