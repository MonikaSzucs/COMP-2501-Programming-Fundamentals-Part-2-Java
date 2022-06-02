public class Date {
    private int year;
    private String month;
    private int day;

    public Date(final int year, final String month, final int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public String getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public String getDate() {
        return getMonth() + " " + getDay() + ", " + getYear();
    }
}
