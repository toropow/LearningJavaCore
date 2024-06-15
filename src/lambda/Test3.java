package lambda;

import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.function.Consumer;

public class Test3 {
    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier) {
        ArrayList<Car> a1 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            a1.add(carSupplier.get());
        }
        return a1;

    }

    public static void changeCar(Car car, Consumer<Car> carConsumer) {
        carConsumer.accept(car);
    }

    public static void main(String[] args) {
        ArrayList<Car> ourCars = createThreeCars(() -> new Car("Nissan Tiida", "Silver Metalic", 1.6));
        System.out.println("Ours cars: " + ourCars);

        changeCar(ourCars.get(1),
                car -> {
                    car.color = "red";
                    car.Engine = 2.4;
                    System.out.println("upgraded car: " + car);
                });

        System.out.println(ourCars);
    }


}

class Car {
    String model;
    String color;
    double Engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        Engine = engine;
    }

    @Override
    public String toString() {
        return "This is car. Model" + this.model + " color " + this.color + " with engine volume " + this.Engine;
    }
}
