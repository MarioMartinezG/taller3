package co.edu.unbosque.tinder.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.tinder.model.PreferenceModel;
import co.edu.unbosque.tinder.model.UserModel;
import co.edu.unbosque.tinder.view.MenuView;
import co.edu.unbosque.tinder.view.PreferenceView;

public class PreferenceController {
	private PreferenceView preferenceView;

	public PreferenceController(PreferenceView preferenceView, MenuView menuView, PreferenceModel preferenceModel, UserModel loggedUser) {
		this.preferenceView = preferenceView;
		
		if(loggedUser.getPreference() != null) {
			this.preferenceView.getMinAgeFld().setText(Integer.toString(loggedUser.getPreference().getMinAge()));
			this.preferenceView.getMaxAgeFld().setText(Integer.toString(loggedUser.getPreference().getMaxAge()));
			this.preferenceView.getGenderCbx().setSelectedItem(loggedUser.getPreference().getGender());
			this.preferenceView.getCityCbx().setSelectedItem(loggedUser.getPreference().getCity());
		}
		
		this.preferenceView.getSaveBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					int minAge = Integer.parseInt(preferenceView.getMinAgeFld().getText());
					int maxAge = Integer.parseInt(preferenceView.getMaxAgeFld().getText());
					String gender = (String) preferenceView.getGenderCbx().getSelectedItem();
					String city = (String) preferenceView.getCityCbx().getSelectedItem();
					
					preferenceModel.setMinAge(minAge);
					preferenceModel.setMaxAge(maxAge);
					preferenceModel.setGender(gender);
					preferenceModel.setCity(city);
					
					loggedUser.setPreference(preferenceModel);
					
					preferenceView.showConfirmationMessage("Preferences set successfully!");
					preferenceView.hideFrame();
					menuView.showFrame();
				} catch (NumberFormatException e1) {
					preferenceView.showErrorMessage("Minimum and Maximum ages must be numbers");
					e1.printStackTrace();
				} catch (Exception e2) {
					System.out.println("Error inesperado");
					e2.printStackTrace();
				}
			}
		});
		
		this.preferenceView.getReturnBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					preferenceView.hideFrame();
					menuView.showFrame();
				} catch (Exception e1) {
					System.out.println("Error inesperado");
					e1.printStackTrace();
				}
			}
		});
	}

}
