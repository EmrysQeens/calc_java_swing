package action;

import button.Button;
import button.Buttons;
import label.Labels;

public class CalculateMethods implements Buttons, Labels {
    Calculate calc=new Calculate();
    public CalculateMethods(Button button){
        button.addActionListener(actionEvent -> {
            String str=button.getText();
            if(!str.equals("===") && !str.equals("C") && !str.equals(".")){
                if( calc.check(labelUp) || !calc.checkText(button))
                    calc.clickButtonToSetLabelText(labelUp,button);
                else if( calc.check(labelUp) && calc.checkText(button))
                    calc.clickButtonToSetLabelText(labelUp,button);
            }
            else if(str.equals("===")){
                if(calc.clickButtonToCalculate(labelUp).toString().equals("Infinity"))
                 labelDown.setText("Zero Error");
               else if(!calc.checkLastNo(calc.clickButtonToCalculate(labelUp)))
                     labelDown.setText(String.valueOf(calc.clickButtonToCalculate(labelUp)));
                else if(calc.checkLastNo(calc.clickButtonToCalculate(labelUp)))
                     labelDown.setText(String.valueOf(calc.convertDoubleToLong(calc.clickButtonToCalculate(labelUp))));}
            else if(str.equals("C")){
                calc.clearLastNumber(labelUp,labelDown);
            }
            else if(str.equals(".")){
                if(!calc.checkForDot(labelUp) || calc.checkIfDotExist(labelUp)){
                    calc.clickButtonToSetLabelText(labelUp,button);}
            }
        });

    }
}
