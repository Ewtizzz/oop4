package transport;

public abstract class Transport {
    public static String mark;
    public static String model;
    public static int engineVolume;

    public Transport(String mark, String model, int engineVolume) {
        if (mark != null || mark.isEmpty()){
            Transport.mark = "BMW";
        }else{
            Transport.mark = mark;
        }

        if (model != null || model.isEmpty()){
            Transport.model = "M4";
        }else{
            Transport.model = model;
        }
        if (engineVolume <= 0){
            Transport.engineVolume = 3;
        }
    }

    public static String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public static String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public static int getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(int engineVolume) {
        this.engineVolume = engineVolume;
    }
    public abstract void printType();
    public abstract boolean diagnostic();
}
