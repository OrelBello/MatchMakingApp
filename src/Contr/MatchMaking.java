package Contr;

import java.util.Objects;

import Mod.read_file;
import Vie.ReverseInputPanel;
import Vie.ShowProfile;
public class MatchMaking {
	
	public static void main(String[] args) 
{

		}

@SuppressWarnings("static-access")
public	static void Match(Preferences_Class Mosses)
	{
	read_file T = new read_file(null);

		int j=0;
		int min_age=Integer.parseInt(Mosses.MinAge), min_height=Integer.parseInt(Mosses.MinHeight), max_age=Integer.parseInt(Mosses.MaxAge), max_height=Integer.parseInt(Mosses.MaxHeight);
		int Indexes[]= new int[Mod.read_file.j];
			
		// System.out.println(Mosses.Bodytype+","+ Mosses.Reigon+","+ Mosses.Religion+","+ Mosses.Sex+","+ Mosses.lookingfor+","+ Mosses.MinHeight+","+ Mosses.MaxHeight+","+ Mosses.MinAge+","+ Mosses.MaxAge+","+Mosses.Gambling+","+Mosses.Drinking+","+Mosses.Smoking+","+Mosses.Shabat+","+Mosses.Modesty+","+Mosses.Kosher+","+Mosses.Kids+","+Mosses.Served+","+Mosses.Single+","+Mosses.Divorced+","+Mosses.Widowed);
		for(int i=0; i<Mod.read_file.j; i++)
		{
			//if(T.Hava[i]==null)
				//break;
			if (Objects.equals((String) Mosses.Sex,(String)T.Hava[i].Sex_Choice))
				continue;
			if ((Mosses.Divorced == false)&&Objects.equals((String)T.Hava[i].Sex_Choice,"Divorced"))
				continue;
			if ((Mosses.Single == false)&&Objects.equals((String)T.Hava[i].Sex_Choice,"Single"))
				continue;
			if ((Mosses.Widowed == false)&&Objects.equals((String)T.Hava[i].Sex_Choice,"Widowed"))
				continue;
	
if (( Mosses.Kosher==true)&&(T.Hava[i].religion.Kosher==false))
	continue;
if (( Mosses.Shabat==true)&&(T.Hava[i].religion.Shabath==false))
	continue;
if (( Mosses.Modesty==true)&&(T.Hava[i].religion.Modesty==false))
	continue;
if (( Mosses.Served==true)&&(T.Hava[i].service.Served==false))
	continue;
if (( Mosses.Kids==true)&&(T.Hava[i].personal.HasKids==true))
	continue;
if (( Mosses.Gambling==true)&&(T.Hava[i].BadHabits.Gambling==true))
	continue;
if (( Mosses.Drinking==true)&&(T.Hava[i].BadHabits.Drinking==true))
	continue;
if (( Mosses.Smoking==true)&&(T.Hava[i].BadHabits.Smoking==true))
	continue;


if ( (max_height <(int) T.Hava[i].looks.Height)||((int) T.Hava[i].looks.Height < min_height) )
	continue;

if ( (max_age < T.Hava[i].BirthDay.age)||(T.Hava[i].BirthDay.age< min_age) )
		continue;
	
		if (!Objects.equals((String) Mosses.Bodytype,(String) T.Hava[i].looks.BodyTypeChoice))
			continue;
		if (!Objects.equals((String) Mosses.Religion,(String)T.Hava[i].religion.ReligoiusLevelChoice))
			continue;
		if (!Objects.equals((String) Mosses.Reigon,(String)T.Hava[i].Resience.ReigonChoice))
			continue;
		
{
	Indexes[j]=i;
		j++;
}
		
		
	}
	
		for(int i=0; i<Mod.read_file.j; i++)
		{
			System.out.println(T.Hava[Indexes[i]].name.FirstName+","+T.Hava[Indexes[i]].name.LastName);
		}
				ReverseInputPanel.frame5.setVisible(true);
				ReverseInputPanel.frame6.setVisible(false);
				ShowProfile.Show_Match(Indexes, j);

				
		

	}
}


