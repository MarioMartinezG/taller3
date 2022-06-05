package co.edu.unbosque.tinder;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import co.edu.unbosque.tinder.controller.MainController;
import co.edu.unbosque.tinder.view.MainView;

public class Application {

	public static void main(String[] args) {
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		new MainController(new MainView());
	}

}
