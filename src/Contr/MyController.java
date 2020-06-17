package Contr;

import java.util.Observable;

import Mod.Mod;
import Mod.MyModel;
import Vie.MyView;
import Vie.Vie;

public class MyController implements Contr{

	private Mod model;
	private Vie view;
	
	public MyController(Mod model, Vie view){
		this.view = view;
		this.model = model;
	}
	
	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof MyView) {
			((MyModel)model).reverseString((String)arg);
		}
		
	}

}
