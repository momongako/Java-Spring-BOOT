package model;

public class Employee {
    private int id;
    private String fullName;
    private String email;
    private int hourWordPerDay;
    private int longWord;
    private double fixedSalary;
    private int outsideServiceNumber;
    private double totalSalary;

    public Employee() {
        super();
    }

    public Employee(int id, String fullName, String email, int hourWordPerDay, int longWord, double fixedSalary, int outsideServiceNumber, double totalSalary) {
        super();
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.hourWordPerDay = hourWordPerDay;
        this.longWord = longWord;
        this.fixedSalary = fixedSalary;
        this.outsideServiceNumber = outsideServiceNumber;
        this.totalSalary = totalSalary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getHourWordPerDay() {
        return hourWordPerDay;
    }

    public void setHourWordPerDay(int hourWordPerDay) {
        this.hourWordPerDay = hourWordPerDay;
    }

    public int getLongWord() {
        return longWord;
    }

    public void setLongWord(int longWord) {
        this.longWord = longWord;
    }

    public double getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    public int getOutsideServiceNumber() {
        return outsideServiceNumber;
    }

    public void setOutsideServiceNumber(int outsideServiceNumber) {
        this.outsideServiceNumber = outsideServiceNumber;
    }

    public double getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(double totalSalary) {
        this.totalSalary = totalSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", hourWordPerDay=" + hourWordPerDay +
                ", longWord=" + longWord +
                ", fixedSalary=" + fixedSalary +
                ", outsideServiceNumber=" + outsideServiceNumber +
                ", totalSalary=" + totalSalary +
                '}';
    }
}
