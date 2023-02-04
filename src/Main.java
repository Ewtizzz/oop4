import transport.Bus;
import transport.Car;
import transport.Truck;

public class Main {
    public static void main(String[] args) {
        Car AudiR8 = new Car("Audi","R8",200);
        Car MercedesS63 = new Car("Mercedes","R8",120);
        Car BugattiVeyron = new Car("Bugatti","Veyron",1200);
        Car NissanMurano = new Car("Nissan","Murano",80);

        Bus MercedesSprinter = new Bus("Mercedes","Sprinter",150);
        Bus MercedesV220 = new Bus("Mercedes","V220",270);
        Bus FordTransit = new Bus("Ford","Transit",245);
        Bus IvecoCarvin = new Bus("Iveco","Carvin",170);

        Truck MercedesArocs = new Truck("Mercedes","Arocs",476);
        Truck Fuso7C = new Truck("Fuso","7c",175);
        Truck FordCargo41 = new Truck("Ford","Cargo",420);
        Truck ManTgs = new Truck("Man","Tgs",400);

        DriverA drivera = new DriverA<>("Максим Максимович Максимов", true, 3);
        System.out.println("Водитель '" + drivera.getFio() + "' управляет автомобилем AudiR8 и будет участвовать в заезде");
    }
}