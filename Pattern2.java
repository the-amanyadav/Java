public class Pattern2 {
    public static void main(String[] args) {
int sp,x=1,n;
System.out.print("Enter size:");
        n = new java.util.Scanner(System.in).nextInt();
        sp=n/2;
        if (n>=5 &&  n%2!=0){
            for (int i = 0; i < n/2+1; i++) {
                for (int j = 0; j < sp-i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < x; j++) {
                    System.out.print("*");
                }
                x+=2;
                System.out.println();
            }
            sp=n-2;
            for (int i = 0; i < n/2+1; i++) {
                System.out.print("@");
                for (int j = 0; j < sp; j++) {
                    System.out.print(" ");
                }
                System.out.print("@");
                System.out.println();
            }
            x=1;
            sp=1;
            for (int i = 0; i < n/2; i++) {
                System.out.print("@");
                for (int j = 0; j < n/2-sp; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < x; j++) {
                    System.out.print("*");
                }
                for (int j = 0; j < n/2-sp; j++) {
                    System.out.print(" ");
                }
                System.out.print("@");
                System.out.println();
                x+=2;
                sp++;
            }
            for (int i = 0; i < x; i++) {
                System.out.print("*");
            }
        }
        else {
            System.out.print("Invalid Input");
        }
    }
}
