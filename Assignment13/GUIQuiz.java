package Gui;
import javax. swing.*;
import java.awt.*;
import java.awt.ev ent.*;
@SuppressWarnings("se rial")
public class QuizMCQ extend s JFrame {
private JLabel q1,q2,q3,q4,q5,q6,q7,q8,q9,q10;
private JButton ok;
private JRadioButto n a1,a2,a3,a4,b1,b2,b3,b4,c1,c2,c3,c4,d1,d2,d3,d4,e1,e2,e3,e4,f1,f2,f3,f4,g1,g2,g3,g4,h1,h2,h3,h4,i1,i2,i3,i4,j1,j2,j3,j4;
private JPanel
pnl1,pnl2,pnl3,pnl4,pnl5,pnl6,pnl7,pnl8,pnl9,pnl10,pnlchoices1,pnlchoices2,pnlchoices3,pnlchoices4,pnlchoices5,pnlchoices6,pnlchoices7,pnlchoices8,p
private ButtonGroup grp1,grp2,grp3,grp4,grp5,grp6,grp7,grp8,grp9,grp10;
private int score=0;
public QuizMCQ ()
{
s uper("Quiz");
Container con tainer = getContentPane();
container.setLayout(new GridLayout(24,1 ));
pnl1 = new JPanel();
pnl1.setLayout(new G ridLayout(1,1));
q1 = new JLabel(" 1.Which of the follo wing is not a component of Java Integrated Development Environment (IDE)?");
pnl1.add(q1);
pnlchoices1 = new JPanel();
pnlchoices1.setLayout(new G ridLayout(2,10));
a1 = new JRadioButton(" Net Beans");
a2 = new JRadioButton(" Borland􀜘s J builder");
a3 = new JRadioButton(" Symantec􀜘s Visual C af􀜘 ");
a4 = new JRadioButton(" Microsoft Visual Fox Pro");
pnlchoices1.add(a1);
pnlchoices1.add(a2);
pnlchoices1.add(a3);
pnlchoices1.add(a4);
container.add(pnl1);
container.add(pnlcho ices1);
pnl2 = new JPanel();
pnl2.setLayout(new G ridLayout(1,1));
q2 = new JLabel(" 2. The java run time system automatically calls this method while garbage collection.");
pnl2.add(q2);
pnlchoices2 = new JPanel();
pnlchoices2.setLayout(new G ridLayout(2,10));
b1 = new JRadioButton(" Finalize");
b2 = new JRadioButton(" Final");
b3 = new JRadioButton(" Finally" );
b4 = new JRadioButton(" None Of The Above");
pnlchoices2.add(b1);
pnlchoices2.add(b2);
pnlchoices2.add(b3);
pnlchoices2.add(b4);
container.add(pnl2);
container.add(pnlcho ices2);
pnl3 = new JPanel();
pnl3.setLayout(new G ridLayout(1,1));
q3 = new JLabel(" 3.All exception type s are subclasses of the built-in class.");
pnl3.add(q3);
pnlchoices3 = new JPanel();
pnlchoices3.setLayout(new G ridLayout(2,10));
c1 = new JRadioButton(" Exception");
c2 = new JRadioButton(" Error");
c3 = new JRadioButton(" Throwa ble");
c4 = new JRadioButton(" RunTimeErro r");
pnlchoices3.add(c1);
pnlchoices3.add(c2);
pnlchoices3.add(c3);
pnlchoices3.add(c4);
container.add(pnl3);
container.add(pnlcho ices3);
pnl4 = new JPanel();
pnl4.setLayout(new G ridLayout(1,1));
q4 = new JLabel(" 4.The default value of a static integer variable of a class in Java is,");
pnl4.add(q4);
pnlchoices4 = new JPanel();
pnlchoices4.setLayout(new G ridLayout(2,10));
d1 = new JRadioButton(" Garbage Value");
d2 = new JRadioButton(" Zero");
d3 = new JRadioButton(" null");
d4 = new JRadioButton(" One");
pnlchoices4.add(d1);
pnlchoices4.add(d2);
pnlchoices4.add(d3);
pnlchoices4.add(d4);
container.add(pnl4);
container.add(pnlcho ices4);
pnl5 = new JPanel();
pnl5.setLayout(new G ridLayout(1,1));
q5 = new JLabel(" 5.To prevent any m ethod from overriding, we declare the method as,");
pnl5.add(q5);
pnlchoices5 = new JPanel();
pnlchoices5.setLayout(new G ridLayout(2,10));
e1 = new JRadioButton(" Final");
e2 = new JRadioButton(" Static") ;
e3 = new JRadioButton(" Constan t");
e4 = new JRadioButton(" Abstract");
pnlchoices5.add(e1);
pnlchoices5.add(e2);
pnlchoices5.add(e3);
pnlchoices5.add(e4);
container.add(pnl5);
container.add(pnlcho ices5);
pnl6 = new JPanel();
pnl6.setLayout(new G ridLayout(1,1));
q6 = new JLabel(" 6.In Java, a try bloc k should immediately be followed by one or more 􀜘􀜘􀜘􀜘􀜘􀜘 blocks.");
pnl6.add(q6);
pnlchoices6= new JPanel();
pnlchoices6.setLayout(new GridLayout(2,10));
f1 = new JRadioButton(" Catch");
f2 = new JRadioButton(" Exit");
f3 = new JRadioButton(" Throw ");
f4 = new JRadioButton(" Run");
pnlchoices6.add(f1);
pnlchoices6.add(f2);
pnlchoices6.add(f3);
pnlchoices6.add(f4);
container.add(pnl6);
container.add(pnlcho ices6);
pnl7 = new JPanel();
pnl7.setLayout(new G ridLayout(1,1));
q7 = new JLabel(" 7.Where can the ev ent handling code be written?");
pnl7.add(q7);
pnlchoices7 = new JPanel();
pnlchoices7.setLayout(new G ridLayout(2,10));
g1 = new JRadioButton(" Same Class");
g2 = new JRadioButton(" Other Class");
g3 = new JRadioButton(" Anonymous C lass ");
g4 = new JRadioButton(" All Of The Above");
pnlchoices7.add(g1);
pnlchoices7.add(g2);
pnlchoices7.add(g3);
pnlchoices7.add(g4);
container.add(pnl7);
container.add(pnlcho ices7);
pnl8= new JPanel();
pnl8.setLayout(new GridLayout(1,1));
q8 = new JLabel(" 8.Which are passiv e controls that do not support any interaction with the user?");
pnl8.add(q8);
pnlchoices8 = new JPanel();
pnlchoices8.setLayout(new G ridLayout(2,10));
h1 = new JRadioButton(" Label");
h2 = new JRadioButton(" Button") ;
h3 = new JRadioButton(" Checkbox ");
h4 = new JRadioButton(" List");
pnlchoices8.add(h1);
pnlchoices8.add(h2);
pnlchoices8.add(h3);
pnlchoices8.add(h4);
container.add(pnl8);
container.add(pnlcho ices8);
pnl9 = new JPanel();
pnl9.setLayout(new G ridLayout(1,1));
q9 = new JLabel(" 9.What is byte code in the context of Java?");
pnl9.add(q9);
pnlchoices9 = new JPanel();
pnlchoices9.setLayout(new G ridLayout(2,10));
i1 = new JRadioButton(" The type of code generated by a Java compiler");
i2 = new JRadioButton(" The type of code generated by a Java Virtual Mac hine");
i3 = new JRadioButton(" It is another name for a Java source file");
i4 = new JRadioButton(" It is the code written within the instance m ethods of a class");
pnlchoices9.add(i1);
pnlchoices9.add(i2);
pnlchoices9.add(i3);
pnlchoices9.add(i4);
container.add(pnl9);
container.add(pnlcho ices9);
pnl10 = new JPanel();
pnl10.setLayout(new G ridLayout(1,1));
q10 = new JLabel(" 10.The fields in an interface are implicitly specified as,");
pnl10.add(q10);
pnlchoices10 = new JPanel();
pnlchoices10.setLayout(new G ridLayout(2,10));
j1 = new JRadioButton(" Static Only");
j2 = new JRadioButton(" Private");
j3 = new JRadioButton(" Protected ");
j4 = new JRadioButton(" Static and F inal");
pnlchoices10.add(j1);
pnlchoices10.add(j2);
pnlchoices10.add(j3);
pnlchoices10.add(j4);
container.add(pnl10);
container.add(pnlchoi ces10);
ok = new JButton("Submit");
ok.setBackground(Color.whi te);
container.add(ok);
setSize(1000,5000 );
setVisible(true);
RadioButtonHandler handler = new RadioButtonHandler();
a1.addItemListener(handler);
a2.addItemListener(handler);
a3.addItemListener(handler);
a4.addItemListener(handler);
b1.addItemListener(handler);
b2.addItemListener(handler);
b3.addItemListener(handler);
b4.addItemListener(handler);
c1.addItemListener(handler);
c2.addItemListener(handler);
c3.addItemListener(handler);
c4.addItemListener(handler);
d1.addItemListener(handler);
d2.addItemListener(handler);
d3.addItemListener(handler);
d4.addItemListener(handler);
e1.addItemListener(handler);
e2.addItemListener(handler);
e3.addItemListener(handler);
e4.addItemListener(handler);
f1.addItemListener(handler);
f2.addItemListener(handler);
f3.addItemListener(handler);
f4.addItemListener(handler);
g1.addItemListener(handler);
g2.addItemListener(handler);
g3.addItemListener(handler);
g4.addItemListener(handler);
h1.addItemListener(handler);
h2.addItemListener(handler);
h3.addItemListener(handler);
h4.addItemListener(handler);
i1.addItemListener(handler);
i2.addItemListener(handler);
i3.addItemListener(handler);
i4.addItemListener(handler);
j1.addItemListener(handler);
j2.addItemListener(handler);
j3.addItemListener(handler);
j4.addItemListener(handler);
grp1 = new ButtonGroup();
grp1.add(a1);
grp1.add(a2);
grp1.add(a3);
grp1.add(a4);
grp2 = new ButtonGroup();
grp2.add(b1);
grp2.add(b2);
grp2.add(b3);
grp2.add(b4);
grp3 = new ButtonGroup();
grp3.add(c1);
grp3.add(c2);
grp3.add(c3);
grp3.add(c4);
grp4 = new ButtonGroup();
grp4.add(d1);
grp4.add(d2);
grp4.add(d3);
grp4.add(d4);
grp5 = new ButtonGroup();
grp5.add(e1);
grp5.add(e2);
grp5.add(e3);
grp5.add(e4);
grp6 = new ButtonGroup();
grp6.add(a1);
grp6.add(a2);
grp6.add(a3);
grp6.add(a4);
grp7 = new ButtonGroup();
grp7.add(g1);
grp7.add(g2);
grp7.add(g3);
grp7.add(g4);
grp8 = new ButtonGroup();
grp8.add(h1);
grp8.add(h2);
grp8.add(h3);
grp8.add(h4);
grp9 = new ButtonGroup();
grp9.add(i1);
grp9.add(i2);
grp9.add(i3);
grp9.add(i4);
grp10 = new ButtonGroup();
grp10.add(j1);
grp10.add(j2);
grp10.add(j3);
grp10.add(j4);
ButtonHandler btnHandler = new ButtonHandler();
ok.addActionListener(btnHandler);
}
public static void main(String[]args)
{
Q uizMCQ application = new QuizMCQ();
application.setDefaultCloseOperation(EX IT_ON_CLOSE);
}
public class RadioButtonHandler implements ItemListener {
public void itemStateChanged(ItemEvent event)
{
if (event.getSource()==a3)
score++;
else if (ev ent.getSource()==b1)
score++;
else if (ev ent.getSource()==c3)
score++;
else if (ev ent.getSource()==d2)
score++;
else if (ev ent.getSource()==e1)
score++;
else if (ev ent.getSource()==f1)
score++;
else if (ev ent.getSource()==g4)
score++;
else if (ev ent.getSource()==h1)
score++;
else if (ev ent.getSource()==i1)
score++;
else if (ev ent.getSource()==j4)
score++;
}
}
p rivate class ButtonHandler implements ActionListener{
public void actionPerformed(ActionEvent event){
if (event.getSource()==ok)
{
J OptionPane.showMessageDialog(null,"Your score is: " +score,"",JOptionPane.INFORMATION_MESSAGE);
dispose();
}
}
}
}
