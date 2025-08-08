public class Pattern25 {
    public static void main(String[] args) {
        System.out.println("Enter number of rows:");
        int n = new java.util.Scanner(System.in).nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n+i-1 ; j++) {
                System.out.print(j);}
            System.out.println();
        }
    }
}
