package com.yash.ems.exceptions;

import java.sql.SQLException;

import com.yash.ems.service_implementation.EmployeeServiceImp;

/**
 * This is exception class  used to handle exceptions
 */

public class EmsExceptions 
{

	public void employeeLocException ()  throws SQLException{
	
			EmployeeServiceImp esi = new EmployeeServiceImp();
			esi.getEmployeeLoc();

}
}