package domain;

public class Book {
    private String id;
    private String name;
    private String isbn;
    private String author;
    private String price;
    private String purchased_date;
    private String category;

    public String getId() {
        return id;
    }

    public void setId(String  id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsbn(String isbn) {
        return this.isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String authot) {
        this.author = author;
    }

    public String getPrice(String price) {
        return this.price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPurchased_date() {
        return purchased_date;
    }

    public void setPurchased_date(String purchased_date) {
        this.purchased_date = purchased_date;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
