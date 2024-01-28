public class Worker extends Person
{
    double hourlyPayRate;

    public Worker(String ID, String firstName, String lastName, String title, int YOB, double hourlyPayRate)
    {
        super(ID, firstName, lastName, title, YOB);
        this.hourlyPayRate = hourlyPayRate;

    }

    public Worker(String firstName, String lastName, String title, int YOB, double hourlyPayRate) {
        super(firstName, lastName, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double calculateWeeklyPay(double hoursWorked)
    {
        double regularPay;
        double overtimePay;
        if(hoursWorked <=40)
        {
            regularPay = hoursWorked * hourlyPayRate;
            overtimePay = 0;
        }
        else
        {
            regularPay = 40 * hourlyPayRate;
            overtimePay = (hoursWorked - 40) * 1.5 *hourlyPayRate;
        }
        return regularPay + overtimePay;
    }
    public String displayWeeklyPay(double hoursWorked)
    {
        double regularPay;
        double overtimePay;

        if(hoursWorked <= 40)
        {
            regularPay = hoursWorked * hourlyPayRate;
            overtimePay = 0;
        }
        else
        {
            regularPay = 40 * hourlyPayRate;
            overtimePay = (hoursWorked - 40) * 1.5 *hourlyPayRate;
        }

        double totalPay = regularPay +overtimePay;

        return "Regular Hours: " + 40 + ", Regular Pay: $" + regularPay +
                "\nOvertime Hours: " + (hoursWorked - 40) + ", Overtime Pay $" + overtimePay +
                "\nTotal Pay: $" + totalPay;

    }
}
