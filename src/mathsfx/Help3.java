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
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.media.AudioClip;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author jelis
 */
class Help3 {
     public static void display(String title, ImageView img1, ImageView img2){        
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(250);
        AudioClip Sound = new AudioClip(Paths.get("src/Pop_clip.mp3").toUri().toString());
        Sound.play(0.80);
        Button closeButton = new Button("Κλείσιμο");
        closeButton.setOnAction(e -> window.close());
     
        StackPane layout = new StackPane();
        Label label = new Label("Μονάδα");
        label.setTextFill(Color.web("#FF00FF"));
        label.setFont(new Font("Arial", 24));
        label.setTranslateX(-20);
        label.setTranslateY(20);
        img2.setTranslateY(-20);
        img2.setTranslateX(-30);
        layout.getChildren().addAll(img1, img2, closeButton, label);
        layout.setAlignment(closeButton, Pos.TOP_CENTER);
        layout.setAlignment(img1, Pos.CENTER_LEFT);
        layout.setAlignment(img2, Pos.CENTER_RIGHT);
        layout.setAlignment(label, Pos.CENTER_RIGHT);
        Scene scene = new Scene(layout, 300, 300);
        window.setScene(scene);
        window.showAndWait();
     }
}
