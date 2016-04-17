package br.com.tiagoDeveloper.janela.Paineis.botoes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class EscolherArquivo extends JButton implements ActionListener {
	
	private JTextField textField1;
	
	
	public EscolherArquivo(String nome,JTextField textField1){
		super(nome);
		
		this.textField1 = textField1;
		this.addActionListener(this);
		
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == this){
			
			this.textField1.setText("funfou mané!!!");
		
		}
		
	}

}
