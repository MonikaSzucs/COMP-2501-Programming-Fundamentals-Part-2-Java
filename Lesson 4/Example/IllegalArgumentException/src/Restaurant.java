class Restaurant {
    /**
     *
     * @param request the food being requested
     * @return the food being served
     */
    public String order(final String request) {
        if (request.equalsIgnoreCase("pizza")) {
            System.out.println("YUMYYYYYYYYYY");
            return "yummy pizza";
        }
        throw new IllegalArgumentException("pizza only! not " + request);
    }
}
