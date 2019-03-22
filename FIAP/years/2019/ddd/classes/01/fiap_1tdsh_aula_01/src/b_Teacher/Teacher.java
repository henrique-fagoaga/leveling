public class Teacher {
    private String specializedSubject;
    private String graduationLevel;
    private int publishedArticleQuantity;

    public String getSpecializedSubject() {
        return this.specializedSubject;
    }

    public void setSpecializedSubject(String specializedSubject) {
        this.specializedSubject = specializedSubject;
    }

    public String getGraduationLevel() {
        return this.graduationLevel;
    }

    public void setGraduationLevel(String graduationLevel) {
        this.graduationLevel = graduationLevel;
    }

    public int getPublishedArticleQuantity() {
        return this.publishedArticleQuantity;
    }

    public void setPublishedArticleQuantity(int publishedArticleQuantity) {
        this.publishedArticleQuantity = publishedArticleQuantity;
    }

    public void presentToClass() {
        System.out.printf(
            "Hello everyone! I'm your %s of %s teacher and I've published %d articles already!",
            this.graduationLevel, this.specializedSubject, this.publishedArticleQuantity
        );
    }

    public void publishArticle() {
        this.publishedArticleQuantity++;
        System.out.println("Hellya! Published a new one!");
    }

    public void shoutOutLoudGraduationLevel() {
        System.out.printf("I'M A %s!!!", this.graduationLevel);
    }
}
