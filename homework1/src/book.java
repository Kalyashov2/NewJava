public class book {
    private String nameBook;
    private String author;
    private int yearPublicarion;

    public book(String nameBook, String author, int yearPublicarion) {
        this.nameBook = nameBook;
        this.author = author;
        this.yearPublicarion = yearPublicarion;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getYearPublicarion() {
        return this.yearPublicarion;
    }
    public void setYearPublicarion(int yearPublicarion){
        this.yearPublicarion = yearPublicarion;
    }

}
