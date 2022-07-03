class Doctor extends Person{
    private String specialty;

    Doctor(final String specialty) {
        super(Integer.parseInt(specialty));
    }
}
