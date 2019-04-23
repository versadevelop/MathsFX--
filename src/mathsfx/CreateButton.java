/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathsfx;

import com.sun.javafx.scene.control.skin.ButtonSkin;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import static mathsfx.MathsFX.startAnimationButton;

/**
 *
 * @author jelis
 */
public class CreateButton extends Button {
   
    public CreateButton(String text,double W,double Y,double Scale) {
        super(text);
        getStylesheets().add(getClass().getResource("btn.css").toExternalForm());
        setTranslateX(W);
        setTranslateY(Y);
        setScaleY(Scale);
        startAnimationButton(this);
        setSkin(new MyButtonSkin(this));
    }
     
}
