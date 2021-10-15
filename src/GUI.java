

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUI    implements ActionListener{
	
	private JFrame frame;
	private JPanel panel;
	private JLabel UserLabel;
	private JLabel PasswordLabel;
	private JLabel ErreurMessage;
	private JTextField UserText;
	private JPasswordField PasswordText;
	private JButton ButtonGo;
	public GUI(){
		panel =new JPanel();
		frame =new JFrame();
		
		UserLabel =new JLabel("UserName"); 
		PasswordLabel =new JLabel("KEY: TIKCHBILA...?");
		ErreurMessage =new JLabel("");
		UserText  =new JTextField(20);
		PasswordText =new JPasswordField();
		ButtonGo =new JButton("GO");
		//frame
		frame.setSize(350,200);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(panel);
		frame.setTitle("Page de Connexion");
		
		//panel
		panel.setLayout(null);
		panel.add(UserLabel);
		panel.add(UserText);
		panel.add(PasswordLabel);
		panel.add(PasswordText);
		panel.add(ButtonGo);
		panel.add(ErreurMessage);
		
		//lable
			//User
		UserLabel.setBounds(10,20,80,25);
			//Password
		PasswordLabel.setBounds(10,50,130,25); 
			//erreurMessage
		ErreurMessage.setBounds(80,130,300,25);
		
		//TextField
			//User
		UserText.setBounds(130,20,165,25);
			//Password
		PasswordText.setBounds(130,50,165,25);
		
		//JButton
		ButtonGo.setBounds(120,80,80,25);
		ButtonGo.addActionListener(this);
		 
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String UserName=UserText.getText();
		String PAssword=String.valueOf(PasswordText.getPassword());
		
		if(UserName.equals("") ) {
			ErreurMessage.setText("Erreur!! --__--  USERNAME ??");

		}
		else {
			if(PAssword.equalsIgnoreCase("tiwliwla")) {
			ErreurMessage.setText(" Go ");
			frame.setVisible(false);
			new Tic_Tac_Toe();
			}
			else {
				ErreurMessage.setText("KEY is TiWLiWLA !! --__--   ");
			}
		}	
		
	}
	
	
	public  static void main(String[] T) {
		new GUI(); 	
	}




 
 



}
