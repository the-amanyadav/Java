public class Pattern7 {
    public static void main(String[] args) {
        System.out.println("Enter number of rows:");
        int n = new java.util.Scanner(System.in).nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n-i; j >= 1; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                if (j==1 || j==2*i-1  || i==n){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
