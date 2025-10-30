//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    //IO.println(String.format("Hello and welcome!"));

//    for (int i = 1; i <= 5; i++) {
//        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//        IO.println("i = " + i);
//    }

    ArrayList<Book> listOfBooks1 = new ArrayList<>();

    listOfBooks1.add(new Book("Граф Монте-Кристо", "Александр Дюма" ,2009, 1326));
    listOfBooks1.add(new Book("Преступление и наказание", "Федор Достоевский", 2008, 598));
    listOfBooks1.add(new Book("Роверандом", "Дж. Р. Р. Толкин", 1998, 144));
    listOfBooks1.add(new Book("Война миров", "Герберт Уэллс", 1897, 256));
    listOfBooks1.add(new Book("Зеленая миля", "Стивен Кинг", 1996, 384));

    ArrayList<Book> listOfBooks2 = new ArrayList<>();

    listOfBooks2.add(new Book("Диктатор", "Сергей Снегов" ,1996, 764));
    listOfBooks2.add(new Book("Квантовая ночь", "Роберт Сойер" ,2016, 390));
    listOfBooks2.add(new Book("Война миров", "Герберт Уэллс", 1897, 256));
    listOfBooks2.add(new Book("Час негодяев", "Александр Афанасьев", 2015, 512));
    listOfBooks2.add(new Book("Преступление и наказание", "Федор Достоевский", 2008, 598));

    ArrayList<Book> listOfBooks3 = new ArrayList<>();

    listOfBooks3.add(new Book("Диктатор", "Сергей Снегов" ,1996, 764));
    listOfBooks3.add(new Book("Роверандом", "Дж. Р. Р. Толкин", 1998, 144));
    listOfBooks3.add(new Book("Граф Монте-Кристо", "Александр Дюма" ,2009, 1326));
    listOfBooks3.add(new Book("Марсианин", "Энди Вейер" ,2014, 384));
    listOfBooks3.add(new Book("Крылья", "Кристина Старк" ,2015, 480));


    ArrayList<Student> listOfStudents = new ArrayList<>();

    listOfStudents.add(new Student("Фомин", "Егор", "15-ВМ", listOfBooks1));
    listOfStudents.add(new Student("Любченко", "Елизавета", "16-АС", listOfBooks2));
    listOfStudents.add(new Student("Буряк", "Виктор", "14-ПО", listOfBooks3));

    listOfStudents.stream().peek(ArrayList -> System.out.println("\nСписок студентов: \n" + listOfStudents))
            .peek(ArrayList -> System.out.println("\nСтудент: " + ArrayList.toString() + "\nКниги студента:\n" + ArrayList.getListOfBooks() + "\n"))
            .flatMap(books->Stream.of(books.getListOfBooks()))

            .forEach(System.out::println);




}
