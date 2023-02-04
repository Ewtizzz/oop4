import transport.Truck;

public class DriverC<T extends Truck> {
    public String fio;
    public boolean haveDriverLicence;

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public boolean isHaveDriverLicence() {
        return haveDriverLicence;
    }

    public void setHaveDriverLicence(boolean haveDriverLicence) {
        this.haveDriverLicence = haveDriverLicence;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int experience;

    public DriverC(String fio, boolean haveDriverLicence, int experience) {
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
