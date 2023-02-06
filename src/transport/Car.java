package transport;

public class Car extends Transport implements Competing{
    private BodyType bodyType;

    public Car(String mark, String model, int engineVolume,BodyType bodyType) {
        super(mark, model, engineVolume);
        this.bodyType = bodyType;
    }

    public transport.BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(transport.BodyType bodyType) {
        this.bodyType = bodyType;
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
        if(bodyType==null){
            System.out.println("данных по авто недостаточно");
        }else{
            System.out.println("тип кузова: " + bodyType);
        }
    }
}
