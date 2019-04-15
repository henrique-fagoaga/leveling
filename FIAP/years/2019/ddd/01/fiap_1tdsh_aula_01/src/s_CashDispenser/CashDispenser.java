public class CashDispenser {
    private int maxWithdrawableNoteQuantity;
    private boolean needRepair;
    private boolean isOpen;

    public int getMaxWithdrawableNoteQuantity() {
        return this.maxWithdrawableNoteQuantity;
    }

    public void setMaxWithdrawableNoteQuantity(int maxWithdrawableNoteQuantity) {
        this.maxWithdrawableNoteQuantity = maxWithdrawableNoteQuantity;
    }

    public boolean getNeedRepair() {
        return this.needRepair;
    }

    public void setNeedRepair(boolean needRepair) {
        this.needRepair = needRepair;
    }

    public boolean getIsOpen() {
        return this.isOpen;
    }

    public void setIsOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }

    public void dispenseNotes() {
        System.out.println("Bleh! Take your money");
    }

    public void close() {
        if (this.isOpen) {
            System.out.println("Closing...");
        } else {
            System.out.println("Closed already!");
        }
    }

    public void countNotes() {
        System.out.println("*beep boop* So many money");
    }
}
