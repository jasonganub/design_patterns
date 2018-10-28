package builderPattern;

public class main {

    public static void main(String[] args) {

        // Car with parameters
        System.out.println("Car with all parameters");
        Car car = new CarBuilderImpl()
                .setColor("red")
                .setSeats(2)
                .setMake("Ferrari")
                .build();

        System.out.println(car + "\n");

        // Car with no parameters
        System.out.println("Car with no parameters");
        Car car2 = new CarBuilderImpl()
                .build();

        System.out.println(car2);
    }
}
