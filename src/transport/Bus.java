package transport;

public class Bus extends Transport implements competing{


    public Bus(String mark, String model, int engineVolume) {
        super(mark, model, engineVolume);
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
}
