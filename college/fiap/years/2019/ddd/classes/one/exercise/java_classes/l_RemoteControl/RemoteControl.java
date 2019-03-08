public class RemoteControl {
    private int buttonQuantity;
    private String brand;
    private boolean isClickUniversalController;

    public int getButtonQuantity() {
        return this.buttonQuantity;
    }

    public void setButtonQuantity(int buttonQuantity) {
        this.buttonQuantity = buttonQuantity;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean getIsClickUniversalController() {
        return this.isClickUniversalController;
    }

    public void setIsClickUniversalController(boolean isClickUniversalController) {
        this.isClickUniversalController = isClickUniversalController;
    }

    public void pressTurnOnButton() {
        if (this.buttonQuantity > 30) {
            System.out.println("Looking for the right button... *click*");
        } else {
            System.out.println("*just click*");
        }
    }

    public void pauseLife() {
        if (this.isClickUniversalController) {
            System.out.println("This message will be read only by the remote control owner");
        } else {
            System.out.println("Not implemented command");
        }
    }

    public void disappear() {
        System.out.println("WHERE IS THE REMOTE???");
    }
}
