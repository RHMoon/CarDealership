import java.util.ArrayList;
// import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        // define object car and its properties.
        Car avanza = new Car("Toyota", "Avanza", "Black", 10000);
        Car innova = new Car("Toyota", "Inova", "Black", 50000);

        // add define Car object into array carlist
        List<Car> carlist = new ArrayList<Car>(); // case of ArrayList
        carlist.add(avanza);
        carlist.add(innova);

        // define the car dealer name and assign the car list
        CarDealer farrasShowroom = new CarDealer("Farras Showroom", carlist);

        // sold out case
        farrasShowroom.purchaseCar("Avanza");
        try {
            farrasShowroom.purchaseCar("Avanza");
        } catch (CarIsSoldException exception) {
            System.out.println(exception);
        }

        List<Car> streamlist= farrasShowroom.getCarlist().stream()
            .filter(currentCar -> currentCar.getSoldStatus())
            .collect(Collectors.toList());

        System.out.println("");
        System.out.println("------------------------------------------------");
        System.out.println("");

        System.out.println("List of sold out Car");
        
        for(Car currentCar : streamlist){
            System.out.println(currentCar);
        }

        // not exist case
        System.out.println("");
        try {
            farrasShowroom.purchaseCar("Mazda");
        } catch (CarIsNotExistException exception) {
            System.out.println(exception);
        }
        
    }
}
