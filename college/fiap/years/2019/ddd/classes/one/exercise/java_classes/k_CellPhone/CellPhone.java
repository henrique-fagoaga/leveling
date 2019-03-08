public class CellPhone {
    private String model;
    private boolean isTouch;
    private int carrierSignalLevel;

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean getIsTouch() {
        return this.isTouch;
    }

    public void setIsTouch(boolean isTouch) {
        this.isTouch = isTouch;
    }

    public int getCarrierSignalLevel() {
        return this.carrierSignalLevel;
    }

    public void setCarrierSignalLevel(int carrierSignalLevel) {
        this.carrierSignalLevel = carrierSignalLevel;
    }

    public void ringTheTone() {
        System.out.println("Puts tuts");
    }

    public void call() {
        if (this.carrierSignalLevel < 2) {
            System.out.println("Not recommended to call with this signal quality, but still, calling...");
        } else {
            System.out.println("Calling...");
        }
    }

    public void isReallyTouch() {
        if (this.isTouch) {
            System.out.println("IS THIS MODEL TOUCH? *tap tap*");
        } else {
            System.out.println("ISN'T THIS MODEL TOUCH? *tap tap*");
        }
    }
}
