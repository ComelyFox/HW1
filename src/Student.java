import java.util.ArrayList;
import java.util.List;

public class Student {
    private String lastName; // Фамилия
    private String name; // Имя
    private String eMail;
    private String group;

    private List<Book> books;

    public Student (String lastName, String name) {
        this.lastName = lastName;
        this.name = name;
    }

    public Student (String lastName, String name, List<Book> books) {
        this.lastName = lastName;
        this.name = name;
        this.books = books;
    }

    public Student (String lastName, String name, String group, List<Book> books) {
        this.lastName = lastName;
        this.name = name;
        this.group = group;
        this.books = books;
    }

    public void setFullName(String lastName, String name){
        this.lastName = lastName;
        this.name = name;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getName () {
        return this.name;
    }
    public String getLastName() {
        return this.lastName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<String> getListOfBooks() {
        List<String> listOfBooks = new ArrayList<>();
        for (Book book : this.books) {
            listOfBooks.add(book.getTitle());
        }
        return listOfBooks;
    }

    public String getEMail() {
        return this.eMail;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "\nСтудент: " + lastName + " " + name + "\nСписок книг: " + books;
    }
}
