/*
 * Establishes needed behaviour for hyperlinks 
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.net.*;

public class JHyperlink extends JFrame
{

	JLabel label; 
	public JHyperlink(String strURL)
	{
		JPanel p = new JPanel();
		label = new JLabel("<html><a href=\" " + strURL + "\"> click </a></html>");
		final JEditorPane htmlPane = new JEditorPane();

		label.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent me) {
				label.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			public void mouseExited(MouseEvent me) {
				label.setCursor(Cursor.getDefaultCursor());
			}
			public void mouseClicked(MouseEvent me)
			{
				System.out.println("Clicked on Label...");
				try {
					htmlPane.setPage(new URL(strURL));
				}
				catch(Exception e) {
					System.out.println(e);
				}
			}
		});

	}
	
	public void setText(String url){
		label = new JLabel("<html><a href=\" " + url + "\">"+ url+ "</a></html>");
	}

	public static void main(String[] args)
	{
		JHyperlink hll = new JHyperlink("str");
	}
}
