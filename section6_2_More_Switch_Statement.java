public class section6_2_More_Switch_Statement {
    public static void main(String[] args) {

        int switchValue = 4;
        switch (switchValue) {
            case 1 -> System.out.println("Value is 1");
            case 2 -> System.out.println("Value is 2");
            case 3, 4, 5 -> {
                System.out.println("Value is 3 or 4 or 5");
                System.out.println("Actually it was a " + switchValue);
            }
            default -> System.out.println("Was not 1 or 2 or 3 or 4 or 5");
        }
        String month = "March";
        System.out.println(month + " is in the " + getQuater(month) + " quater");
    }

    public static String getQuater(String month) {

//        switch (month) {
//            case "January":
//            case "February":
//            case "March":
//                return "1st";
//            case "April":
//            case "May":
//            case "June":
//                return "2nd";
//            case "July":
//            case "August":
//            case "September":
//                return "3rd";
//            case "October":
//            case "November":
//            case "December":
//                return "4th";
//        }
//
//        return "Wrong Month entered  ";

        return switch (month) {
            case "January", "February", "March" -> {yield "1st";}
            case "April", "May", "June" -> "2nd";
            case "July", "August", "September" -> "3rd";
            case "October", "November", "December" -> "4th";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse;
            }
        };

    }
}
