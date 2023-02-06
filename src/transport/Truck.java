package transport;

public class Truck extends Transport implements Competing{

    private LoadType loadType;

    public Truck(String mark, String model, int engineVolume, transport.LoadType loadType) {
        super(mark, model, engineVolume);
        this.loadType = loadType;
    }

    public transport.LoadType getLoadType() {
        return loadType;
    }

    public void setLoadType(transport.LoadType loadType) {
        this.loadType = loadType;
    }

    public void startMoving() {
        System.out.println("начинаю движение");
    }


    public void stopMoving() {
        System.out.println("начинаю движение");
    }

    @Override
    public void pitStop() {
        System.out.println("делаю питстоп");
    }

    @Override
    public void bestLoopTime() {
        System.out.println("лучшее время круга: ");
    }

    @Override
    public void maxSpeed() {
        System.out.println("максимальная скорость: ");
    }


    @Override
    public void printType() {
        if(loadType==null){
            System.out.println("данных по авто недостаточно");
        }else{
            String from = loadType.getFrom() == null ? "" : "от " + loadType.getFrom() + " т. ";
            String to = loadType.getTo() == null ? "" : "до " + loadType.getTo() + " т. ";
            System.out.println("грузоподъемность: " + from + to);
        }
    }
}
