public class TextMessage {
    private String content;
    private int maxLength;
    private String sentFrom;
    private String sentTo;
    
    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getMaxLength() {
        return this.maxLength;
    }

    public void setMaxLength(int maxLength) {
        this.maxLength = maxLength;
    }

    public String getSentFrom() {
        return this.sentFrom;
    }

    public void setSentFrom(String sentFrom) {
        this.sentFrom = sentFrom;
    }

    public String getSentTo() {
        return this.sentTo;
    }

    public void setSentTo(String sentTo) {
        this.sentTo = sentTo;
    }

    public void isLikeTweet() {
        if (this.maxLength == 140) {
            System.out.println("Yep, pretty much");
        } else {
            System.out.println("Nops");
        }
    }

    public void isInception() {
        if (this.sentFrom == this.sentTo) {
            System.out.println("Man, something weird is going on");
        } else {
            System.out.println("Just a regular text message");
        }
    }

    public void hasGameInContent() {
        if (this.content.contains("game")) {
            System.out.println("Oh! There's something about game within the text content");
        } else {
            System.out.println("No, just boring stuff");
        }
    }
}
