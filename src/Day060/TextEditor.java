/*Create a simple text editor app using  java swing.*/

package Day060;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.util.*;

import java.io.*;

@SuppressWarnings("serial")
public class TextEditor extends JFrame implements ActionListener {

	JTextArea textArea = new JTextArea();
	JScrollPane scrollPane = new JScrollPane(textArea);
	JSpinner fontSizeSpinner = new JSpinner();
	JLabel fontLabel = new JLabel("Font:");
	JButton fontColorButton = new JButton("Color");
	
	@SuppressWarnings("rawtypes")
	JComboBox fontBox;
	
	JMenuBar menuBar = new JMenuBar();
	JMenu fileMenu = new JMenu("File");
	JMenuItem openItem = new JMenuItem("Open");
	JMenuItem saveItem = new JMenuItem("Save");
	JMenuItem exitItem = new JMenuItem("Exit");
	
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	TextEditor() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Text Editor");
		this.setSize(500, 500);
		this.setLayout(new FlowLayout());
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setFont(new Font("Arial", Font.PLAIN, 20));
		
		scrollPane.setPreferredSize(new Dimension(450, 450));
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		
		fontSizeSpinner.setPreferredSize(new Dimension(50, 25));
		fontSizeSpinner.setValue(20);
		fontSizeSpinner.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				
				textArea.setFont(new Font(textArea.getFont().getFamily(), Font.PLAIN, (int) fontSizeSpinner.getValue()));
			}
		});
		
		fontColorButton.addActionListener(this);
		
		String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		fontBox = new JComboBox(fonts);
		fontBox.addActionListener(this);
		fontBox.setSelectedItem("Arial");
		
//		MenuBar
		fileMenu.add(openItem);
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);
		menuBar.add(fileMenu);
		openItem.addActionListener(this);
		saveItem.addActionListener(this);
		exitItem.addActionListener(this);
		
		this.setJMenuBar(menuBar);
		this.add(fontLabel);
		this.add(fontSizeSpinner);
		this.add(fontColorButton);
		this.add(fontBox);
		this.add(scrollPane);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == fontColorButton) {
			JColorChooser colorChooser = new JColorChooser();
			
			@SuppressWarnings("static-access")
			Color color = colorChooser.showDialog(null, "Choose a color", Color.black);
			textArea.setForeground(color);
		}
		
		
		if(e.getSource() == fontBox) {
			textArea.setFont(new Font((String) fontBox.getSelectedItem(), Font.PLAIN, textArea.getFont().getSize()));
		}
		
		if(e.getSource() == openItem) {
			JFileChooser fileChooser = new JFileChooser();
			fileChooser.setCurrentDirectory(new File("."));
			FileNameExtensionFilter filter = new  FileNameExtensionFilter("Text Files", "txt");
			fileChooser.setFileFilter(filter);
			
			int response = fileChooser.showOpenDialog(null);
			
			if(response == JFileChooser.APPROVE_OPTION) {
				File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
				Scanner fileIn = null;
				
				try {
					fileIn = new Scanner(file);
					if(file.isFile()) {
						while(fileIn.hasNextLine()) {
							String line = fileIn.nextLine() + "\n";
							textArea.append(line);
						}
					}
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				}
				finally {
					fileIn.close();
				}
			}
			
		}
		
		if(e.getSource() == saveItem) {
			JFileChooser fileChooser = new JFileChooser();
			fileChooser.setCurrentDirectory(new File("."));
			
			int response = fileChooser.showSaveDialog(null);
			
			if(response == JFileChooser.APPROVE_OPTION) {
				File file;
				PrintWriter fileOut = null;
				
				file = new File(fileChooser.getSelectedFile().getAbsolutePath());
				try {
					fileOut = new PrintWriter(file);
					fileOut.println(textArea.getText());
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				}
				finally {
					fileOut.close();
				}
			}
		}
		if(e.getSource() ==exitItem) {
			System.exit(0);
		}
	}
}
