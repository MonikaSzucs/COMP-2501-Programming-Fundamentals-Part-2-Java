class Person {
    //we can't set values to this because it can change
    //1. instanace belongs to object
    private String firstName;
    private boolean dead;

    //2. instance final - final means cannot change
    //private final int yearBorn;

    // 3. static belongs to the class
    // this can be loaded whenever
    private static int      populationMillions  = 8000;
    private static int      tallestIches        = 108;
    private static boolean  extinct             = false;

    // 4. static finals are called "symbolic constants" and are UPPERCASED
    private static final String   SPECIES             = "human";
    private static final boolean  BREATHES_WATER       = false;

}
