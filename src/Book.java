public class Book {
    public String getTitle() {
        return title;
    }

    private String title;

    public Author getAuthor() {
        return author;
    }

    private Author author;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    private int year;


    public Book(String title,Author author,int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }
}
