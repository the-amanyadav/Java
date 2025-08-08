public class Pattern10 {
    public static void main(String[] args) {
        System.out.println("Enter number of rows:");
        int n = new java.util.Scanner(System.in).nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= n-i; j++) {
                System.out.print(j+i+" ");
            }
            System.out.println();
        }
        int c=1;
        for (int i = n; i >=2 ; i--,c++) {

            for (int j = 1; j <=i-1 ; j++) {
                System.out.print(" ");
            }
            for (int j = n-c; j <= n; j++) {
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }
}
