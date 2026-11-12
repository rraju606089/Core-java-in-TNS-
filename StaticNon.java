package Day04;

public class StaticNon {
    int a = 10 ; // Non Static
    static int b = 20 ; // Static only 

    public static void add(){
        System.out.println(b);
    }

    public void sum(){
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        add();
        new StaticNon().sum();
    }
}
