import java.awt.*;
import java.awt.event.*;



class TrafficSignals extends Frame implements ActionListener{

Label l,l2;
Button red,yellow,green;

TrafficSignals(){
//Frame f=new Frame();
l=new Label();
red=new Button("Red");
yellow=new Button("Yellow");
green=new Button("Green");

add(l);
add(red);
add(yellow);
add(green);

red.addActionListener(this);
//yellow.addActionListener(this);
//green.addActionListener(this);


setLayout(new FlowLayout());
//setVisible(true);

 addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                dispose();
        }
        
    });
 }

public void actionPerformed(ActionEvent e){
if(e.getSource()==red){
  l.setText("Stop");
  l.setAlignment(Label.CENTER);
  l.setBackground(Color.red);
  l.setBounds(200,300,500,600);
}

}



public static void main(String args[])
{
  new TrafficSignals();
}

}