import java.util.ArrayList;

public class CarDealer{
    private String name;
    private ArrayList<Car> carList;

    public CarDealer(String name,ArrayList<Car> carList){
        this.name = name;
        this.carList=carList;
    }

    // public void sell(Car car) throws CarIsSoldException{
    //     this.carlist = this.carlist.stream()
    //       .map(currentCar ->{
    //           if (car.equals(currentCar) && currentCar.getSoldStatus()) { 
    //           }
    //       }).Collectors;
    // }

    public void purchaseCar(Car car) throws CarIsSoldException,CarIsNotExistException{
        this.carList = this.carList.stream()
        .map(currentCar ->{
            if(car.equals(currentCar)&&currentCar.getSoldStatus()){
                throw new CarIsSoldException(car.getModel() 
                          + " is already soldout!"
                          + "\r\n");
            }
            if(car.equals(currentCar)){
                currentCar.setSoldStatus(true);
                System.out.println("Thank you for purchasing "+car.getModel());
            }
            return currentCar;
        })
        .collect(Collectors.toList());
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Car> getCarlist() {
        return carList;
    }
    
}
