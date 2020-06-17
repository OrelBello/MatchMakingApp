package Contr;

import Mod.Mod;
import Mod.MyModel;
import Vie.MyView;
import Vie.Vie;

public class MVCDriver {

	public static void main(String[] args) {
		Mod model = new MyModel();
		Vie view = new MyView();
		Contr controller = new MyController(model, view);
		((MyModel)model).addObserver(controller);
		((MyView)view).addObserver(controller);
		view.start();
	}

}
