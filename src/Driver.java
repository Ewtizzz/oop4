public class Driver {
    public String fio;
    public boolean haveDriverLicence;
    public int experience;

    public Driver(String fio, boolean haveDriverLicence, int experience) {
        this.fio = fio;
        this.haveDriverLicence = haveDriverLicence;
        this.experience = experience;
    }

    void startMoving(){
        System.out.println("начинаю движение");
    }
    void stopMoving(){
        System.out.println("останавливаю движение");
    }
    void refuelCar(){
        System.out.println("заправляю машину");
    }
}
