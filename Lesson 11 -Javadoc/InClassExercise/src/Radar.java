// To generate JavaDoc go to Tools > Generate JavaDoc
// In output directory save that JavaDoc file where you want
//

/**
 * @author Monika Szucs
 * @version 1.0
 */
public class Radar {
    private int yearBuilt;

    // There use to be a double star on the first one but if you remove it
    // will hide the comment now
    /*
     * This is notes on Design By Contract (you can google this)
     *
     * @param degreesTn degrees true north, at which angle we are
     *                  seeking an entity
     * @return true if entity found at this angle; false otherwise
     */
    private boolean isEntityAtAnglePrivate(final double degreesTn) {
        assert(degreesTn >= 0.0);
        assert(degreesTn < 360.0);

    }

    /**
     * This is notes on Design By Contract (you can google this)
     *
     * @param degreesTn degrees true north, at which angle we are
     *                  seeking an entity
     * @return true if entity found at this angle; false otherwise
     */
    public boolean isEntityAtAnglePublic(final double degreesTn) {
        assert(degreesTn >= 0.0);
        assert(degreesTn < 360.0);
    }
}
