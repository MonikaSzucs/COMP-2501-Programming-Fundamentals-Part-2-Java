import java.util.ArrayList;
import java.util.List;

public class Room {
    private List<Electronic> eletronics;

    Room() {
        eletronics = new ArrayList<>();

        eletronics.add(new Printer("Brother", "HL-2280DW", "black", 36.0, 250.0, false, true, true));
        eletronics.add(new Laptop("Microsoft", "Surface Pro 6", 2500, 14.5, false, true, true));
        eletronics.add(new Fan("Honeywell", "QC03", 60, 13, true, true, true, true));
        eletronics.add(new Cellphone("Iphone", "XR", 1400, 80, 6.1, true, true, true, false));


        for(Electronic e: eletronics) {
            System.out.println(e);

            if (e instanceof Printer) {
                Printer printer = (Printer) e;
                printer.print();
                printer.checkPrice(e.getPrice());
            };

            if(e instanceof Laptop) {
                Laptop laptop = (Laptop) e;
                laptop.getDisplaySize();
                laptop.checkPrice(e.getPrice());
            }

            if(e instanceof Fan) {
                Fan fan = (Fan) e;
                fan.getTemperature();
                fan.getPrice();
                fan.kidProof();
            }

            if(e instanceof  Cellphone) {
                Cellphone cell = (Cellphone) e;
                cell.dailyCounselingCallBooked();
            }
            System.out.println(" ");
        }
    }

    public static void main(final String[] args) {
        Room room;
        room = new Room();
    }

}
