package br.com.tiagoDeveloper.janela.teste;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class PanelTeste extends JPanel{
	
	private GridBagConstraints gbc = new GridBagConstraints();
	private JTextField textField = new JTextField(30);
	private JButtonTeste button = new JButtonTeste("TESTE",textField);
	
	public PanelTeste(){
		
		
		this.addElements();
		
	}
	public void addElements(){
		this.setLayout(new GridBagLayout());
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		this.add(textField);
		gbc.gridx = 1;
		gbc.gridy = 0;
		this.add(button);
		
		
		
		
		
	}

	

}
