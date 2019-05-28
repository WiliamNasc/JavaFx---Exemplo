package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MyController implements Initializable {

	int v1=0, v2 = 0;
	Operacoes op = new Operacoes();
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
		
	}
	
	
	
	@FXML
	private Button btnN1, btnN2,btnSoma;
	
	@FXML
	private Label txtBar;
	
	@FXML
	private TextField txtResult;
	
	public void val1 (ActionEvent event){
		
		txtResult.setText(txtResult.getText() + btnN1.getText());
	    v1 = op.guarda_Val(txtResult);
	   
	}
	
	public void val2 (ActionEvent event){
		
		txtResult.setText(txtResult.getText() + btnN2.getText());
		v2 = op.guarda_Val(txtResult);
		
	}
	
	public void soma (ActionEvent event){
		
		op.soma(v1, v2, txtResult);
		op.limpa_txt(txtResult);
	    
		
	}

}
