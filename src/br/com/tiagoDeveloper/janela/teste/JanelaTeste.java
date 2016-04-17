package br.com.tiagoDeveloper.janela.teste;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class JanelaTeste extends JFrame {
	
	private PanelTeste panel = new PanelTeste();
	
	public JanelaTeste(){
		
		this.add(panel);
		
		this.setSize(600, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
