/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathsfx;

import javafx.scene.control.Button;

/**
 *
 * @author jelis
 */
public class CreateButtonAnswersMultiply extends Button {
      public CreateButtonAnswersMultiply(String text,double W,double Y,double SW,double SY) {
        super(text);
        getStylesheets().add(getClass().getResource("btnMultiply.css").toExternalForm());
        setTranslateX(W);
        setTranslateY(Y);
        setScaleX(SW);
        setScaleY(SY);
        setSkin(new MyButtonSkin(this));
    }
}
