public class Book {
    private String[] words;

    public Book()
    {
        words = new String[30];
        //set the tenth element
        words[9] = "hello";

        for(String word: words)
        {
            if(word!=null)
            {
                System.out.println(word.toUpperCase());
            }
        }
    }
}
