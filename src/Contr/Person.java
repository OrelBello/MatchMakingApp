package Contr;
import java.io.Serializable;

@SuppressWarnings("serial")
public class Person extends Ideal implements Serializable {
	
	public FullName name;
	public Boolean Active=true;  //P
	static int IDnum;
	int ID;
	
	public void IdNum() {
		IDnum++;
		ID= IDnum;
	}
	

}
