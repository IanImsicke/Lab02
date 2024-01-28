import java.sql.SQLOutput;

public class SalaryWorker extends Worker
{
    private double annualSalary;

    public SalaryWorker(String ID, String firstName, String lastName, String title, int YOB, double annualSalary)
    {
        super(ID, firstName, lastName, title, YOB, annualSalary);
        this.annualSalary = annualSalary;

    }

    public SalaryWorker(String firstName, String lastName, String title, int YOB, double hourlyPayRate, double annualSalary, double calculateWeeklyPay)
    {
        super(firstName, lastName, title, YOB, calculateWeeklyPay);
        this.annualSalary = annualSalary;
    }
    @Override
    public double calculateWeeklyPay(double hoursWorked)
    {
        return annualSalary / 52.0;
    }
    @Override
    public String displayWeeklyPay(double hoursWorked)
    {
        String a ="Weekly pay is a fraction of the yearly salary.";
        return a;
    }


}
