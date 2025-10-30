public class Book implements Comparable<Book>{
    private String title;
    private String author;
    private int year;
    private int pages;

    public Book(String title) {
        this.title = title;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public Book(String title, String author, int year, int pages) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.pages = pages;
    }

    public Book(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public Book(String title, int year, int pages) {
        this.title = title;
        this.year = year;
        this.pages = pages;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setPages(int pages) {
        this.pages =pages;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getYear() {
        return this.year;
    }

    public int getPages() {
        return this.pages;
    }

    @Override
    public int compareTo(Book other) {
        return Integer.compare(this.pages,other.getPages());
    }
}
