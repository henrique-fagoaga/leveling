public class Cinema {
    private int capacity;
    private boolean haveAmenitiesForDisabled;
    private String movieOfTheWeek;

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean getHaveAmenitiesForDisabled() {
        return this.haveAmenitiesForDisabled;
    }

    public void setHaveAmenitiesForDisabled(boolean haveAmenitiesForDisabled) {
        this.haveAmenitiesForDisabled = haveAmenitiesForDisabled;
    }

    public String getMovieOfTheWeek() {
        return this.movieOfTheWeek;
    }

    public void setMovieOfTheWeek(String movieOfTheWeek) {
        this.movieOfTheWeek = movieOfTheWeek;
    }

    public void displayMovieOfTheWeek() {
        System.out.printf("Aaaand the movie of the week is.... %s!!!", this.movieOfTheWeek);
    }

    public void displayMaximumCapacity() {
        System.out.printf("This building supports up to %d cinemophiles", this.capacity);
    }

    public void canSupportDisabled() {
        if (this.haveAmenitiesForDisabled) {
            System.out.println("We're prepared for everything!");
        } else {
            System.out.println("Hmm... sorry, the house if full");
        }
    }
}
