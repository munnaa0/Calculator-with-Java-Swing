package calc;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class ChildCalculator extends JFrame implements ActionListener {
	
	///Variable Declarations
	JTextField textfield;
	JPanel panel;
	boolean btnEnabled = false;
	boolean equal = false;
	String Ans = "E";
	String displayText = "";
	String Operator ="";
	String AfterOperator;
	Double HalfResult;
	Double FinalResult;
	Double Percentage;
	double firstNUM = 0;
	double secondNUM = 0;
	///Button Declare
	JButton btnON;
	JButton[] btn = new JButton[10];
	JButton btnDel;
	JButton btnPercentage;
	JButton btnDivide;
	JButton btnInto;
	JButton btnMinus;
	JButton btnPlus;
	JButton btnClear;
	JButton btnDot;
	JButton btnEqual;
	ChildCalculator(){
	
		///Image icon Create
		//ImageIcon bON = new ImageIcon("images/btnON.png");
		ImageIcon mainIcon = new ImageIcon("images/calculator.png");
		///TextField Create
		textfield = new JTextField();
		textfield.setBounds(20, 10, 300, 45);
		textfield.setFont(new Font("Tahoma",Font.PLAIN,30));
		textfield.setForeground(Color.magenta);
		textfield.setHorizontalAlignment(JTextField.RIGHT);
		textfield.setEditable(false);
		
		///Panel Create
		panel = new JPanel();
		//panel.setBackground(Color.black);
		panel.setBounds(20, 70, 300, 350);
		panel.setLayout(new GridLayout(5,4,15,15));
		
		///Button Create
		 btnON = new JButton("ON");
		 btnON.setFont(new Font("Tahoma",Font.BOLD,15));
		 btnON.setForeground(Color.ORANGE);
		 btnON.setFocusable(false);
		 btnON.addActionListener(this);
		 
		 
		 btnDel = new JButton("D");
		 btnDel.setFont(new Font("Tahoma",Font.BOLD,15));
		 btnDel.setFocusable(false);
		 
		 btnPercentage = new JButton("%");
		 btnPercentage.setFont(new Font("Tahoma",Font.BOLD,15));
		 btnPercentage.setFocusable(false);
		 
		 btnDivide = new JButton("/");
		 btnDivide.setFont(new Font("Tahoma",Font.BOLD,15));
		 btnDivide.setFocusable(false);
		 
		 btn[7] = new JButton("7");
		 btn[7].setFont(new Font("Tahoma",Font.BOLD,15));
		 btn[7].setFocusable(false);
		 
		 btn[8] = new JButton("8");
		 btn[8].setFont(new Font("Tahoma",Font.BOLD,15));
		 btn[8].setFocusable(false);
		 
		 btn[9] = new JButton("9");
		 btn[9].setFont(new Font("Tahoma",Font.BOLD,15));
		 btn[9].setFocusable(false);
		 
		 btnInto = new JButton("X");
		 btnInto.setFont(new Font("Tahoma",Font.BOLD,15));
		 btnInto.setFocusable(false);
		 
		 btn[4] = new JButton("4");
		 btn[4].setFont(new Font("Tahoma",Font.BOLD,15));
		 btn[4].setFocusable(false);
		 
		 btn[5] = new JButton("5");
		 btn[5].setFont(new Font("Tahoma",Font.BOLD,15));
		 btn[5].setFocusable(false);
		 
		 btn[6] = new JButton("6");
		 btn[6].setFont(new Font("Tahoma",Font.BOLD,15));
		 btn[6].setFocusable(false);
		 
		 btnMinus = new JButton("-");
		 btnMinus.setFont(new Font("Tahoma",Font.BOLD,15));
		 btnMinus.setFocusable(false);
		 
		 btn[1] = new JButton("1");
		 btn[1].setFont(new Font("Tahoma",Font.BOLD,15));
		 btn[1].setFocusable(false);
		 
		 btn[2] = new JButton("2");
		 btn[2].setFont(new Font("Tahoma",Font.BOLD,15));
		 btn[2].setFocusable(false);
		 
		 btn[3] = new JButton("3");
		 btn[3].setFont(new Font("Tahoma",Font.BOLD,15));
		 btn[3].setFocusable(false);
		 
		 btnPlus = new JButton("+");
		 btnPlus.setFont(new Font("Tahoma",Font.BOLD,15));
		 btnPlus.setFocusable(false);
		 
		 btnClear = new JButton("C");
		 btnClear.setFont(new Font("Tahoma",Font.BOLD,15));
		 btnClear.setForeground(Color.red);
		 btnClear.setFocusable(false);
		 
		 btn[0] = new JButton("0");
		 btn[0].setFont(new Font("Tahoma",Font.BOLD,15));
		 btn[0].setFocusable(false);
		 
		 btnDot = new JButton(".");
		 btnDot.setFont(new Font("Tahoma",Font.BOLD,15));
		 btnDot.setFocusable(false);
		 
		 btnEqual = new JButton("=");
		 btnEqual.setFont(new Font("Tahoma",Font.BOLD,15));
		 btnEqual.setFocusable(false);
		 
		 ///Button Disable
		 setEnable();
		 
		 //Adding ActionListner to Button
		 for(int i = 0; i < 10; i++)
		 {
			 btn[i].addActionListener(this);
		 }
		 btnPlus.addActionListener(this);
		 btnMinus.addActionListener(this);
		 btnInto.addActionListener(this);
		 btnDivide.addActionListener(this);
		 btnClear.addActionListener(this);
		 btnEqual.addActionListener(this);
		 btnDot.addActionListener(this);
		 btnDel.addActionListener(this);
		 btnPercentage.addActionListener(this);
		
		///JFrame Create
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(450, 500);
		this.setIconImage(mainIcon.getImage());
		this.setTitle("Calculator");
		this.setLayout(null);
		this.setBounds(100, 100, 354, 480);
		this.setResizable(false);
		
		
		///Adding elements************************************************************
		this.add(textfield);
		this.add(panel);
		///Button add to panel
		panel.add(btnON);
		panel.add(btnDel);
		panel.add(btnPercentage);
		panel.add(btnDivide);
		panel.add(btn[7]);
		panel.add(btn[8]);
		panel.add(btn[9]);
		panel.add(btnInto);
		panel.add(btn[4]);
		panel.add(btn[5]);
		panel.add(btn[6]);
		panel.add(btnMinus);
		panel.add(btn[1]);
		panel.add(btn[2]);
		panel.add(btn[3]);
		panel.add(btnPlus);
		panel.add(btnClear);
		panel.add(btn[0]);
		panel.add(btnDot);
		panel.add(btnEqual);
		this.setVisible(true);
	}
	///SetVisibility Button
	public void setEnable() {
		
		ClearVariable();
		btnDel.setEnabled(btnEnabled);
		btnPercentage.setEnabled(btnEnabled);
		btnDivide.setEnabled(btnEnabled);
		btn[7].setEnabled(btnEnabled);
		btn[8].setEnabled(btnEnabled);
		btn[9].setEnabled(btnEnabled);
		btnInto.setEnabled(btnEnabled);
		btn[4].setEnabled(btnEnabled);
		btn[5].setEnabled(btnEnabled);
		btn[6].setEnabled(btnEnabled);
		btnMinus.setEnabled(btnEnabled);
		btnPlus.setEnabled(btnEnabled);
		btn[2].setEnabled(btnEnabled);
		btn[3].setEnabled(btnEnabled);
		btnClear.setEnabled(btnEnabled);
		btn[1].setEnabled(btnEnabled);
		btnDot.setEnabled(btnEnabled);
		btnEqual.setEnabled(btnEnabled);
		btn[0].setEnabled(btnEnabled);
		textfield.setEnabled(btnEnabled);
		btnEnabled = !btnEnabled;
		if(btnEnabled == true) {
			textfield.setText("Hello Munna :)");
		}
		else {
			textfield.setText("");
		}
	}
	
	///*************************Button Size Method**********************************
	//Height = 58px   Width = 63px
	///**********************Variable clear Method************************************************
	public void ClearVariable() {
		displayText = "";
		Operator = "E";
		firstNUM = 0;
		secondNUM = 0;
		AfterOperator = "";
		HalfResult = 0.0;
		FinalResult = 0.0;
		Percentage = 0.0;
		equal = false;
	}
	///****************************Calculate Method**********************************************
	public void Calculate(String OperatorChange) {
		secondNUM = Double.valueOf(displayText);
		if(Operator == "+") {
			FinalResult = firstNUM + secondNUM;
		}
		else if(Operator == "-") {
			FinalResult = firstNUM - secondNUM;
		}
		else if(Operator == "*") {
			FinalResult = firstNUM * secondNUM;
		}
		else{
			FinalResult = firstNUM / secondNUM;
		}
		if(equal == true) {
			textfield.setText(FinalResult.toString());
			Ans = FinalResult.toString();
			ClearVariable();
		}
		else {
			Operator = OperatorChange;
			textfield.setText(FinalResult.toString() + Operator);
			firstNUM = FinalResult;
			secondNUM = 0;
			AfterOperator = FinalResult.toString() + Operator;
			displayText = "";
		}
		
	}

	///********************************Main Code*****************************************
	///************************ON Button**************************************************
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnON) {
			setEnable();
		}
		//***********************************For Plus Button************************************
		else if(e.getSource()==btnPlus) {
			if(Ans =="E" && displayText =="") {
				displayText = "+";
				textfield.setText(displayText);
			}
			else if(displayText == "+" || displayText == "-") {
				textfield.setText("What is this ??");
			}
			else if(Operator == "+") {
				secondNUM = Double.valueOf(displayText);
				HalfResult = firstNUM + secondNUM;
				textfield.setText(HalfResult.toString() + "+");
				firstNUM = HalfResult;
				secondNUM = 0;
				AfterOperator = HalfResult.toString() + "+";
				displayText = "";
			}
			else if(Ans !="E") {
				Operator = "+";
				AfterOperator = Ans + "+";
				textfield.setText(AfterOperator);
				firstNUM = Double.valueOf(Ans);
				Ans = "E";
			}
			else if(Operator == "E")
			{
				Operator = "+";
				AfterOperator = displayText + "+";
				textfield.setText(AfterOperator);
					firstNUM = Double.valueOf(displayText);
					displayText = "";
			}
			else
			{
				Calculate("+");
			}
		}
		//***************************FOr Minus Button**************************************
		else if(e.getSource()==btnMinus) {
			if(Ans =="E" && displayText =="") {
				displayText = "-";
				textfield.setText(displayText);
			}
			else if(displayText == "+" || displayText == "-") {
				textfield.setText("What is this ??");
			}
			else if(Operator == "-") {
				secondNUM = Double.valueOf(displayText);
				HalfResult = firstNUM - secondNUM;
				textfield.setText(HalfResult.toString() + "-");
				firstNUM = HalfResult;
				secondNUM = 0;
				AfterOperator = HalfResult.toString() + "-";
				displayText = "";
			}
			else if(Ans !="E") {
				Operator = "-";
				AfterOperator = Ans + "-";
				textfield.setText(AfterOperator);
				firstNUM = Double.valueOf(Ans);
				Ans = "E";
			}
			else if(Operator =="E")
			{
				Operator = "-";
				AfterOperator = displayText + "-";
				textfield.setText(AfterOperator);
					firstNUM = Double.valueOf(displayText);
					displayText = "";
			}
			else
			{
				Calculate("-");
			}
		}
		///*************************For Multiplication***************************************
		else if(e.getSource()==btnInto) {
			if(Ans =="E" && displayText =="") {
				textfield.setText("What is this ??");
			}
			else if(Operator == "*") {
				secondNUM = Double.valueOf(displayText);
				HalfResult = firstNUM * secondNUM;
				textfield.setText(HalfResult.toString() + "*");
				firstNUM = HalfResult;
				secondNUM = 0;
				AfterOperator = HalfResult.toString() + "*";
				displayText = "";
			}
			else if(Ans !="E") {
				Operator = "*";
				AfterOperator = Ans + "*";
				textfield.setText(AfterOperator);
				firstNUM = Double.valueOf(Ans);
				Ans = "E";
			}
			else if(Operator == "E")
			{
				Operator = "*";
				AfterOperator = displayText + "*";
				textfield.setText(AfterOperator);
					firstNUM = Double.valueOf(displayText);
					displayText = "";
			}
			else
			{
				Calculate("*");
			}
		}
		///************************FOr Division**********************************************
		else if(e.getSource()==btnDivide) {
			if(Ans =="E" && displayText =="") {
				textfield.setText("What is this ??");
			}
			else if(Operator == "/") {
				secondNUM = Double.valueOf(displayText);
				HalfResult = firstNUM / secondNUM;
				textfield.setText(HalfResult.toString() + "/");
				firstNUM = HalfResult;
				secondNUM = 0;
				AfterOperator = HalfResult.toString() + "/";
				displayText = "";
			}
			else if(Ans !="E") {
				Operator = "/";
				AfterOperator = Ans + "/";
				textfield.setText(AfterOperator);
				firstNUM = Double.valueOf(Ans);
				Ans = "E";
			}
			else if(Operator == "E")
			{
				Operator = "/";
				AfterOperator = displayText + "/";
				textfield.setText(AfterOperator);
					firstNUM = Double.valueOf(displayText);
					displayText = "";
			}
			else
			{
				Calculate("/");
			}
		}
		//**************************For Percentage Button*****************************************
				else if(e.getSource()==btnPercentage) {
					if(Ans =="E" && displayText =="") {
						textfield.setText("What is this ??");
					}
					else if(Ans !="E" && displayText =="") {
						Percentage = Double.valueOf(Ans);
						Percentage = Percentage / 100;
						Ans = Percentage.toString();
						textfield.setText(Ans);
					}
					else if(AfterOperator == "") {
						Percentage = Double.valueOf(displayText);
						Percentage = Percentage / 100;
						displayText = Percentage.toString();
						textfield.setText(displayText);
					}
					else {
						Percentage = Double.valueOf(displayText);
						Percentage = Percentage / 100;
						displayText = Percentage.toString();
						textfield.setText(AfterOperator + displayText);
					}
				}
		//**************************For Equal Button*****************************************
		else if(e.getSource()==btnEqual) {
			equal = true;
			Calculate(Operator);
		}
		//***************************Clear button*******************************
		else if(e.getSource()==btnClear) {
			ClearVariable();
			Ans = "E";
			textfield.setText("");
		}
		//***************************Dot button*******************************
				else if(e.getSource()==btnDot) {
					displayText = displayText + ".";
					if(Operator == "E") {
						textfield.setText(displayText);
					}
					else
					{
						textfield.setText(AfterOperator + displayText);
					}
				}
		//***************************Delete One button*******************************
				else if(e.getSource()==btnDel) {
					
					if(displayText =="" && AfterOperator == "") {
						if(Ans == "")
						{
							textfield.setText("Nothing to Delete");
						}
						else {
							Ans = Ans.substring(0,Ans.length()-1);
							textfield.setText(Ans);
						}
					}
					else if(displayText =="" && AfterOperator != "") {
						AfterOperator = AfterOperator.substring(0,AfterOperator.length()-1);
						textfield.setText(AfterOperator);
					}
					else if(Operator == "E") {
						displayText = displayText.substring(0,displayText.length()-1);
						textfield.setText(displayText);
					}
					else
					{
						displayText = displayText.substring(0,displayText.length()-1);
						textfield.setText(AfterOperator + displayText);
					}
				}
		//*************************************FOr Number Button******************************
		else
		{
			for(int i= 0; i<10; i++) {
				if (e.getSource() == btn[i]) {
					displayText = displayText + i; 
					if(Operator == "E") {
						textfield.setText(displayText);
						if(Ans !="E") {
							Ans = "E";
							equal = false;
						}
					}
					else
					{
						textfield.setText(AfterOperator + displayText);
					}
					break;
				}
			
		}
	}
	}

}
