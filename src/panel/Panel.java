package panel;
import action.CalculateMethods;
import button.Buttons;
import label.Labels;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel implements Buttons , Labels {
    public Panel(){
       for(int i=0; i<buttons.length;i++){
           add(buttons[i]);
        new CalculateMethods(buttons[i]);}
        add(labelUp);
        add(labelDown);

        setOpaque(true);
        setBackground(Color.white);
        setLayout(null);
        setVisible(true);
        setBounds(0,0,214,360);
        setBorder(BorderFactory.createLineBorder(Color.black,5));

    }

}
