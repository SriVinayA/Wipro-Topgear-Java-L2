package Topic2.Assignment2;

class Email extends Document {
    private String sender;
    private String recipient;
    private String title;

    public Email(String sender, String recipient, String title, String Emsg) {
        super(Emsg);
        this.sender = sender;
        this.recipient = recipient;
        this.title = title;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "From: " + sender + "\nTo: " + recipient + "\n" + title + "\n\n" + super.toString();
    }
}
