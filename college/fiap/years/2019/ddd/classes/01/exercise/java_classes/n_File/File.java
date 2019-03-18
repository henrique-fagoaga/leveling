public class File {
    private String extension;
    private float size;
    private String name;

    public String getExtension() {
        return this.extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public float getSize() {
        return this.size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void delete() {
        String fileName = String.format("%s.%s", this.name, this.extension);
        if (fileName == "File.java") {
            System.out.println("Hey! Don't make me delete me");
        } else {
            System.out.println("*being threw to thrash*");
        }
    }

    public void open() {
        if (this.size > 1000000.00) {
            System.out.println("Loading...");
        } else {
            System.out.println("Open and ready");
        }
    }

    public void preview() {
        System.out.printf("Just a peek of %s.%s", this.name, this.extension);
    }
}
