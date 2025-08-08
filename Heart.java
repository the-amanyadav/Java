class Heart{
public static void main(String[]arg){
	int n=new java.util.Scanner(System.in).nextInt();
	for(int i=n/2;i<=n;i+=2){
	for(int s=1;s<=n-i-1;s+=2){
		System.out.print(" ");
	}
	for(int j=1;j<=i;j++){
		System.out.print("*");
	}
	for(int s=1;s<=n-i;s++){
		System.out.print(" ");
	}
	for(int j=1;j<=i;j++){
		System.out.print("*");
	}
	System.out.println();
	}
	for(int i=n;i>=1;i--){
		for(int j=1;j<=n-i;j++){
			System.out.print(" ");
		}
		for(int j=1;j<=2*i-1;j++){
			System.out.print("*");
		}
		System.out.println();
	}
}
}