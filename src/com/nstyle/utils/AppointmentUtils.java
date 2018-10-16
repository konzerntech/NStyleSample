package com.nstyle.utils;

import java.util.ArrayList;
import java.util.List;

import com.nstyle.models.AppointmentModels;

public class AppointmentUtils {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public List<AppointmentModels> getValue(){
		
		List<AppointmentModels> appointmentList = null;
		appointmentList = new ArrayList<AppointmentModels>();
		for(int i =1; i<=5;i++){
			AppointmentModels appointment = new AppointmentModels();
			appointment.setClientName("Client "+i);
			appointment.setAppointmentDate("2018-10-02");
			appointment.setMobileNumber("050197390"+i);
			appointment.setServiceName("Service "+i);
			appointment.setShopName("Shop "+i);
			appointmentList.add(appointment);
		}
		
		return appointmentList;
	}

}
