package transport;

public class Bus extends Transport implements Competing{

    private Capacity capacity;

    public Bus(String mark, String model, int engineVolume, Capacity capacity) {
        super(mark, model, engineVolume);
        this.capacity = capacity;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
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
        if(capacity==null){
            System.out.println("данных по авто недостаточно");
        }else{
            System.out.println("вместимость: от " + capacity.getFrom() + " чел. до " + capacity.getTo() + " чел. ");
        }
    }
}
