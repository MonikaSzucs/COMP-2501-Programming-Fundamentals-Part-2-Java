import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

class HockeyTeam
{
    private List<String> players;

    HockeyTeam()
    {
        players = new LinkedList<>();

        // methods we use for lists: RAGS
        players.add("crosby");
        System.out.println(players.get(0).toUpperCase());
        for(String player: players)
        {
            System.out.println(player);
        }

        System.out.println(players.size());
        players.remove(0);

        for(String p: players)
        {
            System.out.println(p);
        }
        System.out.println(players.size());
    }
}
