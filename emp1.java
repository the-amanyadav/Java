public class emp1 {
    static String cn="TCS";
    String name;
    int age;
    void get(String s1,int s2){
        s1=name;
        s2=age;
    }
    void show(){
        System.out.println(name+" "+age+" "+cn);
    }
    static int add(int a,int b){
        return a+b;
    }
    public static void main(String[]arg){
        emp1 e1= new emp1();
        emp1 e2=new emp1();
        System.out.println(e1.hashCode());
        System.out.println(e1);
        e1.name ="Ram";
        System.out.println(e1.name);
        emp1 e3 =e1; // copy refrence id
        System.out.println(e3);
        e3.name="Shyam";
        System.out.println(e1.name);
        System.out.println(e3.hashCode());
    }
}
