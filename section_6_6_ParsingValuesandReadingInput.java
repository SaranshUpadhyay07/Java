public class section_6_6_ParsingValuesandReadingInput {
    public static void main(String[] args) {
        int current_year = 2024;
        String userDateofBirth = "1999";
        int dateofBirth = Integer.parseInt(userDateofBirth);
        System.out.println("Age = "+ (current_year - dateofBirth));
        String usersAgeWithPartialYear = "24.5";
        double ageWithPartialYear = Double.parseDouble(usersAgeWithPartialYear);
        System.out.println("The person says is "+ageWithPartialYear+ " years old");
    }
}
