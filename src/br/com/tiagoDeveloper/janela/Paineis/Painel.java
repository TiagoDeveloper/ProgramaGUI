package br.com.tiagoDeveloper.janela.Paineis;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.com.tiagoDeveloper.janela.Paineis.botoes.Analizar;
import br.com.tiagoDeveloper.janela.Paineis.botoes.Cancelar;
import br.com.tiagoDeveloper.janela.Paineis.botoes.EscolherArquivo;
import br.com.tiagoDeveloper.janela.Paineis.botoes.Fechar;

@SuppressWarnings("serial")
public class Painel extends JPanel {
	
	private JLabel label1 = new JLabel("Label1");
	private JLabel label2 = new JLabel("Label2");
	private JTextField textField1 = new JTextField(30);
	private JTextField textField2 = new JTextField(30);
	private EscolherArquivo escolherArquivo1 = new EscolherArquivo("Escolher Arquivo",textField1);
	private EscolherArquivo escolherArquivo2 = new EscolherArquivo("Escolher Arquivo",textField2);
	
	private Analizar analizar = new Analizar("Analizar",this);
	private Cancelar cancelar = new Cancelar("cancelar",this);
	private Fechar fechar = new Fechar("Fechar",this);
	
	
	
	private GridBagConstraints gbc = new GridBagConstraints();
	
	
	
	public Painel(){
		
		
		
		
		this.addElementsOnStruct();
		
		
		
				
		//this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	}
	
	
	
	public void addElementsOnStruct(){
		
		this.setLayout(new GridBagLayout());
		
		gbc.insets = new Insets(10, 10 , 10, 10);
		
		
		//linha 1 comeco
		gbc.gridx = 0;//coluna
		gbc.gridy = 0;//linha	
		this.add(label1,gbc);	
		
		gbc.gridx = 1;//coluna
		gbc.gridy = 0;//linha		
		this.add(textField1,gbc);
		
		gbc.gridx = 2;//coluna
		gbc.gridy = 0;//linha
		this.add(escolherArquivo1,gbc);
		//linha 1 fim
		
		
		
		
		//linha 2 comeco
		gbc.gridx = 0;//coluna
		gbc.gridy = 1;//linha
		this.add(label2,gbc);
		
		gbc.gridx = 1;//coluna
		gbc.gridy = 1;//linha
		this.add(textField2,gbc);
		
		gbc.gridx = 2;//coluna
		gbc.gridy = 1;//linha
		this.add(escolherArquivo2,gbc);
		//linha 2 fim
		
		
		
		
		gbc.insets = new Insets(0, 56 , 0, 0);//arreda 56 pixels a direita
		gbc.anchor = GridBagConstraints.WEST;
		//linha 3 comeco
		gbc.gridx = 1;//coluna
		gbc.gridy = 2;//linha	
		this.add(analizar,gbc);		
		
		gbc.insets = new Insets(0, 0 , 0, 0);
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.gridx = 1;//coluna
		gbc.gridy = 2;//linha	
		this.add(cancelar,gbc);		
		
		gbc.insets = new Insets(0, 0 , 0, 65);//arreda 65 pixels a esquerda
		gbc.anchor = GridBagConstraints.EAST;
		gbc.gridx = 1;//coluna
		gbc.gridy = 2;//linha			
		this.add(fechar,gbc);
		//linha 3 fim
		


	}


}