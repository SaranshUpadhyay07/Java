package Challenge;

public class Challenge16 {
    public static void main(String[] args) {

    }
}
class Worker{
    private String name;
    private String birthDate;
    private String endDate;

    Worker(String name, String birthDate){
        this.name = name;
        this.birthDate = birthDate;
    }
    public int getAge(){
        int currentYear = 2025;
        int birthYear = Integer.parseInt(birthDate.substring(6));
        return (currentYear - birthYear);
    }
    public double getSalary(){
        return 0.0;
    }
    public void terminate(String endDate){
        this.endDate = endDate;
    }
}
class employee extends Worker{
    private long employeeId;
    private String hierarchy;
    employee(String name, String birthDate, String endDate, long employeeId, String hierarchy){
        super(name, birthDate);
        terminate(endDate);
        this.employeeId = employeeId;
        this.hierarchy = hierarchy;
    }
}
class SalariedEmployee extends employee{
    private double annualSalary;
    private boolean isRetired;

    SalariedEmployee(String name, String birthDate, String endDate, long employeeId, String hierarchy, double annualSalary, boolean isRetired){
        super(name, birthDate, endDate, employeeId, hierarchy);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }
    public void retire(){
        if(isRetired){
            System.out.println("Retired");
        }
        else{
            System.out.println("Not retired");
        }
    }
}

class HourlyEmployee extends employee{
    private double hourlyRate;
    HourlyEmployee(String name, String birthDate, String endDate, long employeeId, String hierarchy, double hourlyRate){
        super(name, birthDate, endDate, employeeId, hierarchy);
        this.hourlyRate = hourlyRate;
    }

    public void getDoublePay(){

    }
}
