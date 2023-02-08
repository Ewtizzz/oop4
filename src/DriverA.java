import transport.Car;

public class DriverA extends Driver<Car>  {
    private String fio;
    public boolean haveDriverLicence;
    public int experience;

    public DriverA(String fio, boolean haveDriverLicence, int experience) {
        super();
        this.fio = fio;
        this.haveDriverLicence = haveDriverLicence;
        this.experience = experience;
    }
    public String getFio() {
        return fio;
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
}
