import transport.*;

public class Main {
    public static void main(String[] args) {
        Car AudiR8 = new Car("Audi","R8",200, BodyType.SEDAN);
        Car MercedesS63 = new Car("Mercedes","R8",120, BodyType.SEDAN);
        Car BugattiVeyron = new Car("Bugatti","Veyron",1200, BodyType.SEDAN);
        Car NissanMurano = new Car("Nissan","Murano",80, BodyType.SEDAN);

        Bus MercedesSprinter = new Bus("Mercedes","Sprinter",150, Capacity.SMALL);
        Bus MercedesV220 = new Bus("Mercedes","V220",270, Capacity.MEDIUM);
        Bus FordTransit = new Bus("Ford","Transit",245, Capacity.LARGE);
        Bus IvecoCarvin = new Bus("Iveco","Carvin",170, Capacity.MEDIUM);

        Truck MercedesArocs = new Truck("Mercedes","Arocs",476, LoadType.N1);
        Truck Fuso7C = new Truck("Fuso","7c",175, LoadType.N2);
        Truck FordCargo41 = new Truck("Ford","Cargo",420, LoadType.N1);
        Truck ManTgs = new Truck("Man","Tgs",400, LoadType.N3);

        diagnostic(AudiR8,MercedesS63,BugattiVeyron,NissanMurano, MercedesSprinter,MercedesV220,FordTransit,IvecoCarvin,MercedesArocs,Fuso7C,FordCargo41,ManTgs);

        DriverA drivera = new DriverA<>("Максим Максимович Максимов", true, 3);
        System.out.println("Водитель '" + drivera.getFio() + "' управляет автомобилем AudiR8 и будет участвовать в заезде");

        printInfo(AudiR8);
        printInfo(MercedesSprinter);
        printInfo(Fuso7C);

    }

    private static void diagnostic(Transport... transports){
        for (Transport transport : transports) {
            if (!transport.diagnostic()) {
                try{
                    throw new RuntimeException(Transport.getMark() + " " + transport.getModel() + " не прошел проверку");
                }catch (RuntimeException e){
                    System.out.println(e.getMessage());
                }
            }
        }
    }
    private static void printInfo(Transport transport){
        transport.printType();
    }
}