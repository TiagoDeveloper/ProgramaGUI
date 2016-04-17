package br.com.tiagoDeveloper.janela.Paineis.botoes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Analizar extends JButton implements ActionListener {
	

	
	private JPanel panel;
	
	public Analizar(String nome, JPanel panel) {
		super(nome);
		this.panel = panel;
		this.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == this){
			
			JOptionPane.showMessageDialog(this.panel, "analizar");
			
		}
		
		
	}

}
