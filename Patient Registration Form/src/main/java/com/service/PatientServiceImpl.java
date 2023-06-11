package com.service;

import java.sql.Statement;

import com.db.db;
import com.model.Patient;

public class PatientServiceImpl implements PatientService{

	@Override
	public void Register(Patient patient) {
		String sql = "insert into form(fname,lname,email,phone,date_of_birth,gender,address,marital_status,medical_history,details)values('"+patient.getFname()+"','"+patient.getLname()+"','"+patient.getEmail()+"','"+patient.getPhone()+"','"+patient.getDate_of_birth()+"','"+patient.getGender()+"','"+patient.getAddress()+"','"+patient.getMarital_status()+"','"+patient.getMedical_history()+"','"+patient.getDetails()+"')";
		
		try {
			Statement stm = db.connectDb().createStatement();
			stm.execute(sql);
			
		}catch (Exception e) {
			e.printStackTrace();

		
	}

	}
}
