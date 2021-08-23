public class Main {
    public static void main(String[] args) {
        Engine eng1 = new Engine("BMW", 560, 150, 12, true);
        Engine eng2 = eng1.clone();

        System.out.println(eng1);
        System.out.println(eng2);
        eng2.setManufacturer("Nissan");
        System.out.println();
        System.out.println(eng1);
        System.out.println(eng2);
        System.out.println();

        Car car1 = new Car("BMW", eng1, "Red", 25000, 1300);
        Car car2 = car1.clone();

        System.out.println(car1);
        System.out.println(car2);
        car2.getEngine().setDiesel(false);
        System.out.println();
        System.out.println(car1);
        System.out.println(car2);
    }
}
