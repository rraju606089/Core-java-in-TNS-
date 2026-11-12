package Day05.Inheritance;

class Animal{
    void sound(){
        System.out.println("anima has some sound");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("bow bow");
    }
}

class Cat extends Animal{
    void sound(){
        System.out.println("mewo mewo");
    }
}

public class Heirachi {

    public static void sounds(Animal a){
        a.sound();
    }

    public  static void main(String[] args){

        sounds(new Cat());
        sounds(new Dog());

    }
    
}
