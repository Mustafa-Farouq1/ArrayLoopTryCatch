public class Main {
    public static void main(String[] args) {

        int[] arg = {1, 5, 6, 81, 55};
        int X = 0;

        try {
            while (X <= arg.length) {

                System.out.println(arg[X]);
                X++;
            }
        } catch (Exception Z) {
            String err = Z.getMessage();
            System.out.println(err);
        }
    }
}