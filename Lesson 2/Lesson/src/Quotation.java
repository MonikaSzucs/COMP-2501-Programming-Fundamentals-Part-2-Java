public class Quotation
{
    private final String quotation;
    private final String authorLastName;

    public Quotation(final String quotation, final String authorLastName)
    {
        this.quotation = quotation;
        this.authorLastName = authorLastName;
    }

    public String getQuotation()
    {
        return quotation;
    }

    public String getAuthorLastName()
    {
        return authorLastName;
    }
}
