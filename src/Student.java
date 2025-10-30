import java.util.ArrayList;

public class Student {
    private String lastName; // Фамилия
    private String name; // Имя
    private String eMail;
    private String group;

    private ArrayList<Book> books;

    public Student (String lastName, String name) {
        this.lastName = lastName;
        this.name = name;
    }

    public Student (String lastName, String name, ArrayList<Book> books) {
        this.lastName = lastName;
        this.name = name;
        this.books = books;
    }

    public Student (String lastName, String name, String group, ArrayList<Book> books) {
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

    public ArrayList<Book> getBooks() {
        return books;
    }

    public ArrayList<String> getListOfBooks() {
        ArrayList<String> listOfBooks = new ArrayList<>();
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
        return lastName + " " + name;
    }
}
