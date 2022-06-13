import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ValueRange;

class Cellphone extends Electronic{
    private final boolean   hasSms;
    private final boolean   dataOn;
    private final double    dataPlanCost;
    private final double    displaySizeInches;
    private boolean         canDownloadApps;
    LocalDateTime now;


    Cellphone(final String      brand,
              final String      model,
              final double      price,
              final double      dataPlanCost,
              final double      displaySizeInches,
              final boolean     canDownloadApps,
              final boolean     dataOn,
              final boolean     hasSms,
              final boolean     powerCableAttached
    ) {
        super(brand, model, price, powerCableAttached);
        this.dataOn = dataOn;
        this.dataPlanCost = dataPlanCost;
        this.displaySizeInches = displaySizeInches;
        this.canDownloadApps = canDownloadApps;
        this.hasSms = hasSms;

        now = LocalDateTime.now();
    }

    public void dailyCounselingCallBooked() {
        // convert LocalDateTime to ZonedDateTime, with default system zone id
        ZonedDateTime zonedDateTime = now.atZone(ZoneId.systemDefault());

        // convert LocalDateTime to ZonedDateTime, with specified zoneId
        ZonedDateTime vancouverHour = zonedDateTime.withZoneSameInstant(ZoneId.of("America/Los_Angeles"));
        System.out.println(vancouverHour.getHour());


        LocalDateTime localNow = LocalDateTime.now();
        ZoneId zoneId = ZoneId.of("America/New_York");
        ZonedDateTime dateAndTimeForAccount = ZonedDateTime.ofInstant(localNow, zoneId);
        System.out.println(dateAndTimeForAccount);

        ValueRange hourRange = ValueRange.of(8, 10);
        System.out.printf("is hour (%s) in range [%s] -> %s%n",
                dateAndTimeForAccount.getHour(),
                hourRange,
                hourRange.isValidValue(dateAndTimeForAccount.getHour())
        );
    }
}
