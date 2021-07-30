package label;

import javax.swing.*;
import java.awt.*;

public class Label extends JLabel {
    public Label(int x,int y){
        setBounds(x,y,192,40);
        setBorder(BorderFactory.createLineBorder(Color.black,5));
        setFont(getFont().deriveFont(20f));
    }
}
