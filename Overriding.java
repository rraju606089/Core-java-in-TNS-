package Day03;

class Learing {
    public void course(){
        System.out.println("only Recorde Video");
    }
}

class learingV2 extends Learing {
    public void course(){
        super.course();
        System.out.println("also live session");
    }
}

public class Overriding {
    public static void main(String[] args) {
        learingV2 v2=new learingV2();
        v2.course();
    }
    
}
