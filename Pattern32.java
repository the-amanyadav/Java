public class Pattern32 {
    public static void main(String[] args) {
        System.out.println("Enter number of rows:");
        int n = new java.util.Scanner(System.in).nextInt();
        for (int i = n; i >=1 ; i--) {
            for (int j = n; j >=1 ; j--) {
                if ((i+j)%2==0)
                System.out.print("1");
                else System.out.print("0");
            }
            System.out.println();
        }
    }
}
