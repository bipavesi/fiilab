package esempi.javaxswing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringWriter;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Esempio05JMenuBar  extends JFrame{

	private static final String CONTENT_STRING="Enter has been pressed, and content is: ";
	
	public static void main(String[] args) {
		Esempio05JMenuBar frame1=new Esempio05JMenuBar();
		frame1.setVisible(true);
		frame1.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public Esempio05JMenuBar() {
	
		setTitle("Frame  1");
		setSize(400,400);
		
		final JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		JScrollPane scrollableTextArea = new JScrollPane(textArea); 
		
		getContentPane().add(scrollableTextArea);
		
		
		JMenuBar bar=new JMenuBar();
		
			JMenu file=new JMenu("File");
			
				JMenuItem item=new JMenuItem("Open");
				
				item.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						
						JFileChooser chooser=new JFileChooser();
						
						int result=chooser.showOpenDialog(Esempio05JMenuBar.this);
						
						if(result==JFileChooser.APPROVE_OPTION){
							File f=chooser.getSelectedFile();
							
							try {
								BufferedReader reader=new BufferedReader(new FileReader(f));
								String line=reader.readLine();
								
								StringWriter stringWriter=new StringWriter();
								
								while (line!=null) {
								
									stringWriter.write(line+"\n");
									line=reader.readLine();
								}
								
								textArea.setText(stringWriter.toString());
								
							} catch (FileNotFoundException e) {
								e.printStackTrace();
							} catch (IOException e) {
								e.printStackTrace();
							}
						}
					}
				});
				
			file.add(item);
		bar.add(file);
		
		setJMenuBar(bar);
	}
}
