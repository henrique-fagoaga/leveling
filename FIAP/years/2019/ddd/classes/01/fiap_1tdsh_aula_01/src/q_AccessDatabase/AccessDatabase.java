public class AccessDatabase {
    private String dataSourceFormat;
    private boolean isLinkedDataSource;
    private float size; 

    public String getDataSourceFormat() {
        return this.dataSourceFormat;
    }

    public void setDataSourceFormat(String dataSourceFormat) {
        this.dataSourceFormat = dataSourceFormat;
    }

    public boolean getIsLinkedDataSource() {
        return this.isLinkedDataSource;
    }

    public void setIsLinkedDataSource(boolean isLinkedDataSource) {
        this.isLinkedDataSource = isLinkedDataSource;
    }

    public float getSize() {
        return this.size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public void importDataSource() {
        System.out.println("Converting .xtrk file...");
    }

    public void unlinkDataSource() {
        if (this.isLinkedDataSource) {
            System.out.println("Removing data source link...");
        } else {
            System.out.println("Can't execute operation");
        }
    }

    public void exportData() {
        System.out.println("Exporting your data to the world...");
    }
}
