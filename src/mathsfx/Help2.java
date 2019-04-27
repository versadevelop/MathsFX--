/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathsfx;

import java.nio.file.Paths;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.media.AudioClip;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author jelis
 */
class Help2 {
     public static void display(String title, String helping){        
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(250);
        
        Button closeButton = new Button("Κλείσιμο");
        closeButton.setOnAction(e -> window.close());
        AudioClip Sound = new AudioClip(Paths.get("src/Pop_clip.mp3").toUri().toString());
        Sound.play(0.80);
        StackPane layout = new StackPane();
        
        Label label = new Label();
        label.setText(helping);
        
        layout.getChildren().addAll(label, closeButton);
        layout.setAlignment(closeButton, Pos.TOP_CENTER);
        layout.setAlignment(label, Pos.CENTER);
        Scene scene = new Scene(layout, 150, 150);
        window.setScene(scene);
        window.showAndWait();
     }
}
