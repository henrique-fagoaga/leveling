public class ExcelTable {
    private int maxColumnQuantity;
    private int maxRowQuantity;
    private int maxTabQuantity;

    public int getMaxColumnQuantity() {
        return this.maxColumnQuantity;
    }

    public void setMaxColumnQuantity(int maxColumnQuantity) {
        this.maxColumnQuantity = maxColumnQuantity;
    }

    public int getMaxRowQuantity() {
        return this.maxRowQuantity;
    }

    public void setMaxRowQuantity(int maxRowQuantity) {
        this.maxRowQuantity = maxRowQuantity;
    }

    public int getMaxTabQuantity() {
        return this.maxTabQuantity;
    }

    public void setMaxTabQuantity(int maxTabQuantity) {
        this.maxTabQuantity = maxTabQuantity;
    }

    public void computeFormula() {
        System.out.println("ERR!");
    }

    public void save() {
        System.out.println("Oh crap! Your excel.exe process crashed! :(");
    }

    public void close() {
        System.out.println("Are you sure you want to leave? There's so much more work to get done!");
    }
}
