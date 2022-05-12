class Restaurant {
    public String order(final String request) {
        if(request.equalsIgnoreCase("pizza")) {
            System.out.println("YUMYYYYYYYYYY");
            return "yummy pizza";
        }
        throw new IllegalArgumentException("pizza only! not " + request);
    }
}
