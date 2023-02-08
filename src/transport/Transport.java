package transport;

public abstract class Transport {
    public String mark;
    public static String model;
    public static int engineVolume;

    public Transport(String mark, String model, int engineVolume) {
        if (mark != null || mark.isEmpty()){
            this.mark = "BMW";
        }else{
            this.mark = mark;
        }

        if (model != null || model.isEmpty()){
            this.model = "M4";
        }else{
            this.model = model;
        }
        if (engineVolume <= 0){
            this.engineVolume = 3;
        }
    }

    public String getMark() {
        return this.mark;
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
