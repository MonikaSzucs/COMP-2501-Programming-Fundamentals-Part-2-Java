import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class TikTok {
    private List<String> hashtags;

    private String[] tags;

    TikTok()
    {
        hashtags = new ArrayList<>();
        tags = new String[10];

        tags[0] = "software";
        System.out.println(tags[0]);
        tags[0] = null;
        System.out.println(tags.length);
        hashtags.add("java");
        hashtags.add(null);
        hashtags.add("development");
        hashtags.add("programming");

        System.out.println(hashtags.size());

        for(String hashtag: hashtags)
        {
            if(hashtag != null)
            {
                System.out.println(hashtag.toUpperCase());
            }
        }
    }
}
