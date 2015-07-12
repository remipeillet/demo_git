import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class JeuPanel extends PanelModi
{
	private JPanel image = new JPanel();
	private JPanel head = new JPanel();
	private JPanel body = new JPanel();
	private JLabel img = new JLabel(new ImageIcon("pendu1.jpg"));	
	private JLabel motTrouve = new JLabel("Mot trouvé");
	private JLabel motMystere = new JLabel("ffffffff");
	private JLabel score = new JLabel("Score actuel");
	private JPanel jeu = new JPanel();
	private JPanel bouton = new JPanel();
	private char[] lettres = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i','j','k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's','t','u', 'v', 'w', 'x', 'y', 'z'};
	private JButton[] buttonTab=new JButton[lettres.length];
	
	public JeuPanel(Dimension dim) {
		super(dim);
		initPanel();
	}

	protected void initPanel() 
	{
		Dimension dim = new Dimension(420, 100);
		motTrouve.setPreferredSize(dim);
		bouton.setPreferredSize(dim);
		jeu.setLayout(new BorderLayout());
		motTrouve.setFont(arial);
		score.setFont(arial);
		motMystere.setFont(comics30);
		head.setLayout(new BorderLayout());
		head.add(motTrouve, BorderLayout.NORTH);
		head.add(score, BorderLayout.SOUTH);
		jeu.add(head,BorderLayout.NORTH);
		body.setLayout(new BorderLayout());
		Dimension dimensionBouton = new Dimension(50,25);
		for(int i=0;i<lettres.length;i++)
		{
			buttonTab[i]= new JButton(String.valueOf(lettres[i]).toUpperCase());
			buttonTab[i].setPreferredSize(dimensionBouton);
			bouton.add(buttonTab[i]);
		}
		motMystere.setHorizontalAlignment((int) CENTER_ALIGNMENT);
		body.add(motMystere,BorderLayout.NORTH);
		body.add(bouton, BorderLayout.CENTER);
		jeu.add(body,BorderLayout.CENTER);
		this.panel.setLayout(new GridLayout(1,2));
		this.panel.add(jeu);
		this.panel.add(img);
		
	}

	


	
}
