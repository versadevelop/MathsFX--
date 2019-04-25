/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathsfx;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;

/**
 *
 * @author Alexandros
 */
public class CreateButtonsAddWithMinWidthAndSize extends Button {
    
    public CreateButtonsAddWithMinWidthAndSize(String image,double W,double Y,double mH,double mW, double sizex, double sizey) {
        Image insert = new Image(getClass().getResourceAsStream(image), sizex, sizey, false, false);
        setGraphic(new ImageView(insert));
        setTranslateX(W);
        setTranslateY(Y);
        setSkin(new MyButtonSkin(this));
        setMinHeight(mH);
        setMinWidth(mW);
    }
}
