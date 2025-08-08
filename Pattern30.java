public class Pattern30 {
    public static void main(String[] args) {
        System.out.println("Enter number of rows:");
        int n = new java.util.Scanner(System.in).nextInt();
        for (int i = n; i >=1 ; i--) {
            for (int j = n; j >=1 ; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
