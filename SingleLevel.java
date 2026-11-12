package Day05.Inheritance;


class Vehicle{
    void start(){
        System.out.println("vrhicle will be clear");
    }

    void show(){
        System.out.println("show the details car Vehicle");
    }

    void stop(){
        System.out.println("Vehicle stop");

    }
}

class BMWCar extends Vehicle{
    @Override
    void start() {
        super.start();
        System.out.println("Play Musics and open rooft");
    }

}

public class SingleLevel {

    public static void main(String[] args) {
        BMWCar bmw = new BMWCar();
        bmw.start();
        bmw.show();
        bmw.stop();
    }   
}
