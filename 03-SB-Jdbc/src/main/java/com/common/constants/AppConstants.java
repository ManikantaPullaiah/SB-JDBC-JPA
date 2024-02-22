package com.common.constants;

public class AppConstants {
	
	
	public static final String  PERSON_INSERT_QUERY="INSERT INTO PERSON(PID,NAME,GENDER,AGE) VALUES(?,?,?,?)";
	
	public static final String PERSON_UPDATE_QUERY="UPDATE PERSON SET AGE = ? WHERE PID = ?";
	
	public static final String PERSON_DELETE_QUERY="DELETE FROM PERSON WHERE PID=?";
	
	public static final String PERSON_FIND_QUERY="SELECT * FROM PERSON WHERE PID=?";

}
