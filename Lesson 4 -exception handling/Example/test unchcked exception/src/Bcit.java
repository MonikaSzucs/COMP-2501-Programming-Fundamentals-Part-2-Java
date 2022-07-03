class Bcit {
    private final String department;
    private int budget;
    private Object name;
    private Object startDate;

    Bcit(final String department, final int budget, final Object name, final Object startDate) {
        this.department = department;
        this.budget = budget;
        this.name = name;
        this.startDate = startDate;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public void setName(Object name) {
        this.name = name;
    }

    public void setStartDate(Object startDate) {
        this.startDate = startDate;
    }

    public String getDepartment() {
        return department;
    }

    public int getBudget() {
        return budget;
    }

    public String getSalary() {
        if(department.equalsIgnoreCase("Marketing") && budget >= 100000) {
            return String.format("%.2f", budget * 0.70);
        }
        return "Incorrect department";
    }
}
