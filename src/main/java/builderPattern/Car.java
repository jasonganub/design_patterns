package builderPattern;

// Car class
public class Car {
    private int seats;
    private String color;
    private String make;

    public Car() {}

    public String getColor() {
        return color;
    }

    public void setColor(final String color) {
        this.color = color;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(final int seats) {
        this.seats = seats;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String toString() {
        return "Car [seats= " + this.getSeats() + ", color = " + this.getColor() + ", make = " + this.getMake() + "]";
    }
}

// Builder abstraction interface
interface CarBuilder {
    Car build();

    CarBuilder setColor(final String color);
    CarBuilder setSeats(final int seats);
    CarBuilder setMake(final String make);
}

// Builder implementation
class CarBuilderImpl implements CarBuilder {

    private Car car;

    public CarBuilderImpl() {
        car = new Car();
        car.setColor("silver");
        car.setSeats(5);
        car.setMake("Toyota");
    }

    @Override
    public Car build() {
        return car;
    }

    @Override
    public CarBuilder setColor(String color) {
        car.setColor(color);
        return this;
    }

    @Override
    public CarBuilder setSeats(int seats) {
        car.setSeats(seats);
        return this;
    }

    @Override
    public CarBuilder setMake(String make) {
        car.setMake(make);
        return this;
    }
}
