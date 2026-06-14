import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int EMPLOYEES = 10;

        // Arrays to store salary and years of service
        double[] salary = new double[EMPLOYEES];
        double[] yearsOfService = new double[EMPLOYEES];

        // Arrays to store bonus and new salary
        double[] bonus = new double[EMPLOYEES];
        double[] newSalary = new double[EMPLOYEES];

        // Variables to keep totals
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        // Input salary and years of service
        for (int i = 0; i < EMPLOYEES; i++) {
            System.out.println("Employee " + (i + 1) + ":");

            // Input salary
            while (true) {
                System.out.print("Enter salary: ");
                salary[i] = sc.nextDouble();
                if (salary[i] > 0) break;
                System.out.println("Invalid salary. Please enter a positive number.");
            }

            // Input years of service
            while (true) {
                System.out.print("Enter years of service: ");
                yearsOfService[i] = sc.nextDouble();
                if (yearsOfService[i] >= 0) break;
                System.out.println("Invalid years of service. Please enter 0 or positive number.");
            }

            System.out.println();
        }

        // Calculate bonus, new salary, and totals
        for (int i = 0; i < EMPLOYEES; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Display results
        System.out.println("\nEmployee Details:");
        for (int i = 0; i < EMPLOYEES; i++) {
            System.out.println("Employee " + (i + 1) + ": Old Salary = " + salary[i] + ", Bonus = " + bonus[i] + ", New Salary = " + newSalary[i]);
        }

        System.out.println("\nTotal Bonus Paid by Zara: " + totalBonus);
        System.out.println("Total Old Salary of all Employees: " + totalOldSalary);
        System.out.println("Total New Salary of all Employees: " + totalNewSalary);

        sc.close();
    }
}
