package com.example.demo2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.scene.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
//import java.io.FileNotFoundException;

public class testing1controller {
    @FXML
    private Label welcomeText;
    private Label playernum;
     int turnNum=1;
    private Image board0,board1,board2,board3;
    private ImageView b0,b1,b2,b3;
    @FXML

    public  void main(String args[]) throws FileNotFoundException {

       startingStuff();

        images();
    }
    public void startingStuff(){
        playTest();
    }


    public void images() throws FileNotFoundException {
        FileInputStream b0stream= new FileInputStream("C:\\Users\\slhscs317\\IdeaProjects\\demo2\\src\\main\\resources\\com\\example\\demo2\\board0.png");
        board0=new Image(b0stream );
        b0=new ImageView(board0);
        b0.setPreserveRatio(true);
        b0.setVisible(true);

    }
    public void TESTING() {
        System.out.println("TESTING");
    }
    public void playTest(){

       welcomeText.setText("Player "+turnNum);
    }
    public void nextTurn(){



        turnNum=turnNum+1;
        if(turnNum%5==0) {
            turnNum %= 5;
            turnNum+=1;
        }
        welcomeText.setText("Player "+turnNum);
    }
    public void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}