import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;


public class Fenetre extends JFrame {
	
	Dimension dim = new Dimension(this.getHeight(),this.getWidth());
	
	//panneau principal
	private JPanel principal = new JPanel();
	
	//panneau accueil
	private AccueilPanel accueil= new AccueilPanel(dim);
	
	//panneau jeu
	private JeuPanel jeu = new JeuPanel(dim);
	
	//panneau regle
	private ReglePanel reglePan = new ReglePanel(dim);
	
	//barre du menu
	private JMenuBar menuBar = new JMenuBar();
	
	//Menus 
	private JMenu fichier = new JMenu("Fichier");
	private JMenu aPropos = new JMenu("A propos");
	
	//sous menu "fichier"
	private JMenuItem nouveau = new JMenuItem("Nouveau");
	private JMenuItem score = new JMenuItem("Score");
	private JMenuItem quitter = new JMenuItem("Quitter");
	
	//sous menu "aPropos"
	private JMenuItem regle = new JMenuItem("Règles");
	private JMenuItem info = new JMenuItem("?");
	
	public Fenetre()
	{
		this.setTitle("Pendu");
		this.setSize(900,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(true);
		initMenu();
		this.setJMenuBar(menuBar);
		this.setContentPane(reglePan.getPanel());
		//this.getContentPane().add(accueil);
		this.setVisible(true);
	}

	private void initMenu() 
	{
		fichier.add(nouveau);
		fichier.add(score);
		fichier.addSeparator();
		fichier.add(quitter);
		
		aPropos.add(regle);
		aPropos.add(info);
		
		menuBar.add(fichier);
		menuBar.add(aPropos);
		
	}
}
