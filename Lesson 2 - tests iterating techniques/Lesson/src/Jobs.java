public class Jobs {
    private Quotation[] jobTypes;

    Jobs()
    {
        jobTypes = new Quotation[5];

        jobTypes[2] = new Quotation("Software Developer", "Sunbowl");

        System.out.println(jobTypes.length);

        for(Quotation item: jobTypes)
        {
            if(item!=null) {
                System.out.println(item.getQuotation() + " at " + item.getAuthorLastName());
            }
        }
    }
}
