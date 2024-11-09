public class Main {
    public static void main(String[] args) {
        Book pushkinBook = new Book("Pushkin's Diary",new Author("Alexander","Pushkin"),1821);
        Book orwellBook = new Book("Nineteen Eighty-Four",new Author("George","Orwell"),1949);
        pushkinBook.setYear(1825);
        System.out.println(pushkinBook.getYear());
    }
}