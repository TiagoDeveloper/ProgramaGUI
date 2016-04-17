package br.com.tiagoDeveloper.janela.teste;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class JButtonTeste extends JButton implements ActionListener{
	
	private JTextField textField;
	
	public JButtonTeste(String nome,JTextField textField){
		super(nome);
		
		this.textField = textField;
		this.addActionListener(this);
			
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource()==this){
			
			this.textField.setText("caiu no JButtonTeste");
			
		}
	}

}
