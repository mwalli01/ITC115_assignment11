package assignments;
//Lawyer
//
//A subclass of employee, that increases vacation days, pay and ability to "sue"
//By: m.w.
//12/8/2019
//*******************************************************************
public class Lawyer extends Employee {
	
	
	// overrides getVacationDays from Employee class
	@Override
	public int getVacationDays() {
		return super.getVacationDays() + 5;
	}

	// overrides getVacationForm from Employee class to get the lawyerVacationForm instead.
	@Override
	public String getVacationForm() {
		 return lawyerVacationForm;
	}

	// this is the Lawyer's added behavior
	public void sue() {
		System.out.println("I'll see you in court!");
	}
	
	
	// these are so that test cases can change the Lawyer values
	// and make sure that subclasses also change
	private String lawyerVacationForm = "pink";
	
	public final void setVacationForm(String form) {
		lawyerVacationForm = form;
	}
}

