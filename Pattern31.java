public class Pattern31 {
    public static void main(String[] args) {
        System.out.println("Enter number of rows:");
        int n = new java.util.Scanner(System.in).nextInt();
        for (int i = 0; i <n ; i++) {
            for (int j = n+i; j >=1+i ; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
