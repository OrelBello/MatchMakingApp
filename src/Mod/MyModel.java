package Mod;

import java.util.Observable;

public class MyModel extends Observable implements Mod {

	public void reverseString(String arg) {
		setChanged();
		notifyObservers(new StringBuilder(arg).reverse().toString());		
	}

	
}
