class Restaurant {
    /**
     *
     * @param request the food being requested
     * @return the food being served
     * @throws PizzaException if the ordered food isn't available
     */
    public String order(final String request) {
        if(request.equalsIgnoreCase("pizza")) {
            System.out.println("YUMYYYYYYYYYY");
            return "yummy pizza";
        }
        //throw new IllegalArgumentException("pizza only! not " + request);
        throw new PizzaException("pizza only! not " + request);
    }

    // constructor must announce it for the checked exception - must use try/catch or re throw

    /**
     *
     * @param request2
     * @return
     * @throws PizzaCheckedException
     */
    public String order2(final String request2)
            throws PizzaCheckedException {
        if(request2.equalsIgnoreCase("pizza")) {
            System.out.println("YUMYYYYYYYYYY");
            return "yummy pizza";
        }
        //throw new IllegalArgumentException("pizza only! not " + request);
        throw new PizzaCheckedException("pizza only! not " + request2);
    }
}
