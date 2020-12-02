package Topic2.Assignment3;

class Magazine extends Book {
    String type = "Java";

    public Magazine() {
        Novel n = new Novel();
        System.out.println(
                "\ntype   = " + type +
                        "\nisbn   = " + isbn +
                        "\ntitle  = " + title +
                        "\nAuthor = " + n.author +
                        "\nprice  = " + price
        );
    }
}
