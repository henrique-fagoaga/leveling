public class Coin {
    private boolean isVirtual;
    private float valueInUsd;
    private String name;

    public boolean getIsVirtual() {
        return this.isVirtual;
    }

    public void setIsVirtual(boolean isVirtual) {
        this.isVirtual = isVirtual;
    }

    public float getValueInUsd() {
        return this.valueInUsd;
    }

    public void setValueInUsd(float valueInUsd) {
        this.valueInUsd = valueInUsd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void flip() {
        if (this.isVirtual) {
            System.out.println("Hmm... cryptocoin flip app needed");
        } else {
            System.out.println("Oops, dropped the coin somewhere");
        }
    }

    public void exchange() {
        System.out.println("Exchange hate is complex stuff");
    }

    public void donate() {
        System.out.println("So altruistic");
    }
}
