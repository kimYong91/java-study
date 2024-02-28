package polymorphism.interface0.car.OOP_원칙_전;

public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver();


        Avante avante = new Avante();
        driver.setAvante(avante);
        driver.drive();

        driver.setAvante(null);

        Sonata sonata = new Sonata();
        driver.setSonata(sonata);
        driver.drive();
    }
}
