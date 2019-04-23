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
public class CreateButtonsAddWithMinWidth extends Button {

    public CreateButtonsAddWithMinWidth(String image,double W,double Y,double mH,double mW) {
        Image insert = new Image(getClass().getResourceAsStream(image), 60, 60, false, false);
        setGraphic(new ImageView(insert));
        setTranslateX(W);
        setTranslateY(Y);
        setSkin(new MyButtonSkin(this));
        setMinHeight(mH);
        setMinWidth(mW);
    }
    
}
