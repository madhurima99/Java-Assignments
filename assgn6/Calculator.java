package Assgn6;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Calculator extends Applet implements ActionListener
{
    private String num1="";
    private String op="";
    private String num2="";
    private TextField inp;
    private int i;
   
    public void init()
    {
    	
    	Frame title = (Frame)this.getParent().getParent();
        title.setTitle("Calculator");
    	
    	setSize(270,250);
		setBackground(Color.white);
		setLayout(null);
		
		Font f1 = new Font("Arial",Font.PLAIN,24);
		Font f2 = new Font("Arial",Font.PLAIN,18);  
		inp = new TextField();
		inp.setBounds(0,0,270,50);
		inp.setFont(f1);
		this.add(inp);
		
		//adding numbers button
		Button button[] = new Button[10];
		for(i=0;i<10;i++)
		{
		    button[i] = new Button(String.valueOf(9-i));
		    button[i].setBounds(0+((i%3)*50),50+((i/3)*50),50,50);
		    button[i].setFont(f2);
		    this.add(button[i]);
		    button[i].addActionListener(this);
		}
		
		//adding decimal button
		Button dec=new Button(".");
		dec.setBounds(50,200,100,50);
		dec.setFont(f2);
		this.add(dec);
		dec.addActionListener(this);
		
		//adding operator buttons
		Button operator[] = new Button[5];
		operator[0]=new Button("/");
		operator[1]=new Button("*");
		operator[2]=new Button("-");
		operator[3]=new Button("+");
		operator[4]=new Button("=");
		for(i=0;i<4;i++)
		{
		    operator[i].setBounds(150,50+(i*50),50,50);
		    operator[i].setBackground(Color.yellow);
		    operator[i].setFont(f2);
		    this.add(operator[i]);
		    operator[i].addActionListener(this);
		}
		
		//adding erase char button
	    Button er = new Button("DEL");
	    er.setBounds(200,50,70,50);
	    er.setFont(f2);
	    er.setBackground(Color.red);
		this.add(er);
		er.addActionListener(this);
		
		//adding clear button
		Button clr=new Button("CLR");
		clr.setBounds(200,100,70,50);
		clr.setFont(f2);
		clr.setBackground(Color.red);
		this.add(clr);
		clr.addActionListener(this);
		
		//adding equal to
		operator[4].setBounds(200,150,70,100);
		operator[4].setBackground(Color.cyan);
		operator[4].setFont(f2);
		this.add(operator[4]);
		operator[4].addActionListener(this);		
	 }
    
     //Function to calculate the expression
	 public void actionPerformed(ActionEvent e)
	 {
			String button = e.getActionCommand();
		    char ch = button.charAt(0);
			if(ch>='0' && ch<='9'|| ch=='.') 
			{ 
			    if (!op.equals("")) 
			    	num2 = num2 + button; 
			    else
			    	num1 = num1 + button;   
			    inp.setText(num1+op+num2); 
			} 
			else if(ch=='D') 
			{ 
			    String s = inp.getText();
			    char p = s.substring(s.length() - 1).charAt(0);
			    if(p>='0' && p<='9'|| p=='.') 
				{ 
				    if (!op.equals(""))
				    	num2 = num2.substring(0,num2.length() - 1); 
				    else
				    	num1 = num1.substring(0,num1.length() - 1); 				     
				}
			    else
			    	op="";
			    inp.setText(num1+op+num2); 
			}
			else if(ch=='C') 
			{ 
			    num1 = op = num2 = ""; 
			    inp.setText(""); 
			}
			else if (ch =='=') 
			{    
			    if(!num1.equals("") && !num2.equals(""))
			    {
					double temp;
					double n1=Double.parseDouble(num1);
					double n2=Double.parseDouble(num2);
					if(n2==0 && op.equals("/"))
					{
					    inp.setText(num1+op+num2+" = Zero Division Error");
					    num1 = op = num2 = "";
					}
					else
					{
					    if (op.equals("+")) 
					        temp = n1 + n2; 
					    else if (op.equals("-")) 
					        temp = n1 - n2; 
					    else if (op.equals("/")) 
				  	        temp = n1/n2; 
					    else
					        temp = n1*n2; 
					    inp.setText(num1+op+num2+" = "+temp); 
					    num1 = Double.toString(temp);//final res in num1
					    op = num2 = ""; 
				     }
			    }
			    else
			    {
					num1 = op = num2 = ""; 
					inp.setText("");
			    }
		    }
			else if (op.equals("") || num2.equals("")) 
			{
			    op = button; 
			    inp.setText(num1+op+num2);
			}
			else
				inp.setText("Error: Can add only two operands at a time");
		}
}
