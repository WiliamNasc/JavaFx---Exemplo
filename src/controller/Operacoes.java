package controller;


import javafx.scene.control.TextField;

public class Operacoes {
	
	int val;
	int v1, v2;
	int soma;
	
	public void soma (int v1, int v2, TextField txt){
		
		if (v1 != 0 && v2 != 0){
			
			
			
		System.out.println("Somar v1: " + v1);
		txt.setText("");
		System.out.println("Somar v2: " + v2);
		soma = v1 + v2;
		System.out.println("Soma = " + soma);}
		
	}
	
	public int guarda_Val (TextField txt){
		
		val = Integer.parseInt(txt.getText());
		System.out.println("Valor: " + val);
		
		return val;
	}
	
	public void limpa_txt (TextField txt){
		
		txt.setText("");
	}

}
