public class App {
    public static void main(String[] args) {
        Author konanDoyle = new Author("Artur", "Doyle");
        Author julesVern = new Author("Jules", "Vern");
        Book mysterIsland = new Book("Mysterious Island", julesVern, 1874);
        Book fakeDog = new Book("The hound of the Baskervilles", konanDoyle, 1891);
        fakeDog.setPublishYear(1905);
    }
}
