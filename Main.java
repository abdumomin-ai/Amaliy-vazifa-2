public class Main {
    public static void main(String[] args) {
        MyTime time = new MyTime(23, 59, 59);
        System.out.println( time);

        time.nextSecond();
        System.out.println( time);

        time.nextMinute();
        System.out.println( time);

        time.nextHour();
        System.out.println(time);

        time.previousSecond();
        System.out.println( time);

        time.previousMinute();
        System.out.println( time);

        time.previousHour();
        System.out.println( time);
    }

}
