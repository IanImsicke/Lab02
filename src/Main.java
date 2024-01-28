import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        ArrayList<Worker> workers = new ArrayList<>();

        workers.add(new Worker("000001", "George", "Cooper", "Mr.", 2005, 12.00));
        workers.add(new Worker("000002", "John", "Joesph", "Mr.", 2005, 13.00));
        workers.add(new Worker("000003", "Bob", "Johnson", "Mr.", 2005, 14.00));



        workers.add(new SalaryWorker("000004", "Ben", "Cooper", "Mr.", 2005, 34000.00));
        workers.add(new SalaryWorker("000005", "Chad", "Johnson", "Mr.", 2005, 35000.00));
        workers.add(new SalaryWorker("000006", "Carson", "Anderson", "Mr.", 2005, 36000.00));



        for(int week = 1; week <=3; week++)
        {
            System.out.println("Week " + week + " Payroll:");
            System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s\n", "ID", "First", "Last", "Title", "YOB", "Pay");
            System.out.println("---------------------------------------------------------------");


            for (Worker worker : workers)
            {

                double hoursWorked;

                if (week == 1)
                {
                    hoursWorked = 40.0;
                }
                else if (week == 2)
                {
                    hoursWorked = 50.0;
                }
                else
                {
                    hoursWorked = 40.0;
                }

                double weeklyPay = worker.calculateWeeklyPay(hoursWorked);
                System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s\n", worker.getID(), worker.getFirstName(), worker.getLastName(), worker.getTitle(), worker.getYOB(), weeklyPay);
            }
            System.out.println();
        }

    }
}