/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathsfx;

import static java.awt.SystemColor.window;
import java.nio.file.Paths;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.media.AudioClip;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author jelis
 */
class WrongAnswerBox {
  public static void display(String title, String message){
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(250);
        
        AudioClip Sound = new AudioClip(Paths.get("src/Sad_clip.mp3").toUri().toString());
        Sound.play(0.50);
        
        Label label = new Label();
        label.setText(message);
        
        Button closeButton = new Button("Κλείσιμο");
        closeButton.setOnAction(e -> window.close());
        
        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, closeButton);
        layout.setAlignment(Pos.CENTER);
        
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();
    }
}
