// Brady|Mills|Shepherd|Chilliwack

import java.util.Locale;

public class StarWarsName {
    private static String starWarsName;

    public StarWarsName(final String starWarsName) {
        if(starWarsName.split("\\|").length != 4) {
            throw new IllegalArgumentException("There must be 4 arguements made. Right now you have: " +
                    starWarsName.split("\\|").length);
        }
        this.starWarsName = starWarsName;
    }

    public static void getStarWardsName() {
        String[] arrayName;
        String nameSubString1;
        String nameSubString2;
        String nameSubString3;
        String nameSubString4;
        StringBuilder nameBuilder;
        //String generatedName;

        arrayName = starWarsName.split("\\|");

        nameSubString1 = String.valueOf(arrayName[0].toUpperCase().charAt(0) +
                arrayName[0].toLowerCase().substring(1,3));
        nameSubString2 = String.valueOf(arrayName[1].toLowerCase().substring(0,2));
        nameSubString3 = String.valueOf(arrayName[2].toUpperCase().charAt(0) +
                arrayName[2].toLowerCase().substring(1,2));
        nameSubString4 = String.valueOf(arrayName[3].toLowerCase().substring(0,3));

        nameBuilder = new StringBuilder();

        nameBuilder.append(nameSubString1);
        nameBuilder.append(nameSubString2);
        nameBuilder.append(" ");
        nameBuilder.append(nameSubString3);
        nameBuilder.append(nameSubString4);

        System.out.println(nameBuilder);
    }

    public static void main(final String[] args) {

        if(args.length == 0) {
            throw new IllegalArgumentException("not the right length it must not be empty");
        } else if (args.length != 1) {
            throw new IllegalArgumentException("There must only be one arguement");
        }
        StarWarsName name;
        name = new StarWarsName(args[0]);

        getStarWardsName();
    }
}
