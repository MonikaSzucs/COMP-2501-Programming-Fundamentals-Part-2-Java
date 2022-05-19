class Dinosaur {

    private static int population;

    Dinosaur() {
        population++;
        System.out.println("new dinosaur born! " +  population);
    }

    void die() {
        population--;
        System.out.println("dinosaur died " + population);
    }

    public static void printPopulation() {
        System.out.println(population);
    }

    public static void main(final String[] args) {
        Dinosaur d1 = new Dinosaur();
        Dinosaur d2 = new Dinosaur();

        d1.die();
        d2.printPopulation();
    }
}
