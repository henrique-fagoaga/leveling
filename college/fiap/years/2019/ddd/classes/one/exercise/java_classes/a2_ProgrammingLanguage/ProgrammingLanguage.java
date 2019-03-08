public class ProgrammingLanguage {
    private String paradigm;
    private String creator;
    private String type;

    public ProgrammingLanguage(String paradigm, String creator, String type) {
        this.paradigm = paradigm;
        this.creator = creator;
        this.type = type;
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

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
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
