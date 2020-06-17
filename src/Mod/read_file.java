package Mod;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import Contr.*;


public class read_file {
static String fname, lname, dayt, montht, yeart;
static int day, month, year;
static public int j;
static public Person[] Hava = new Person[30];

    public read_file(Preferences_Class Mosses) {

for (int k=0; k< 30; k++)
{
	Hava[k] = (Person) Factory.Fact("Person");
}
;
        String csvFile = "test33.txt";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
j=0;
        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] test = line.split(cvsSplitBy);

		Hava[j].name = new FullName(test[0], test[1]);
		Hava[j].Sex_Choice=test[2]; //fix null problem
		Hava[j].BirthDay = new DateOfBirth(Integer.parseInt(test[3]), Integer.parseInt(test[4]), Integer.parseInt(test[5]) );
		//age calculated automatically
		Hava[j].personal.StatusChoice=test[7];		//
		Hava[j].personal.HasKids=Boolean.valueOf(test[8]); //fix issue null
		Hava[j].personal.astrological_sign_Choice=test[9];
		Hava[j].looks.Height=Double.parseDouble(test[10]);
		Hava[j].looks.Glasses= Boolean.valueOf(test[11]);
		Hava[j].looks.HairColorChoice= test[12];
		Hava[j].looks.EyeColorChoice=test[13];  //
		Hava[j].looks.FacialHairChoice= test[14];//
		Hava[j].looks.BodyTypeChoice= test[15];
		Hava[j].Resience.ReigonChoice = test[16];
		Hava[j].Resience.Cities= test[17];
		Hava[j].Language.LangChoice= test[18];
		Hava[j].education.SubjectChoice= test[19];
		Hava[j].education.YearOfStudies= Integer.parseInt(test[19]);
		Hava[j].education.Facility=test[20];
		Hava[j].education.F_Loaction.ReigonChoice= test[21];
		Hava[j].education.F_Loaction.Cities= test[22];
		Hava[j].service.Served= Boolean.valueOf(test[23]);
		Hava[j].service.NumbersOfYears= Integer.parseInt(test[24]);
		Hava[j].service.CatagoryChoice= test[25];
		Hava[j].service.Profession= test[26];//
		Hava[j].religion.ReligoiusLevelChoice=test[27];
		Hava[j].religion.NumOfPrayChoice=test[28];//
		Hava[j].religion.Shabath= Boolean.valueOf(test[29]);
		Hava[j].religion.Kosher= Boolean.valueOf(test[30]);
		Hava[j].religion.Modesty= Boolean.valueOf(test[31]);
		Hava[j].BadHabits.Smoking= Boolean.valueOf(test[32]);
		Hava[j].BadHabits.Drinking= Boolean.valueOf(test[33]);
		Hava[j].BadHabits.Gambling= Boolean.valueOf(test[34]);
		Hava[j].job.Field= test[35];
		Hava[j].job.Profession= test[36];
		Hava[j].job.NumHoursChoice= test[37];
		Hava[j].job.TypeChoice= test[38];
		Hava[j].job.WorkPlace.ReigonChoice= test[39];
		Hava[j].job.WorkPlace.Cities= test[40];
		Hava[j].ratedValues.OptionsChoice= test[41];
		
		

j++;
}
            
           for (int k=0; k< 22; k++)
           {
            	System.out.println("Hava"+k+":"+Hava[k].name.FirstName+","+Hava[k].name.LastName+","+ Hava[k].Sex_Choice+","+ Hava[k].BirthDay.day+","+ Hava[k].BirthDay.month+","+ Hava[k].BirthDay.year +","+ Hava[k].BirthDay.age+","+ Hava[k].personal.StatusChoice+","+ Hava[k].personal.HasKids+","+ Hava[k].personal.astrological_sign_Choice+","+ Hava[k].looks.Height+","+ Hava[k].looks.Glasses+","+ Hava[k].looks.HairColorChoice+","+ Hava[k].looks.EyeColorChoice+","+ Hava[k].looks.FacialHairChoice+","+ Hava[k].looks.BodyTypeChoice+","+ Hava[k].Resience.ReigonChoice+","+ Hava[k].Resience.Cities+","+ Hava[k].Language.LangChoice+","+ Hava[k].education.SubjectChoice+","+ Hava[k].education.YearOfStudies+","+ Hava[k].education.Facility+","+ Hava[k].education.F_Loaction.ReigonChoice+","+ Hava[k].education.F_Loaction.Cities+","+ Hava[k].service.Served+","+ Hava[k].service.NumbersOfYears+","+ Hava[k].service.CatagoryChoice+","+ Hava[k].service.Profession+","+ Hava[k].religion.ReligoiusLevelChoice+","+ Hava[k].religion.NumOfPrayChoice+","+ Hava[k].religion.Shabath+","+ Hava[k].religion.Kosher+","+ Hava[k].religion.Modesty+","+Hava[k].BadHabits.Smoking+","+ Hava[k].BadHabits.Drinking+","+ Hava[k].BadHabits.Gambling+","+ Hava[k].job.Field+","+ Hava[k].job.Profession+","+ Hava[k].job.NumHoursChoice+","+ Hava[k].job.TypeChoice+","+ Hava[k].job.WorkPlace.ReigonChoice+","+ Hava[k].job.WorkPlace.Cities+","+ Hava[k].ratedValues.OptionsChoice );

            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}