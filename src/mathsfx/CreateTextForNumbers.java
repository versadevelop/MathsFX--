/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathsfx;

import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

/**
 *
 * @author jelis
 */
public class CreateTextForNumbers extends Text {

    public CreateTextForNumbers(double x, double y, String text, Color c, int f) {
        super(x, y, text);
        setFill(c);
        setFont(new Font(f));
    }
    
}
