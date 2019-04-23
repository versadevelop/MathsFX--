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
public class CreateButtonAnswers extends Button{
    
    public CreateButtonAnswers(String text,double W,double Y) {
        super(text);
        getStylesheets().add(getClass().getResource("btnAnswers.css").toExternalForm());
        setTranslateX(W);
        setTranslateY(Y);
        setSkin(new MyButtonSkin(this));
    }
}
