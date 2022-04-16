package ca.bcit.comp2501.lab1bHenry;

public class Date
{
    int year;
    int month;
    int day;

    //constructor
    public Date(int year, int month, int day)
    {
        if(0 < year && year < 2022){
            this.year = year;
        }
        else{
            System.out.println("Year invalid.");
            errorMsg = true;
        }

        if(0 < month && month < 13){
            this.month = month;
        }
        else{
            System.out.println("Month invalid.");
            errorMsg = true;
        }

        if(0 < day && day < 31){
            this.day = day;
        }
        else{
            System.out.println("Day invalid.");
            errorMsg = true;
        }
    }

    boolean errorMsg = false;

    public void setDate(int year, int month, int day)
    {
        if(0 > year || year > 2022){
            this.year = year;
        }
        else{
            System.out.println("Year invalid.");
            errorMsg = true;
        }

        if(0 < month && month < 13 ){
            this.month = month;
        }
        else{
            System.out.println("Month invalid.");
            errorMsg = true;
        }

        if(0 < day && day < 31){
            this.day = day;
        }
        else{
            System.out.println("Day invalid.");
            errorMsg = true;
        }
    }
    public void setYear(int year)
    {
        if(0 > year || year > 2022){
            this.year = year;
        }
        else{
            System.out.println("Year invalid.");
            errorMsg = true;
        }
    }
    public void setMonth(int month)
    {
        if(0 < month && month < 13){
            this.month = month;
        }
        else{
            System.out.println("Month invalid.");
            errorMsg = true;
        }
    }
    public void setDay(int day)
    {
        if(0 < day && day < 31){
            this.day = day;
        }
        else{
            System.out.println("Day invalid.");
            errorMsg = true;
        }
    }

    public int getYear(){
        return(year);
    }
    public int getMonth(){
        return(month);
    }
    public int getDay(){
        return(day);
    }

    public String getYyMmDd(){
        if(errorMsg){
            return "Error.";
        }
        return(""+year+"-"+month+"-"+day);
    }
}
