/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathsfx;
 import javafx.application.Platform; 
    import javafx.beans.InvalidationListener; 
    import javafx.beans.Observable; 
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
    import javafx.event.ActionEvent; 
    import javafx.event.EventHandler; 
    import javafx.geometry.Insets; 
    import javafx.geometry.Pos; 
    import javafx.scene.control.Button; 
    import javafx.scene.control.Label; 
    import javafx.scene.control.Slider; 
import javafx.scene.input.MouseEvent;
    import javafx.scene.layout.HBox; 
    import javafx.scene.layout.Priority; 
    import javafx.scene.media.MediaPlayer; 
    import javafx.scene.media.MediaPlayer.Status; 
import javafx.util.Duration;
/**
 *
 * @author jelis
 */
class MediaBar extends HBox{
    // introducing Sliders 
        Slider time = new Slider(); // Slider for time 
        Slider vol = new Slider(); // Slider for volume 
        Button PlayButton = new Button("||"); // For pausing the player 
        Label volume = new Label("Volume: "); 
        MediaPlayer player; 
  
        public MediaBar(MediaPlayer play) 
        { // Default constructor taking 
            // the MediaPlayer object 
            player = play; 
  
            setAlignment(Pos.CENTER); // setting the HBox to center 
            setPadding(new Insets(5, 10, 5, 10)); 
            // Settih the preference for volume bar 
            vol.setPrefWidth(70); 
            vol.setMinWidth(30); 
            vol.setValue(100); 
            HBox.setHgrow(time, Priority.ALWAYS); 
            PlayButton.setPrefWidth(30); 
  
            // Adding the components to the bottom 
  
            getChildren().add(PlayButton); // Playbutton 
            getChildren().add(time); // time slider 
            getChildren().add(volume); // volume slider 
            getChildren().add(vol); 
  
            // Adding Functionality 
            // to play the media player 
            PlayButton.setOnAction(new EventHandler<ActionEvent>() { 
                @Override
                public void handle(ActionEvent e) 
                { 
                    Status status = player.getStatus(); // To get the status of Player 
                    if (status == status.PLAYING) { 
  
                        // If the status is Video playing 
                        if (player.getCurrentTime().greaterThanOrEqualTo(player.getTotalDuration())) { 
  
                            // If the player is at the end of video 
                            player.seek(player.getStartTime()); // Restart the video 
                            player.play(); 
                            
                        } 
                        else { 
                            // Pausing the player 
                            player.pause(); 
  
                            PlayButton.setText(">"); 
                        } 
                    } // If the video is stopped, halted or paused 
                    if (status == Status.HALTED || status == Status.STOPPED || status == Status.PAUSED) { 
                        player.play(); // Start the video 
                        PlayButton.setText("||"); 
                    } 
                } 
            }); 
  
            // Providing functionality to time slider 
            player.currentTimeProperty().addListener(new ChangeListener<Duration>() { 
                @Override
                public void changed(ObservableValue<? extends Duration> observable, Duration oldValue, Duration newValue) {
                  time.setValue(newValue.toSeconds());
                 
                }
                
            }); 
  
            // Inorder to jump to the certain part of video 
            time.setOnMouseClicked(new EventHandler<MouseEvent>() { 
               @Override
               public void handle(MouseEvent event){
                   player.seek(Duration.seconds(time.getValue()));
                } 
            }); 
  
            // providing functionality to volume slider 
            vol.valueProperty().addListener(new InvalidationListener() { 
                public void invalidated(Observable ov) 
                { 
                    if (vol.isPressed()) { 
                        player.setVolume(vol.getValue() / 100); // It would set the volume 
                        // as specified by user by pressing 
                    } 
                } 
            }); 
        }  
       
}
