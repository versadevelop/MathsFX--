/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathsfx;

import javafx.event.EventHandler;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.WindowEvent;

/**
 *
 * @author jelis
 */
public class Player extends BorderPane {
     Media media; 
        MediaPlayer player; 
        MediaView view; 
        Pane mpane; 
        MediaBar bar; 
        public Player(String file) 
        { // Default constructor 
            media = new Media(file); 
            player = new MediaPlayer(media); 
            view = new MediaView(player); 
            mpane = new Pane(); 
            mpane.getChildren().add(view); // Calling the function getChildren 
  
            // inorder to add the view 
            setCenter(mpane); 
            bar = new MediaBar(player); // Passing the player to MediaBar 
            setBottom(bar); // Setting the MediaBar at bottom 
            setStyle("-fx-background-color:#bfc2c7"); // Adding color to the mediabar 
            player.play(); // Making the video play 
            
           
        } 

  
    } 