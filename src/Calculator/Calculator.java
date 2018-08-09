package Calculator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class Calculator implements ActionListener{
	
        
    
	String numbers="";
        String first="";
        String second="";
        int flag=0;
        int flag2=0;
        int result=0;
	JFrame frame = new JFrame ("Calculator");
	JPanel panel = new JPanel (new FlowLayout());
	
	
	JTextArea text = new JTextArea(2,9);
	
	JButton but1 = new JButton("1");
	JButton but2 = new JButton("2");
	JButton but3 = new JButton("3");	
	JButton but4 = new JButton("4");
	JButton but5 = new JButton("5");
	JButton but6 = new JButton("6");
	JButton but7 = new JButton("7");
	JButton but8 = new JButton("8");
	JButton but9 = new JButton("9");
	JButton but0 = new JButton("0");
	JButton butadd = new JButton("+");
	JButton butsub = new JButton("-");
	JButton butmul = new JButton("*");
	JButton butdiv = new JButton("/");
	JButton butclear = new JButton("clear");
	JButton butequal = new JButton("=");
        JButton butback = new JButton("<<<<<");
	
	public Calculator(){
		frame.setSize(290,250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
                frame.setLocationRelativeTo(null);
		frame.setTitle("Calculator");
                frame.setResizable(false);
		frame.add(panel);
		panel.setBackground(Color.LIGHT_GRAY);
		Border border = BorderFactory.createLineBorder(Color.BLACK,4);
		panel.setBorder(border);
		
		panel.add(text);
		
		
		Border tborder = BorderFactory.createLineBorder(Color.BLACK
				,3);
		text.setBorder(tborder);
		Font font = new Font("arial",Font.BOLD,29);
		text.setFont(font);
		
		text.setPreferredSize(new Dimension(0,9));
		text.setLineWrap(true);
		
		panel.add(but1);
		panel.add(but2);
		panel.add(but3);
		panel.add(but4);
		panel.add(but5);
		panel.add(but6);
		panel.add(but7);
		panel.add(but8);
		panel.add(but9);
		panel.add(but0);
		panel.add(butadd);
		panel.add(butsub);
		panel.add(butmul);
		panel.add(butdiv);
		panel.add(butequal);
		panel.add(butclear);
                panel.add(butback);

	but1.addActionListener(this);
	but2.addActionListener(this);
	but3.addActionListener(this);
	but4.addActionListener(this);
	but5.addActionListener(this);
	but6.addActionListener(this);
	but7.addActionListener(this);
	but8.addActionListener(this);
	but9.addActionListener(this);
	but0.addActionListener(this);
	butadd.addActionListener(this);
	butsub.addActionListener(this);
	butmul.addActionListener(this);
	butdiv.addActionListener(this);
	butequal.addActionListener(this);
	butclear.addActionListener(this);
        butback.addActionListener(this);
		text.setText("0");
                text.setEditable(false);
	}

	
	public void actionPerformed(ActionEvent e)
	{
            Object source = e.getSource();
            
            if(source==but1)
            {
                if(flag==0)
                {
                    text.setText("");
                    flag=1;
                }
                numbers=text.getText();
                numbers+="1";
                text.setText(numbers);
            }
            else if(source==but2)
            {
                if(flag==0)
                {
                    text.setText("");
                    flag=1;
                }
                numbers=text.getText();
                numbers+="2";
                text.setText(numbers);
            }
            else if(source==but3)
            {
                if(flag==0)
                {
                    text.setText("");
                    flag=1;
                }
                numbers=text.getText();
                numbers+="3";
                text.setText(numbers);
            }
            else if(source==but4)
            {
                if(flag==0)
                {
                    text.setText("");
                    flag=1;
                }
                numbers=text.getText();
                numbers+="4";
                text.setText(numbers);
            }
            else if(source==but5)
            {
                if(flag==0)
                {
                    text.setText("");
                    flag=1;
                }
                numbers=text.getText();
                numbers+="5";
                text.setText(numbers);
            }
            else if(source==but6)
            {
                if(flag==0)
                {
                    text.setText("");
                    flag=1;
                }
                numbers=text.getText();
                numbers+="6";
                text.setText(numbers);
            }
            else if(source==but7)
            {
                if(flag==0)
                {
                    text.setText("");
                    flag=1;
                }
                numbers=text.getText();
                numbers+="7";
                text.setText(numbers);
            }
            else if(source==but8)
            {
                if(flag==0)
                {
                    text.setText("");
                    flag=1;
                }
                numbers=text.getText();
                numbers+="8";
                text.setText(numbers);
            }	
            else if(source==but9)
            {
                if(flag==0)
                {
                    text.setText("");
                    flag=1;
                }
                numbers=text.getText();
                numbers+="9";
                text.setText(numbers);
            }
            else if(source==but0)
            {
                if(flag==0)
                {
                    text.setText("");
                    flag=1;
                }
                numbers=text.getText();
                numbers+="0";
                text.setText(numbers);
            }
            else if(source==butadd)
            {
                if(flag==0)
                {
                    text.setText("");
                    flag=1;
                }
                numbers=text.getText();
                numbers+="+";
                text.setText(numbers);
            }
            else if(source==butsub)
            {
                if(flag==0)
                {
                    text.setText("");
                    flag=1;
                }
                numbers=text.getText();
                numbers+="-";
                text.setText(numbers);
            }	
            else if(source==butmul)
            {
                if(flag==0)
                {
                    text.setText("");
                    flag=1;
                }
                numbers=text.getText();
                numbers+="*";
                text.setText(numbers);
            }
            else if(source==butdiv)
            {
                if(flag==0)
                {
                    text.setText("");
                    flag=1;
                }
                numbers=text.getText();
                numbers+="/";
                text.setText(numbers);
            }
            if(source==butequal)
            {
               ScriptEngineManager mgr = new ScriptEngineManager();
               ScriptEngine engine = mgr.getEngineByName("JavaScript");
               numbers = text.getText();
                try {
                    Object copy = engine.eval(numbers);
                    int copy2 = (int) copy;
                    
                    text.setText(copy2+"");
                    
                } catch (ScriptException ex) {
                    Logger.getLogger(Calculator.class.getName()).log(Level.SEVERE, null, ex);
                }
               
            }
            if(source==butclear)
            {
                numbers=text.getText();
                text.setText("0");
                flag=0;
                flag2=0;
                numbers="";
            }
            if(source==butback)
            {
                if(flag!=0)
                {
                    if(!text.getText().equals(""))
                    {
                        numbers=text.getText();
                        numbers=numbers.substring(0, numbers.length()-1);
                        text.setText(numbers);
                    }
                    else
                    {
                        text.setText("0");
                        flag=0;
                    }
                }
                
            }
	}//actionlistener
    public static void main(String[] args) throws ScriptException{
        
       Calculator cal = new Calculator();
    }


	
}