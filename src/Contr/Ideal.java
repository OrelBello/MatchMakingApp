package Contr;

public class Ideal extends Entity{

	public MilitaryService service; //P
	public String Sex[]= {" ","Male", "Female"}; //P
	public String Sex_Choice;
	public Studies education; //P
	public Values ratedValues; //P
	public Profession job; //P
	int IdNo;
	
	public void IdNum() {
		IdNo = 0;
	}
}
