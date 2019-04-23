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
 * @author jelis
 */
public class CreateButtonsAdd extends Button {

    public CreateButtonsAdd(String image,double W,double Y) {
        Image Number61Image = new Image(getClass().getResourceAsStream(image), 60, 60, false, false);
        setGraphic(new ImageView(Number61Image));
        setTranslateX(W);
        setTranslateY(Y);
        setSkin(new MyButtonSkin(this));
    }
    
}
