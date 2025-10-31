import java.util.*;

void main() {
    // ====== Задание №1 ======
    MyHashSet hashSet = new MyHashSet();
    hashSet.add(5);
    hashSet.add(4);
    hashSet.add(10);
    System.out.println("Добавлены элементы в MyHashSet: " + hashSet);
    hashSet.add(4);
    System.out.println("Добавлены неуникальные элементы в MyHashSet: " + hashSet);
    hashSet.remove(5);
    System.out.println("Удален элемент в MyHashSet: " + hashSet);


    MyArrayList<String> arrayList = new MyArrayList<>();
    arrayList.add("1");
    arrayList.addAll(Arrays.asList("2","3","4","Глеб"));
    System.out.println("\nДобавлены элементы в MyArrayList: " + arrayList);
    System.out.println("Удален элемент: " + arrayList.remove(3));
    System.out.println("Получен элемент: " + arrayList.get(3));
    System.out.println("MyArrayList после операций: " + arrayList);

    // ====== Задание №2 ======
    List<Student> listOfStudents = Arrays.asList(
            new Student("Фомин", "Егор", Arrays.asList(
                    new Book("Диктатор", "Сергей Снегов", 1996, 764),
                    new Book("Роверандом", "Дж. Р. Р. Толкин", 1998, 144),
                    new Book("Граф Монте-Кристо", "Александр Дюма", 2009, 1326),
                    new Book("Марсианин", "Энди Вейер", 2014, 384),
                    new Book("Крылья", "Кристина Старк", 2015, 480)
            )),
            new Student("Любченко", "Елизавета", Arrays.asList(
                    new Book("Диктатор", "Сергей Снегов", 1996, 764),
                    new Book("Квантовая ночь", "Роберт Сойер", 2016, 390),
                    new Book("Война миров", "Герберт Уэллс", 1897, 256),
                    new Book("Час негодяев", "Александр Афанасьев", 2015, 512),
                    new Book("Преступление и наказание", "Федор Достоевский", 2008, 598)
            )),
            new Student("Буряк", "Виктор", Arrays.asList(
                    new Book("Граф Монте-Кристо", "Александр Дюма", 2009, 1326),
                    new Book("Преступление и наказание", "Федор Достоевский", 2008, 598),
                    new Book("Роверандом", "Дж. Р. Р. Толкин", 1998, 144),
                    new Book("Война миров", "Герберт Уэллс", 1897, 256),
                    new Book("Зеленая миля", "Стивен Кинг", 1996, 384)
            ))
    );

    listOfStudents.stream().peek(System.out::println) // Вывод в консоль
            .flatMap(student -> student.getBooks().stream()) // Получичаем книги
            .sorted(Comparator.comparingInt(Book::getPages)) // Сортировка по количетсву страниц
            .filter(book -> book.getYear() > 2000) // Убираем книги до 2000 года
            .distinct() // Оставляем уникальные значения
            .limit(3) // Ограничиваем стрим
            .map(Book::getYear) // Получаем годы выпуска
            .findAny()
            .ifPresentOrElse(
                    year -> System.out.println("\nГод выпуска книги:" + year),
                    () -> System.out.println("Книга не найдена")
            );

}


