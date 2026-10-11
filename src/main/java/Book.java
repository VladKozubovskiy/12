public class Book {
    String title;
    String author;
    int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public void printInfo() {
        System.out.println("Название книги " + title + ", Автор : " + author + ", Количество страниц : " + pages);
    }

    public static void main(String[] args) {
        Book mybook = new Book("Оно", "Кинг", 120);
        mybook.printInfo();
    }
}
