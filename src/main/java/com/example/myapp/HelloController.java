package com.example.myapp;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    Calculator calc = new Calculator();

    @FXML
    private TextField text;

    @FXML
    private void onClickBut1(){
        String val = text.getText();
        val = val + "1";
        text.setText(val);

    }

    @FXML
    private void onClickBut2(){
        String val = text.getText();
        val = val + "2";
        text.setText(val);

    }

    @FXML
    private void onPlusClick(){
        String op1 = text.getText();
        text.setText("");

        calc.setOp1( Integer.parseInt(op1) );
        calc.setOperator('+');

    }

    @FXML
    private void onEqualClick(){

        String op2 = text.getText();
        calc.setOp2( Integer.parseInt(op2) );
        calc.calculate();
        text.setText("" +  calc.getResult() );

    }



}