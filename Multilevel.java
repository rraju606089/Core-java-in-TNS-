package Day05.Inheritance;

class Vehicles{
    void start(){
        System.out.println("Vehicle will start");
    }
    void stop(){
        System.out.println("Vehicle will stop");
    }
}

class Car extends Vehicles{
    int doors = 4 ;

    void fuelType(){
        System.out.println("Some power need to start");
    }
}

class EVCar extends Car{
    int batCap = 500;
    @Override
    void fuelType() {
        super.fuelType();
        System.out.println("Need Battery to start the car");
    }
}

public class Multilevel {

    public static void main(String[] args) {
        EVCar ev = new EVCar();
        ev.start();
        ev.stop();

        ev.fuelType();
    System.out.println(ev.doors);

    System.out.println(ev.batCap);
    ev.fuelType();
    
    }
}
