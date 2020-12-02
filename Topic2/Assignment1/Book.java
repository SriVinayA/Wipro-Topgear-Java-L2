package Topic2.Assignment1;

class Book {
    int isbn;
    String title;
    String author;
    int price;

    public Book(int isbn, String title, String author, int price) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void discountedprice() {
        System.out.println("Isbn=" + isbn +
                "\nTitle=" + title +
                "\nAuthor=" + author +
                "\nPrice=" + price);
    }

    public void displaydetails() {
        int discountpercent = 10;
        int discountedprice = price * discountpercent / 100;
        int finalamount = price - discountedprice;
        System.out.println("---------------------------");
        System.out.println("Final Amount=" + finalamount);
        System.out.println("---------------------------");
    }
}
