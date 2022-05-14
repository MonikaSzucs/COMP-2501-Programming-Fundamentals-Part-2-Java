public class Date {
    public String monthBirth;
    public final int dayBirth;
    public final int yearBirth;

    Date(final String monthBirth, final int dayBirth, final int yearBirth) {
        if(monthBirth.equalsIgnoreCase("january")) {
            this.monthBirth = "01";
        } else if(monthBirth.equalsIgnoreCase("february")) {
            this.monthBirth = "02";
        } else if(monthBirth.equalsIgnoreCase("march")) {
            this.monthBirth = "03";
        } else if(monthBirth.equalsIgnoreCase("april")) {
            this.monthBirth = "04";
        } else if(monthBirth.equalsIgnoreCase("may")) {
            this.monthBirth = "05";
        } else if(monthBirth.equalsIgnoreCase("june")) {
            this.monthBirth = "06";
        } else if(monthBirth.equalsIgnoreCase("july")) {
            this.monthBirth = "07";
        } else if(monthBirth.equalsIgnoreCase("august")) {
            this.monthBirth = "08";
        } else if(monthBirth.equalsIgnoreCase("september")) {
            this.monthBirth = "09";
        } else if(monthBirth.equalsIgnoreCase("october")) {
            this.monthBirth = "10";
        } else if(monthBirth.equalsIgnoreCase("november")) {
            this.monthBirth = "11";
        } else if(monthBirth.equalsIgnoreCase("december")) {
            this.monthBirth = "12";
        } else {
            this.monthBirth = "N/A";
        }
        this.dayBirth    = dayBirth;
        this.yearBirth   = yearBirth;
    }

    public int getYear() {
        return yearBirth;
    }

    public String getMonth() {
        return monthBirth;
    }

    public int getDay() {
        return dayBirth;
    }

    public String getYyMmDd() {

        return getYear() + "-" + getMonth() + "-" + getDay();
    }
}
