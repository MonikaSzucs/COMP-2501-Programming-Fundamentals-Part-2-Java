import java.util.*;

public class Calendar {
    private int counterStart;
    private int monthStart;
    private int dayStart;
    private int yearStart;
    private int yearEnd;

    private ArrayList<Integer> years;
    String[] months;
    ArrayList<Integer> days;
    Map<Integer, Date> dates;

    public Calendar(final int counterStart, final int monthStart, final int dayStart, final int yearStart, final int yearEnd) {
        this.counterStart = counterStart;
        this.monthStart = monthStart;
        this.dayStart = dayStart;
        this.yearStart = yearStart;
        this.yearEnd = yearEnd;

        years = new ArrayList<>();
        months = new String[12];
        days = new ArrayList<>();
        dates = new HashMap<>();
        for(int i = yearStart; i < yearEnd + 1; i++) {
            years.add(i);
        }

        months[0] = "January";
        months[1] = "February";
        months[2] = "March";
        months[3] = "April";
        months[4] = "May";
        months[5] = "June";
        months[6] = "July";
        months[7] = "August";
        months[8] = "September";
        months[9] = "October";
        months[10] = "November";
        months[11] = "December";

        for(int j = dayStart; j < 31; j++) {
            days.add(j);
        }

        int count = 1;
        for(int year: years) {
            for(int k = 0; k < months.length; k++) {
                Iterator<Integer> It;
                It = days.iterator();
                while(It.hasNext()) {
                    Integer day = It.next();
                    if(day >= 1) {
                        Date date;
                        date = new Date(year, months[k], day);
                        dates.put(count, date);
                        count++;
                    }
                }
            }
        }
    }

    public void setCounterStart(int counterStart) {
        this.counterStart = counterStart;
    }

    public void setMonthStart(int monthStart) {
        this.monthStart = monthStart;
    }

    public void setDayStart(int dayStart) {
        this.dayStart = dayStart;
    }

    public void setYearStart(int yearStart) {
        this.yearStart = yearStart;
    }

    public void setYearEnd(int yearEnd) {
        this.yearEnd = yearEnd;
    }

    public void printCalendar() {
        Set<Integer> keys;
        keys = dates.keySet();
        for(Integer key: keys) {
            Date grabbed = dates.get(key);
            System.out.println(key + ": " + grabbed.getMonth() + " " + grabbed.getDay() + ", " + grabbed.getYear());
        }
    }
}
