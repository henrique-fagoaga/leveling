public class Engineer {
    private String actuationField;
    private boolean hasCrea;
    private boolean worksInActuationField;

    public String getActuationField() {
        return this.actuationField;
    }

    public void setActuationField(String actuationField) {
        this.actuationField = actuationField;
    }

    public boolean getHasCrea() {
        return this.hasCrea;
    }

    public void setHasCrea(boolean hasCrea) {
        this.hasCrea = hasCrea;
    }

    public boolean getWorksInActuationField() {
        return this.worksInActuationField;
    }

    public void setWorksInActuationField(boolean worksInActuationField) {
        this.worksInActuationField = worksInActuationField;
    }

    public void resolveComplexProblem() {
        System.out.println("Some calculus here and there, voillá!");
    }

    public void signProjectPapers() {
        System.out.println("Yeah, I'm always the responsible");
    }

    public void createProject() {
        System.out.println("Something great will arise");
    }
}
