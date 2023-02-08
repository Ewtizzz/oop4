import transport.Transport;

public class Driver<T extends Transport> {
    public String fio;
    public boolean haveDriverLicence;
    public int experience;

    public Driver() {

    }

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
    public

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
