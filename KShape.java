class KShape{
	public static void main(String[]arg){
	int n=5;
	for (int i=1;i<=n;i++){
		for(int s=1;s<=n-i;s++){
			System.out.print("*");
		}
		System.out.println();
	}
	for (int i=2;i<=n;i++){
			for(int s=1;s<=i;s++){
			System.out.print("*");
		}
	System.out.println();}
}
}