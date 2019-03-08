public class SoccerPlayer {
    private String team;
    private int lastTournamentGoalQuantity;
    private String catchPhrase;

    public String getTeam() {
        return this.team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getLastTournamentGoalQuantity() {
        return this.lastTournamentGoalQuantity;
    }

    public void setLastTournamentGoalQuantity(int lastTournamentGoalQuantity) {
        this.lastTournamentGoalQuantity = lastTournamentGoalQuantity;
    }

    public String getCatchPhrase() {
        return this.catchPhrase;
    }

    public void setCatchPhrase(String catchPhrase) {
        this.catchPhrase = catchPhrase;
    }

    public void celebrateGoal() {
        System.out.printf("Oh yeah! %s", this.catchPhrase);
    }

    public void celebrateLastTournament() {
        if (this.lastTournamentGoalQuantity == 0) {
            System.out.println("Actually... I'm a goalkeeper, so I'm not so disappointed");
        } else {
            System.out.println("Just doing my job");
        }
    }

    public void kickBall() {
        System.out.println("HUWA!");
    }
}
