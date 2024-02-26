package polymorphism.ex.ex2;

public class Ex2 {
    public static void main(String[] args) {
        Transport[] transports = {new Car(),new Bicycle(), new Train()};

        for (Transport transport : transports) {
            transport.move();
        }
    }
}
