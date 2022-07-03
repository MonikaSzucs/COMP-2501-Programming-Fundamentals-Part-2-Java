class Notebook
{
    private Quotation[] notes;

    Notebook()
    {
        notes = new Quotation[7];
        notes[2] = new Quotation("work hard", "goggins");
        notes[6] = new Quotation("discipline equals freedom", "willink");
        System.out.println(notes.length);

        for(Quotation q: notes)
        {
            if(q == null)
            {
                System.out.println("no quotation here");
            }
            else
            {
                System.out.println(q.getQuotation() + " by " + q.getAuthorLastName());
            }
        }
    }
}

