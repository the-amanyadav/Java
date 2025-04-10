public class emp {
    static String cn ="TCS";
    String name;
    int salary;
   void get(String s1, int s2){
       name=s1;
       salary=s2;
    }
   void show(){
       System.out.println(name+" "+salary+" "+cn);
   }
   static int add(int a , int b){
       return a+b;
   }
   public static void main(String[]args){
       System.out.println(cn);
       emp e1 = new emp();
       e1.get("Aman yadav",900000000);
       e1.show();
       emp e2 =new emp();
       e2.get("Chandan Yadav",999999999);
       e2.show();
      int z= add(100,10);
      System.out.println(z);
       System.out.println(emp.cn);
       int s= emp.add(100,10);
       System.out.println(s);
       System.out.println(e1+"  "+e2);
       System.out.println(e1.hashCode()+"   \n"+e2.hashCode());
       demo.aman();
   }
}
class demo{
    public static void aman(){
        emp s2=new emp();
        System.out.println(s2 +"  "+s2.hashCode());
        s2.get("Satya",900000000);
        s2.show();
        System.out.println(emp.cn);
        int y=emp.add(10,10);
        System.out.println("This is main methode 2 in demo class.");
    }
}
