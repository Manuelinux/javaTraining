public class MyDate {

    private int day   = 1;            // some instance variables
    private int month = 1;
    private int year  = 2000;

                                     // Constructor that takes
                                     // individual values
    public MyDate(int day, int month, int year) {
        this.day   = day;            // <-- note use of 'this'
        this.month = month;
        this.year  = year;
    }

                                    // Constructor that takes
                                    // a MyDate object
    public MyDate(MyDate date) {
        this.day   = date.day;      // 'this' is redundant here
        this.month = date.month;
        this.year  = date.year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;           // <-- note use of 'this'
    }

                                  // Not Yet Implemented:
                                  // wrap around code...
    public MyDate addDays(int moreDays) {
        MyDate newDate = new MyDate(this);      // <-- note 'this'
        newDate.day = newDate.day + moreDays;
        return newDate;
    }

                                  // Utility method
    public void print() {
        System.out.println(
                "MyDate: " + day + "-" + month + "-" + year);
    }

}
