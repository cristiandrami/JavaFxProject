package application.controller.professor;

import java.io.IOException;

import application.SceneHandler;
import application.net.client.ProfessorClient;
import application.professor.ProfessorUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ProfAssignmentController 
{
	@FXML
    private TextArea assignmentTextArea;

    @FXML
    private Button closeButton;

    @FXML
    private ImageView logoView;

    @FXML
    private Button sendAssignment;
    @FXML
    private Button backButton;


    

    @FXML
    void sendAssignmentClicked(ActionEvent event) 
    {
    	String assignment=assignmentTextArea.getText();
    	if(assignment.equals(""))
    	{
    		SceneHandler.getInstance().showWarning(ProfessorUtil.ASSIGNMENTPROBLEM);
    		return;
    	}
    	
    	if(ProfessorClient.getInstance().sendAssigment(assignment))
    	{
    		SceneHandler.getInstance().showInformation(ProfessorUtil.ASSIGNMENTSENT);
    		assignmentTextArea.setText("");
    		
    	}
    		
    		
    	

    }


    @FXML
    void closeClicked(ActionEvent event) 
    {
    	ProfessorClient.getInstance().reset();
    	System.exit(0);

    }
    @FXML
    void backClicked(ActionEvent event) 
    {
    	assignmentTextArea.setPromptText(ProfessorUtil.PROMTTEXTINSERTASSIGNMENT);
    	try 
    	{
			SceneHandler.getInstance().setProfHomePage();
		} catch (IOException e) 
    	{
			System.out.println(ProfessorUtil.BACKTOHOMEPROBLEM);
		}

    }
    
    @FXML
    void initialize()
    {
    	logoView.imageProperty().set(new Image(getClass().getResourceAsStream("/loginResources/logoLogin.jpg"))); 
    	
    }

}
