package project2999;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

public class OutputScreenFXMLController implements Initializable {

    @FXML
    private TextArea plan;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    
    public void getData(double salary, double goal, double expense, int time) {
        String s;
        String plans;
        double total = (salary - expense) * time;
        double leftOver = total - goal;
        double saveAmnt = goal / time;
        
        if(total == goal) {
            s = "Goal has been met exactly.";
        }
        else if(total > goal) {
            s = "Goal has been met with $" + leftOver + " left.";
        }
        else
            s = "Try another plan.";
        
        plans = "To save $" + goal + " in " + time + " months, you must save $" + saveAmnt + " a month. \n"
                + "Results based on input data: " + s;
        
        plan.setText(plans);
        
    }
    
}
