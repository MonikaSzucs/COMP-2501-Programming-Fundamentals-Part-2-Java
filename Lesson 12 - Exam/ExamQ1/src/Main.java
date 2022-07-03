public class Main {
    public static void main(final String[] args) {
        System.out.println(args[0]);
        String items = args[0];
        String[] arrayNames;
        arrayNames = items.split("\\|");
        System.out.println(arrayNames.length);

        for(int i=0; i<arrayNames.length; i++) {
            if(arrayNames != null) {
                System.out.println(arrayNames[i]);
            }
        }
    }
}
