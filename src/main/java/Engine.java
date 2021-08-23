public class Engine implements Cloneable {
    private String manufacturer;
    private double weight;
    private double power;
    private double maxCO;
    private boolean isDiesel;

    public Engine() { //please don't remove this constructor!
    }

    public Engine(String manufacturer, double weight, double power,
                  double maxCO, boolean isDiesel) {
        this.manufacturer = manufacturer;
        this.weight = weight;
        this.power = power;
        this.maxCO = maxCO;
        this.isDiesel = isDiesel;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getMaxCO() {
        return maxCO;
    }

    public void setMaxCO(double maxCO) {
        this.maxCO = maxCO;
    }

    public boolean isDiesel() {
        return isDiesel;
    }

    public void setDiesel(boolean diesel) {
        isDiesel = diesel;
    }

    @Override
    public String toString() {
        return "Engine{"
                + "manufacturer='" + manufacturer + '\''
                + ", weight=" + weight
                + ", power=" + power
                + ", maxCO=" + maxCO
                + ", isDiesel=" + isDiesel
                + '}';
    }

    @Override
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't clone Engine class", e);
        }
    }
}
