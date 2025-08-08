public class Pattern13 {
    public static void main(String[] args) {
        System.out.println("Enter number of rows:");
        int n = new java.util.Scanner(System.in).nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
               if (i%2==0){
                   System.out.print("- ");
               }
               else  System.out.print("* ");
            }
            System.out.println();
            }
        for (int i = n-1; i >=1 ; i--) {
            for (int j = 0; j < i; j++) {
                if (i%2==0){
                    System.out.print("- ");
                }
                else  System.out.print("* ");
            }
            System.out.println();
        }
        }
}
