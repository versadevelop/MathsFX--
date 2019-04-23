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
public class ButtonForContinue extends Button {

    public ButtonForContinue(String text) {
        super(text);
        setSkin(new MyButtonSkin(this));
        getStylesheets().add(getClass().getResource("btnAnswers.css").toExternalForm());
    }

   
    
}
