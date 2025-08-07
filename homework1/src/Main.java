//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void printBook(){

    }

    public static void main(String[] args) {
            book a = new book("name", "A B", 1212);
            book b = new book("name2", "Александр Пушкин", 1200);
            author bookA = new author("A", "B");
            author boobB = new author("Александр", "Пушкиг");
        System.out.println("Данные об авторе - " + a.getAuthor() + ". Имя книги - " + a.getNameBook() + ". Год выпуска - " + a.getYearPublicarion());
        System.out.println("Данные об авторе - " + b.getAuthor() + ". Имя книги - " + b.getNameBook() + ". Год выпуска - " + b.getYearPublicarion());
        System.out.println("bookA.getName() = " + bookA.getName());
        a.setYearPublicarion(13000);
        System.out.println(a.getYearPublicarion());

    }

}