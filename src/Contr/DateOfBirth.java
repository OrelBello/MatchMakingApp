package Contr;
import java.time.LocalDate;

import javax.swing.JOptionPane;

public class DateOfBirth {

public DateOfBirth(int day, int month, int year) 
{
	SetDay(day);
	SetMonth(month);
	SetYear(year);
	SetAge();
}

	public int day; //P
	public int month; //P
	public int year; //P
	public int age; //P
	
	public void SetAge() {  //P
		// TODO Auto-generated method stub
		
			int month_diff, day_diff, y, m, d;
		    y=LocalDate.now().getYear();
		    m=LocalDate.now().getMonthValue();
		    d=LocalDate.now().getDayOfMonth();
		    day_diff=d-day;
		    age = y-year;
		    month_diff=m-month;
		    if (month_diff<0)
		    	age--;
		    if (month_diff==0)
		    	if(day_diff<0)
		    		age--;
		} 
	
	
	
	
	
void SetDay(int day)
{
	if ((day > 0 )&&( day < 32))
	{
this.day = day;
	}
	else 
		JOptionPane.showMessageDialog(null, "Invaild parameter!");
}

	void SetMonth(int month)
	{
		if ((month > 0 )&&( month < 13))
		{
	this.month = month;
		}
		else 
			JOptionPane.showMessageDialog(null, "Invaild parameter!");
	}
	
		void SetYear(int year)
		{
			if ((year > 1920 )&&( year < 2002))
			{
		this.year = year;
			}
			else 
				JOptionPane.showMessageDialog(null, "Age do not meet the requirments! Must be between 18-99!");
		}
		
		int GetDay()
		{
			return this.day;
		}
		
		int GetMonth()
		{
			return this.month;
		}
		
		int GetYear()
		{
			return this.year;
		}
}




