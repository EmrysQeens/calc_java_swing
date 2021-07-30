package action;
import button.Button;
import button.Buttons;
import label.Label;

class Calculate implements Buttons {
    private String labelText="";

    private boolean checkIfTextIsSet(Label label){
        if(label.getText()!=null)
            return true;
        else
            return false;
    }
    private void appendTextToLabel(Label label, Button button){
        labelText=label.getText()+button.getText();
        label.setText(labelText);
        checkIfTextIsSet(label);
    }
    void clickButtonToSetLabelText(Label label,Button button){
               appendTextToLabel(label,button);
    }

    private boolean find(String whatToFind,String whereToFind){
        boolean bool=false;
        for(int i=0;i<whereToFind.length();i++) {
            if (whatToFind.charAt(0) == whereToFind.charAt(i)){
                bool=true;
            break;}
        }
            return bool;
    }
     boolean check(Label label){
        String txt=label.getText();
        boolean bool=false;
        for(int i=0;i<txt.length();i++){
            char c=txt.charAt(i);
            if (c == '+' || c == '-' || c == '/' || c == 'x') {
                bool = true;
                break;
            }
        }
      return !bool;
    }
    boolean checkForDot(Label label){
        String txt=label.getText();
        boolean bool=false;
        for(int i=0;i<txt.length();i++){
            char c=txt.charAt(i);
            if (c == '.') {
                bool = true;
                break;
            }
        }
        return bool;
    }

    private Double calculate(String operation,Double num1,Double num2,Label label){
        Double num =0.0;
        if(operation.equals("add"))
                num= num1 + num2;
        else if(operation.equals("sub"))
                num= num1 - num2;
        else if(operation.equals("mul"))
                num= num1 * num2;
        else if(operation.equals("div")){
                   num=num1/num2;
               }
        return num;
    }
    boolean checkText(Button button){
        boolean bool=false;
        String str=button.getText();
        if(str.equals("+") || str.equals("-") || str.equals("/") || str.equals("x"))
            bool= true;
        return bool;
    }

    private Double[] numbers(Label label){
        String num1;
        String num2;
        Double[] nums=new Double[2];
        String str=label.getText();
        int count=0;
       for(int i=0;i<str.length();i++){
           char c=str.charAt(i);
           if(c=='+' || c=='-' || c=='x' || c=='/')
               count=i;
       }
       num1=str.substring(0,count);
       num2=str.substring(count+1);
        if(!num1.isEmpty() && !num2.isEmpty()) {
            nums[0] =Double.parseDouble(num1);
            nums[1] = Double.parseDouble(num2);
        }
       return nums;
    }
    Double clickButtonToCalculate(Label label){
            Double[] nums=numbers(label);
            String str=label.getText();
               if(find("+",str))
                   return calculate("add",nums[0],nums[1],label);
               else if(find("-",str))
                   return calculate("sub",nums[0],nums[1],label);
               else if(find("/",str))
                   return calculate("div",nums[0],nums[1],label);
               else if(find("x",str))
                   return calculate("mul",nums[0],nums[1],label);
               else return 0.0;
            }
     void clearLastNumber(Label label,Label label1){
        String str=label.getText();
        if(!str.isEmpty()){
        String str1=str.substring(0,str.length()-1);
        label.setText(str1); }
         label1.setText("");
     }
     boolean checkIfDotExist(Label label){
        int dot=0;
        int adot=0;
        String str=label.getText();
            for(int i=0;i<str.length();i++){
                char c=str.charAt(i);
                if(c=='.')
                    dot=i;
                if(c=='+' || c=='/' || c=='x' || c=='-')
                    adot=i;
         }
            if(adot>dot) return true;
            else return false;
     }
     boolean checkLastNo(Double db){
        String str=db.toString();
        if (str.endsWith("0"))
            return true;
        else return false;
     }
     long convertDoubleToLong(Double db){
         String str=db.toString();
         String str2="";
         for(int i=0;i<str.length();i++){
             if(str.charAt(i)=='.')
                 break;
             else
                 str2+=str.charAt(i);
         }
         return Long.parseLong(str2);
     }
}
