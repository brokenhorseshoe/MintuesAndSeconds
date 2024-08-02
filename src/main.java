public class main {
    public static void main(String[] args) {
        System.out.println(getDurationString(-3945)); // this is the first test call
        System.out.println(getDurationString(-65,45));
        System.out.println(getDurationString(65,145));
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3945));
    }
    public static  String getDurationString(int seconds) {
        // Two step approach to get hours
        if (seconds <0){
            return "Invalid data for seconds";
        }
        int minutes = seconds / 60;
        int hours = minutes /60;
//        System.out.println("hours = " + hours);

//        // one step approach to het hours
//        int hours1 = seconds / 3600;
//        System.out.println("hours1 = " + hours1);

        int remainingMinutes = minutes % 60;
//        System.out.println("Minutes = " + minutes);
//        System.out.println("remainingMinutes = " + remainingMinutes);

        int remainingSeconds = seconds % 60;
//        System.out.println("remainingSeconds = " + remainingSeconds );

        return hours + "h " + remainingMinutes + "m " + remainingSeconds + "S ";
    }
    public  static String getDurationString(int minutes , int seconds){  // Two step approach to get hours

        if ( minutes < 0 ) {
            return "Invalid data for seconds";

        }
        if (seconds < 0 || seconds > 59)
        {
            return "Invalid data for seconds(" + seconds + " ), must be between 0 and 59";
        }
        int hours = minutes /60;
        int remainingMinutes = minutes % 60;
        int remainingSeconds = seconds % 60;
        return hours + "h " + remainingMinutes + "m " + remainingSeconds + "S ";

    }
}
