package Challenge;

public class Challenge5 {
    public static void main(String[] args) {
        System.out.println(getDurationString(-344449));
        System.out.println(getDurationString (-65, 54));
        System.out.println(getDurationString (449, 120));

    }
    public static String getDurationString(int seconds){
        int minutes  =0;
        String answer = "No valid value";
        if(seconds>=0)
        {
            minutes = seconds / 60;
            seconds = seconds % 60;
            answer = getDurationString(minutes, seconds)+ seconds + "s";
        }


        return answer;
    }
    public static String getDurationString(int minutes, int seconds){
        int hours =0;
        if((minutes>=0) && (seconds>=0 && seconds<=59)){
            hours = minutes / 60;
            minutes = minutes % 60;
        }
        else
        {
            return "No valid value";
        }
        return hours + "h " + minutes + "m ";

    }
}
