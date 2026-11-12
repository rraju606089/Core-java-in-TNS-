package Day04;

public class Methos{
    
    public static void add(int a , int b){
        System.out.println(a + b);
    }

    public static int sum(int a , int b){
        return a + b;
    }

    public static int mul(int a , int b){
        return 2 * 3;
    }

    public static void dev(){
        System.out.println(10/2);
    }

    public static void main(String[] args) {
        add(2,5);
        System.out.println(sum(2,5));
        dev();

    }
}


