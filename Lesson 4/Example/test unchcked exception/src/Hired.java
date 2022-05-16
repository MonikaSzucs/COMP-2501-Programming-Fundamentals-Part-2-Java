class Hired {
    private final String month;
    private final int day;
    private final int year;

    //"May", 10, 2022
    Hired(final String month, final int day, final int year) {

        if(month == null || month.isBlank()) {
            throw new IllegalArgumentException("The month cannot be null or blank");
        }
        if(month.equalsIgnoreCase("january") ||
                month.equalsIgnoreCase("jan") ||
                month.equalsIgnoreCase("01")) {
            this.month = "Jan";
        } else if(month.equalsIgnoreCase("february") ||
                month.equalsIgnoreCase("feb") ||
                month.equalsIgnoreCase("02")) {
            this.month = "Feb";
        } else if(month.equalsIgnoreCase("march") ||
                month.equalsIgnoreCase("mar") ||
                month.equalsIgnoreCase("03")) {
            this.month = "Mar";
        } else if(month.equalsIgnoreCase("april") ||
                month.equalsIgnoreCase("apr") ||
                month.equalsIgnoreCase("04")) {
            this.month = "Apr";
        } else if(month.equalsIgnoreCase("may") ||
                month.equalsIgnoreCase("may") ||
                month.equalsIgnoreCase("05")) {
            this.month = "May";
        } else if(month.equalsIgnoreCase("june") ||
                month.equalsIgnoreCase("jun") ||
                month.equalsIgnoreCase("06")) {
            this.month = "Jun";
        } else if(month.equalsIgnoreCase("july") ||
                month.equalsIgnoreCase("jul") ||
                month.equalsIgnoreCase("07")) {
            this.month = "Jul";
        } else if(month.equalsIgnoreCase("august") ||
                month.equalsIgnoreCase("aug") ||
                month.equalsIgnoreCase("08")) {
            this.month = "Aug";
        } else if(month.equalsIgnoreCase("september") ||
                month.equalsIgnoreCase("sep") ||
                month.equalsIgnoreCase("09")) {
            this.month = "Sep";
        } else if(month.equalsIgnoreCase("october") ||
                month.equalsIgnoreCase("oct") ||
                month.equalsIgnoreCase("10")) {
            this.month = "Oct";
        } else if(month.equalsIgnoreCase("november") ||
                month.equalsIgnoreCase("nov") ||
                month.equalsIgnoreCase("11")) {
            this.month = "Nov";
        } else if(month.equalsIgnoreCase("december") ||
                month.equalsIgnoreCase("dec") ||
                month.equalsIgnoreCase("12")) {
            this.month = "Dec";
        } else {
            throw new IllegalArgumentException("You did not enter the right month");
        }

        if(day >= 1 && day <= 31) {
            this.day = day;
        } else {
            throw new IllegalArgumentException("The number cannot be less 1 or above 31");
        }

        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public String getMmDdYyyy() {
        return getMonth() + "-" + getDay() + "-" + getYear();
    }
}
