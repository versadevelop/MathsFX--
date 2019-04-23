/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathsfx;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author Alexandros
 */
public class CreateHelpButton extends Button {

    public CreateHelpButton(double W,double Y) {
        Image HelpImage = new Image(getClass().getResourceAsStream("/info2.jpg"), 20, 20, false, false);
        setGraphic(new ImageView(HelpImage));
        setTranslateX(W);
        setTranslateY(Y);
        setSkin(new MyButtonSkin(this));
    }
}
