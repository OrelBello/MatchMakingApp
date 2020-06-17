package Contr;

public class Factory{
public static Ideal Fact(String str)
{
	if (str == "Person")
	{
		
Person obj = new Person();
obj.looks=new PhysicalCharacteristics();
obj.education=new Studies();
obj.service=new MilitaryService();
obj.job=new Profession();
obj.Resience=new Location();
obj.Language=new Languages();
obj.job.WorkPlace= new Location();
obj.education.F_Loaction=new Location();
obj.BadHabits = new Habits();
obj.personal = new PersonalInfo();
obj.ratedValues = new Values();
obj.religion = new Religion();
	return (Person) obj;	
		}
	else if (str == "Ideal")
	{
		Ideal obj = new Ideal();
		obj.education=new Studies();
		obj.education.F_Loaction=new Location();
		obj.job=new Profession();
		obj.job.WorkPlace= new Location();
		obj.ratedValues = new Values();
		obj.service=new MilitaryService();
return obj;
		}
	return null;
	}


}
