public class TestMyDate {
    public static void main(String[] args) {

        MyDate myBirth = new MyDate(22, 7, 1964);
        myBirth.print();

	MyDate theNextWeek = myBirth.addDays(7);
        theNextWeek.print();

    }
}
