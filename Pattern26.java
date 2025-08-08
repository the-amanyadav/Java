import java.util.Scanner;

public class Pattern26 {
    public static void main(String[] args) throws java.io.IOException {
        char input,alpha='A';
        System.out.println("Enter uppercase character to print in last line:");
        Scanner sc=new Scanner(System.in);
        int x=System.in.read();
        input=(char) x;
        for (int i = 'A'; i <=(input -'A'+1) ; i++) {
            for (int j = 'A'; j <= (input -'A'+1) ; j++) {
                System.out.print(alpha +" ");
            }
            System.out.println();
        }


    }
}
