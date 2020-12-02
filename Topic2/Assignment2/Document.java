package Topic2.Assignment2;

class Document {
    private String text;

    public Document(String text) {
        setText(text);
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
