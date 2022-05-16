public class Main {
    public static void main(final String[] args) {
        Bcit department1;
        Name name1;
        Hired startDate1;

        try {
            name1 = new Name("Monika", "Szucs");
            System.out.println(name1.getInitials());
            startDate1 = new Hired("January", 10, 2022);
            System.out.println(startDate1.getMmDdYyyy());
            department1 = new Bcit("Marketing", 125667, name1, startDate1);
            System.out.println(department1.getSalary());
        } catch(IllegalArgumentException e){
            System.out.println("Watch out, " + e.getMessage());
        } finally {
            System.out.println("This try/catch has ended.");
        }


        //
    }
}
