public class ProgrammingLanguage {
    private String paradigm;
    private String creator;
    private String typeCategory;

    public ProgrammingLanguage(String paradigm, String creator, String typeCategory) {
        this.paradigm = paradigm;
        this.creator = creator;
        this.typeCategory = typeCategory;
    }

    public String getParadigm() {
        return this.paradigm;
    }

    public void setParadigm(String paradigm) {
        this.paradigm = paradigm;
    }

    public String getCreator() {
        return this.creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getTypeCategory() {
        return this.typeCategory;
    }

    public void setTypeCategory(String typeCategory) {
        this.typeCategory = typeCategory;
    }

    public void interpret() {
        System.out.println("Processing your code...");
    }

    public void compile() {
        System.out.println("Converting to bytecodes...");
    }

    public void lint() {
       System.out.println("Checking for syntax errors...");
    }
}
