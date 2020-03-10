import java.util.Scanner; //must have this

public class EmployeeSalary {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in); 
		String employeeFirstName = "";
		String employeeLastName = "";
		double hourlyPay = 0.0;
		double hoursWorked = 0.0;
		double amountEarned = 0.00;


		boolean done = false;
		while (!done) {
			System.out.print("Please Enter Employee first name: ");
			employeeFirstName = in.nextLine();
			if (employeeFirstName.equals("QUIT")) {
				done = true;
			}
			else {
				System.out.print("Please Enter Employee last name: ");
				employeeLastName = in.nextLine();
				do {
					System.out.print("Please Enter your hourly pay: ");
					hourlyPay = in.nextDouble();
				} while (hourlyPay<=0);
				do {
					System.out.print("Please Enter how many hours you worked: ");
					hoursWorked= in.nextDouble();
				} while (hoursWorked <= 0);
				in.nextLine();
				if (hoursWorked <=40) {
					amountEarned = hoursWorked*hourlyPay;
				}
				else {
					double overtimeHours = hoursWorked - 40;
					double overtimeHourlyPay = hourlyPay*1.5;
					double overtimePay = overtimeHours*overtimeHourlyPay;
					double regularPayHours = (hoursWorked-overtimeHours);
					amountEarned = (regularPayHours*hourlyPay) + overtimePay;
				}
				String payCheck = "Employee Name: " + employeeFirstName + " " + employeeLastName + "\n" + "Hours Worked: " + hoursWorked + "\n" + "Weekly Pay: $" +amountEarned;
				System.out.println(payCheck);
			}	
		}
		in.close();
	}
}



