public class Keyboard {
    private String switchModel;
    private boolean isMechanical;
    private boolean isOrthopedic;

    public String getSwitchModel() {
        return this.switchModel;
    }

    public void setSwitchModel(String switchModel) {
        this.switchModel = switchModel;
    }

    public boolean getIsMechanical() {
        return this.isMechanical;
    }

    public void setIsMechanical(boolean isMechanical) {
        this.isMechanical = isMechanical;
    }

    public boolean getIsOrthopedic() {
        return this.isOrthopedic;
    }

    public void setIsOrthopedic(boolean isOrthopedic) {
        this.isOrthopedic = isOrthopedic;
    }

    public void pressKey() {
        if (this.switchModel.contains("blue") && this.isMechanical) {
            System.out.println("*TEC TEC TEC TEC*");
        } else {
            System.out.println("*click click*");
        }
    }

    public void removeKeycap() {
        System.out.println("Oh, lost my ENTER keycap! D:");
    }

    public void cleanKeycaps() {
        System.out.println("Wow, peanuts from last month!");
    }
}
