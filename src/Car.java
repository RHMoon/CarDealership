public class Car {
    
    private String brand;
    private String model;
    private String color;
    private double price;
    private boolean soldStatus;

    public Car(String brand, String model, String color, double price){
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        soldStatus = false;
    }

    @Override
    public String toString() {
        // return this.brand + " " + this.model + " " + this.color;
        return this.brand + " " + this.model + ". Sold: " + soldStatus;          
    }

    public double getPrice() {
        return this.price;
    }

    public boolean getSoldStatus() {
        return this.soldStatus;
    }

    public String getColor() {
        return this.color;
    }

    public String getModel() {
        return this.model;
    }

    public void setSoldStatus(Boolean soldStatus) {
        this.soldStatus = soldStatus;
    }
    
}
