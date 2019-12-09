package assignments;
//HarvardLawyer
//
//This is the subclass of employee that overrides some of employee's methods;
//increasing number of vacations days, increasing salary by 20% and modifying getVacationForm
//By: m.w.
//12/8/2019
//*******************************************************************
import java.util.Collections;

public class HarvardLawyer extends Lawyer {
	private int vacationModifier = 3;
	
	//Increase vacation days by 3
	@Override
	public int getVacationDays() {
		return super.getVacationDays() + vacationModifier;
	}
	
	//Increase salary by 20%
	@Override
	public double getSalary() {
		return super.getSalary() + ((super.getSalary() / 100)*(20)); // $40,000.00
	}
	
	//Just do a string repeat function on vacationForm. not sure if they wanted me to edit the lawyer file?..
	@Override
	public String getVacationForm() {
		 String repeat = String.join("", Collections.nCopies(4,super.getVacationForm()));
		 return repeat;
	}
}
