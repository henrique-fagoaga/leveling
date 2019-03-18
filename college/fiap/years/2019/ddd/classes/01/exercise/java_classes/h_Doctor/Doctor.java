public class Doctor {
    private String studyField;
    private String graduatedUniversity;
    private int savedLifeQuantity;

    public String getStudyField() {
        return this.studyField;
    }

    public void setStudyField(String studyField) {
        this.studyField = studyField;
    }

    public String getGraduatedUniversity() {
        return this.graduatedUniversity;
    }

    public void setGraduatedUniversity(String graduatedUniversity) {
        this.graduatedUniversity = graduatedUniversity;
    }

    public int getSavedLifeQuantity() {
        return this.savedLifeQuantity;
    }

    public void setSavedLifeQuantity(int savedLifeQuantity) {
        this.savedLifeQuantity = savedLifeQuantity;
    }

    public void saveLife() {
        this.savedLifeQuantity++;
        System.out.println("Hang in there! You have no risk of life anymore!");
    }

    public void talkAboutSpecialization() {
        System.out.printf("I'm the best doctor in %s!", this.studyField);
    }

    public void callNextPatient() {
        System.out.printf("Next waiting for %s exam!", this.studyField);
    }
}
