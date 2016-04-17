package br.com.tiagoDeveloper.janela;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JFrame;

import br.com.tiagoDeveloper.janela.Paineis.*;


@SuppressWarnings("serial")
public class Alicerce extends JFrame {
	
	private GridBagConstraints gbc = new GridBagConstraints();	
	private Painel painel = new Painel();
	

	public Alicerce(){
		super("Alicerce");
		
		this.addElementsOnStruct();
		

		this.setResizable(false);
		this.setVisible(true);
		this.setSize(600, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public void addElementsOnStruct(){
		
		
		
		this.setLayout(new GridBagLayout());
		
		gbc.insets = new Insets(5, 5, 5, 5);
		
		

		
		
		gbc.gridx = 1;
		gbc.gridy = 0;	
		this.add(painel,gbc);

		
	}

}
