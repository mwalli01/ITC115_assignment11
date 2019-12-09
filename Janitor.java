package assignments;

//Janitor
//
//This subclass of employee that has less benefits than the employee class
//By: m.w.
//12/8/2019
//*******************************************************************

public class Janitor extends Employee{
	private int baseHoursModifier = 40;
	private int vacationDaysModifier = 5;
	private double salaryModifier = 10000.00;
	
	//Overrides getVacationDays from employee and subtract vacation days(5 days...)
	@Override
	public int getVacationDays(){
		return super.getVacationDays() - vacationDaysModifier;
	}
	
	//Overrides getHours and adds baseHoursModifier(40 more hours...)
	@Override
	public int getHours() {
		return super.getHours() + baseHoursModifier;
	}
	
	//override getSalary minus the modifier(10,000 dollars less...)
	@Override
	public double getSalary() {
		return super.getSalary() - salaryModifier;
	}
	
	//Special janitor ability
	public void clean() {
		System.out.println("Workin' for the man");
	}
	
}
