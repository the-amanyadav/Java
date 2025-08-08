public class Pattern28 {
    public static void main(String[] args) {
        System.out.println("Enter number of rows:");
        int n = new java.util.Scanner(System.in).nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i ; j++) {
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
