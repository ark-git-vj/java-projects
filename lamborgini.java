class Car {
    int carId;
    String carColor;
    String carModel;

    Car(int carId, String carColor, String carModal ) {
        this.carId = carId;
        this.carColor = carColor ;
        this.carModel = carModal ;
        System.out.println("A new car created in memory");
    }

    void printCarInfo()  {
        System.out.println(this.carId);
        System.out.println(this.carColor);
        System.out.println(this.carModel);
    }
}

public class lamborgini {


    public static void main (String []args){
        Car lamborgini =new Car(1, "Green", "8000");
        lamborgini.printCarInfo();
    }
    
}
