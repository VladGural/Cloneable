public class Car implements Cloneable {
    private String manufacturer;
    private Engine engine;
    private String color;
    private double price;
    private double weight;

    public Car() { //please don't remove this constructor!
    }

    public Car(String manufacturer, Engine engine, String color, double price, double weight) {
        this.manufacturer = manufacturer;
        this.engine = engine;
        this.color = color;
        this.price = price;
        this.weight = weight;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Car{"
                + "manufacturer='" + manufacturer + '\''
                + ", engine=" + engine
                + ", color='" + color + '\''
                + ", price=" + price
                + ", weight=" + weight
                + '}';
    }

    @Override
   public Car clone() {
        try {
            Car clonedCar = (Car) super.clone();
            clonedCar.setEngine(engine.clone());
            return clonedCar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't clone Car class", e);
        }
    }
}
