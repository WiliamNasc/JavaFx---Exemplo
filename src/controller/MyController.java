package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MyController implements Initializable {

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
		
	}
	
	@FXML
	private Button btnFoo;
	
	@FXML
	private Label txtBar;
	
	@FXML
	private TextField txtResult;
	
	public void changeText (ActionEvent event){
		
		txtBar.setText("Horray!");
		int val = Integer.parseInt(txtResult.getText());
		int soma = val * 2;
		JOptionPane.showMessageDialog(null, "resultado = " + soma);
		
	}

}
