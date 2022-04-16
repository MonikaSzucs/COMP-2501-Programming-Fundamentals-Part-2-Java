package ca.bcit.comp2501.lab1bHenry;

import java.util.Locale;

public class Name {
    String first;
    String last;

    public Name(String first, String last){
        this.first = first;
        this.last = last;
    }

    private void setFirst(String first){
        this.first = first;
    }
    private void setLast(String last){
        this.last = last;
    }

    public String getFirst(){
        return first;
    }
    public String getLast(){
        return last;
    }

    public String getFullName(){
        return(first+" "+last);
    }

    public String getInitials(){
        return first.toUpperCase().charAt(0)+"."+last.toUpperCase().charAt(0)+".";
    }
}
