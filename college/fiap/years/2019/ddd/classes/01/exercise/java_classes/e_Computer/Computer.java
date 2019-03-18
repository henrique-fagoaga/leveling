public class Computer {
    private String gpuModel;
    private int processorCoreQuantity;
    private boolean canReadFloppyDisk;

    public String getGpuModel() {
        return this.gpuModel;
    }

    public void setGpuModel(String gpuModel) {
        this.gpuModel = gpuModel;
    }

    public int getProcessorCoreQuantity() {
        return this.processorCoreQuantity;
    }

    public void setProcessorCoreQuantity(int processorCoreQuantity) {
        this.processorCoreQuantity = processorCoreQuantity;
    }

    public boolean getCanReadFloppyDisk() {
        return canReadFloppyDisk;
    }

    public void setCanReadFloppyDisk(boolean canReadFloppyDisk) {
        this.canReadFloppyDisk = canReadFloppyDisk;
    }

    public void readFloppyDisk() {
        if (this.canReadFloppyDisk) {
            System.out.println("Cool, man! What a wonderful PC you have there!");
        } else {
            System.out.println("Damn, boy! You have a outdated toaster there...");
        }
    }

    public void playApexLegends() {
        if (this.processorCoreQuantity <  10) {
            System.out.println("Unfortunately, you'll have to play LoL");
        } else {
            System.out.println("LOL! What're you waiting for? Add me there: krandom :D");
        }
    }

    public void turnOn() {
        if (this.gpuModel.contains("1080")) {
            System.out.println("Accumulating enough energy to turn on, ETA: 42 minutes");
        } else {
            System.out.println("SSD or not, the PC is ready to use");
        }
    }
}
