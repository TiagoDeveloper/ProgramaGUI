package br.com.tiagoDeveloper.janela.Paineis.botoes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Fechar extends JButton implements ActionListener{
	
	private JPanel panel;
	
	
	public Fechar(String nome, JPanel panel){
		super(nome);
		
		
		this.panel = panel;
		this.addActionListener(this);
	}

	public JPanel getPanel() {
		return panel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == this){
			
			System.exit(0);
		}
		
	}
	
	
	

}
