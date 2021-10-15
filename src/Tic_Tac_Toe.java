

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Tic_Tac_Toe implements ActionListener {
	private JFrame frame;
	private JPanel panel;
	private JPanel ButtonPanel;
	private JLabel textfield;
	private JButton[] buttons;
	private Boolean Player1;
	Random random =new Random();
	private static int  count=0;
	
	
	public Tic_Tac_Toe() {
		//Buttons
		buttons =new JButton[9];
				

		//frame
		frame = new JFrame();
		frame.setTitle("Page de TIC-TAC-TOE");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600,600);
		frame.getContentPane().setBackground(new Color(50,50,50));
		frame.setLayout(new BorderLayout());
		frame.setVisible(true);
		
		
		
		
		//Label
 
		textfield =new JLabel();
		textfield.setBackground(new Color(25,25,25));
		textfield.setForeground(new Color(25,255,0));
		textfield.setFont(new Font("Algerian", Font.BOLD | Font.ITALIC, 75));
		textfield.setHorizontalAlignment(JLabel.CENTER);
		textfield.setText("Tic-Tac-Toe");
		textfield.setOpaque(true);
		
		//Panel
		panel = new JPanel();
		ButtonPanel = new JPanel();
		
		panel.setLayout(new BorderLayout());
		panel.setBounds(0,0,600,100);
		
		ButtonPanel.setLayout(new GridLayout(3,3));
		ButtonPanel.setBackground(new Color(150,150,150));
		
		for(int i=0;i<9;i++) {
			buttons[i] =new JButton();
			ButtonPanel.add(buttons[i]);
			buttons[i].setFont(new Font("MV Boli",Font.BOLD,120));
			buttons[i].setFocusable(false);
			buttons[i].addActionListener(this);
		}
		
		frame.add(panel,BorderLayout.NORTH);
		frame.add(ButtonPanel);
		panel.add(textfield);
		
		FirstTurn();
		
		

	}
	

	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		  
		for(int i=0;i<9;i++) {
			if(e.getSource()==buttons[i]) {
				if(Player1) {
					if(buttons[i].getText()==""){
						buttons[i].setForeground(new Color(255,0,0));
						buttons[i].setText("X");
						Player1=false;
						textfield.setText("O Turn");
						Check();
						count++;
					}
				}
				else {
					if(buttons[i].getText()==""){
						buttons[i].setForeground(new Color(0,0,255));
						buttons[i].setText("O");
						Player1=true;
						textfield.setText("X Turn");
						Check();
						count++;
					}
				}
			}
			
		}
		
	}
	public void FirstTurn() {
		 
		if(random.nextInt(2)==0) {
			Player1=true;
			textfield.setText("X turn");
		}
		else {
			Player1=false;
			textfield.setText("O turn");
		}
	}
	public void Check() {
		//Check X Conditions
		 
		if( (buttons[0].getText()=="X") &&( buttons[1].getText()=="X") && (buttons[2].getText()=="X")){
			XWinner(0,1,2);
		} 
		else if( (buttons[3].getText()=="X") &&( buttons[4].getText()=="X") && (buttons[5].getText()=="X")){
			XWinner(3,4,5);
		} 
		else if( (buttons[6].getText()=="X") &&( buttons[7].getText()=="X") && (buttons[8].getText()=="X")){
			XWinner(6,7,8);
		}
		else if( (buttons[0].getText()=="X") &&( buttons[3].getText()=="X") && (buttons[6].getText()=="X")){
			XWinner(0,3,6);
		}
		else if( (buttons[1].getText()=="X") &&( buttons[4].getText()=="X") && (buttons[7].getText()=="X")){
			XWinner(1,4,7);
		}
		else if( (buttons[2].getText()=="X") &&( buttons[5].getText()=="X") && (buttons[8].getText()=="X")){
			XWinner(2,5,8);
		}
		else if( (buttons[0].getText()=="X") &&( buttons[4].getText()=="X") && (buttons[8].getText()=="X")){
			XWinner(0,4,8);
		}
		else if( (buttons[2].getText()=="X") &&( buttons[5].getText()=="X") && (buttons[6].getText()=="X")){
			XWinner(2,4,6);
		}
		
		//Check O Conditions
		else if( (buttons[0].getText()=="O") &&( buttons[1].getText()=="O") && (buttons[2].getText()=="O")){
			OWinner(0,1,2);
		} 
		else if( (buttons[3].getText()=="O") &&( buttons[4].getText()=="O") && (buttons[5].getText()=="O")){
			OWinner(3,4,5);
		} 
		else if( (buttons[6].getText()=="O") &&( buttons[7].getText()=="O") && (buttons[8].getText()=="O")){
			OWinner(6,7,8);
		}
		else if( (buttons[0].getText()=="O") &&( buttons[3].getText()=="O") && (buttons[6].getText()=="O")){
			OWinner(0,3,6);
		}
		else if( (buttons[1].getText()=="O") &&( buttons[4].getText()=="O") && (buttons[7].getText()=="O")){
			OWinner(1,4,7);
		}
		else if( (buttons[2].getText()=="O") &&( buttons[5].getText()=="O") && (buttons[8].getText()=="O")){
			OWinner(2,5,8);
		}
		else if( (buttons[0].getText()=="O") &&( buttons[4].getText()=="O") && (buttons[8].getText()=="O")){
			OWinner(0,4,8);
		}
		else if( (buttons[2].getText()=="O") &&( buttons[5].getText()=="O") && (buttons[6].getText()=="O")){
			OWinner(2,4,6);
		}
		else {
			if(count==8)
				MatchNull();
		}
		
	}
	public void XWinner(int a, int b, int c) {
		buttons[a].setBackground(Color.GREEN);
		buttons[b].setBackground(Color.GREEN);
		buttons[c].setBackground(Color.GREEN);
		for(int i=0;i<9;i++) {
			buttons[i].setEnabled(false);
		}
		textfield.setText("X Wins, BRAVO");
	}
	public void OWinner(int a, int b, int c) {
		buttons[a].setBackground(Color.GREEN);
		buttons[b].setBackground(Color.GREEN);
		buttons[c].setBackground(Color.GREEN);
		for(int i=0;i<9;i++) {
			buttons[i].setEnabled(false);
		}
		textfield.setText("O Wins, BRAVO");
	}
	public void MatchNull() {
		textfield.setText("Oh, Match NUL");
		for(int i=0;i<9;i++) {
			buttons[i].setEnabled(false);
		}
	}
	


}
