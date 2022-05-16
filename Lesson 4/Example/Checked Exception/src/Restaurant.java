class Restaurant {
    /**
     *
     * @param request the food being requested
     * @return the food being served
     * @throws PizzaException if the ordered food isn't available
     */
    public String order(final String request)
            throws PizzaException {
        if (request.equalsIgnoreCase("pizza")) {
            System.out.println("YUMYYYYYYYYYY");
            return "yummy pizza";
        }
        throw new PizzaException("pizza only! not " + request);
    }
}
