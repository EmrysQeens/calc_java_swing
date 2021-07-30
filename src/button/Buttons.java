package button;

public interface Buttons {
    Button one=new Button("1",10,100,1);
    Button two=new Button("2",60,100,1);
    Button three=new Button("3",110,100,1);
    Button four=new Button("4",160,100,1);
    Button five=new Button("5",10,150,1);
    Button six=new Button("6",60,150,1);
    Button seven=new Button("7",110,150,1);
    Button eight=new Button("8",160,150,1);
    Button nine=new Button("9",10,200,1);
    Button zero=new Button("0",60,200,1);
    Button add=new Button("+",110,200,1);
    Button sub=new Button("-",160,200,1);
    Button mul=new Button("x",10,250,1);
    Button div=new Button("/",60,250,1);
    Button dot=new Button(".",110,250,1);
    Button clear=new Button("C",160,250,1);
    Button equal=new Button("===",10,300,2);


    Button buttons[]={one,two,three,four,five,six,seven,eight,nine,zero,add,sub,mul,div,dot,clear,equal};
}
