package button;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.ColorModel;

public class Button extends JButton {
    Button(String text,int x,int y,int type){
        setText(text);
        setLayout(null);
        setVisible(true);
        setOpaque(true);
        setBackground(new Color(128,128,128));
        setBorderPainted(true);
        setFont(getFont().deriveFont(20f));
        setBorder(BorderFactory.createLineBorder(Color.black,5));
        setForeground(Color.white);
        switch(type){
            case 1:
                setBounds(x,y,45,45);
                break;
            default:
                setBounds(x,y,195,45);
        }
    }

}
