public class Main
{
    public static void main(final String[] args)
    {
        Book book1 = new Book("harry potter", 1997, 35.99, true, '1');
        Book book2 = new Book("lord of the rings", 1954, 19.99, true, '2');

        System.out.println(book1.getTitle().toUpperCase());
        System.out.println(book2.getTitle());
    }
}