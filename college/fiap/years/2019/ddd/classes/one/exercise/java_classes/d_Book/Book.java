public class Book {
    private String title;
    private String genre;
    private String author;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void putOnTheTable() {
        System.out.println("The book is on the table rsrsrs");
    }

    public void read() {
        System.out.printf(
            "This book %s from %s really lives up to its genre of %s",
            this.title, this.author, this.genre
        );
    }

    public void useTheWrongWay() {
        System.out.println("*use the book as monitor stand*");
    }
}
