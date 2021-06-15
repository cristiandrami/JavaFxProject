package application.net.common;

public class Protocol {
	public final static String LOGIN= "login";
	public final static String REGISTRATION= "registration";
	
	//************************************ PROFESSOR *******************************//
	public final static String GETSTUDENTSFORPROF = "get students for professor";
	public static final String GETSUFFICIENTSTUDENS = "sufficient students";
	public static final String GETUNSUFFICIENTSTUDENS = "unsufficient students";
	public static final String GETTOTALSTUDENTS = "total students";
	public static final String SENDASSIGNMENT = "send assignment";
	public static final String UPDATESTUDENTVOTE = "update student vote";
	
	//*************************************STUDENT**********************************//
	public static final String GETVOTES = "get votes";
	public static final String GETUNSUFFICIENTSTUDENTVOTES = "get unsufficient number votes";
	public static final String GETSUFFICIENTSTUDENTVOTES = "get sufficient number votes";
	public static final String GETSTUDENTSWAITINGVOTES = "get waiting number votes";
	
	
	public final static String OK= "ok";
	
	public final static String ERROR= "error during connection";
	public final static String AUTHENTICATION_ERROR= "Username o password non valide";
	public final static String USER_LOGGED_ERROR= "L'utente è già loggato";
	public final static String USER_EXISTS_ERROR= "L'username è già stato scelto, riprova con uno nuovo";
	public final static String SUBJECT_ERROR= "La materia inserita non è presente nel database della scuola, riprova";

	
	

	
	
	
	
	
	


}