public class TelephoneLine {
    private String address;
    private int phoneNumber;
    private boolean isActive;

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean getIsActive() {
        return this.isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public void receiveCallSignal() {
        System.out.println("*beep beep*");
    }

    public void sendCallSignal() {
        System.out.println("*boop boop*");
    }

    public void disconnectCall() {
        System.out.println("*tuu tuu tuu*");
    }
}
