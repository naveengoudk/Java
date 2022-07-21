import java.util.Scanner;

public class Que_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] hourlyRates = new int[3];
        int[] workingHours = new int[3];
        int[] grossSalary = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.printf("Enter workingHours of employee : %d",i+1);
            int workingHour = sc.nextInt();
            workingHours[i] = workingHour;
            System.out.printf("enter hourly rate for employee : %d", i+1);
            int rate = sc.nextInt();
            hourlyRates[i] = rate;
        }

        for (int i = 0; i < 3; i++) {
            if (workingHours[i] > 40){
                int salaryAfter40Hours = (workingHours[i]-40) * (hourlyRates[i]/2);
                grossSalary[i] = (40 * hourlyRates[i]) + salaryAfter40Hours;
            } else{
                grossSalary[i] = workingHours[i] * hourlyRates[i];
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.printf("Gross salary of employee %d : %d", i+1 , grossSalary[i]);
            System.out.println();
        }

    }
}
