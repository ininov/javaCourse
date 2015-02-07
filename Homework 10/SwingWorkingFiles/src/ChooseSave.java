import java.awt.EventQueue;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class ChooseSave {

	private JFrame frmFileModifier;
	public JButton saveBT;
	public ArrayList<String> array = new ArrayList<String>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChooseSave window = new ChooseSave();
					window.frmFileModifier.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
public void chooseFile(){
		
		try {
			JFileChooser fileChooser = new JFileChooser();
			fileChooser.showDialog(null, "Отвори");
			
			File file = fileChooser.getSelectedFile();
			
			FileReader fileReader = new FileReader(file); // трябва ни за прочитане на файла;
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			while (bufferedReader.ready()) { 
				String line = bufferedReader.readLine(); 
				String[] newLine = line.split("\\.|\\!|?|:|;|,|...");
				for (int i = 0; i < newLine.length; i++) {
					array.add(newLine[i]);
				}
				
			}
			bufferedReader.close();
			
			array = (ArrayList<String>) Files.readAllLines(file.toPath());
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
	}
	
	public void saveFile(){
		try {
			JFileChooser fileChooser = new JFileChooser();
			fileChooser.showDialog(null, "Запиши");
			
			File file = fileChooser.getSelectedFile();
			
			FileWriter fileStream = new FileWriter(file.getPath());
			BufferedWriter writer = new BufferedWriter(fileStream);

			
			for (String line : array) {
				writer.append(line);
				writer.newLine();
			}
			
			writer.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Create the application.
	 */
	public ChooseSave() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFileModifier = new JFrame();
		frmFileModifier.setTitle("File Modifier");
		frmFileModifier.setBounds(100, 100, 698, 416);
		frmFileModifier.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFileModifier.getContentPane().setLayout(null);
		
		JButton chooseBT = new JButton("Choose file");
		chooseBT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				chooseFile();
			}
		});
		chooseBT.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
			@Override
			public void mouseEntered(MouseEvent e) {
			}
			@Override
			public void mouseExited(MouseEvent e) {
			}
			@Override
			public void mousePressed(MouseEvent e) {
			}
			@Override
			public void mouseReleased(MouseEvent e) {
			}
		});
		chooseBT.setBackground(new Color(192, 192, 192));
		chooseBT.setForeground(new Color(119, 136, 153));
		chooseBT.setFont(new Font("Tahoma", Font.PLAIN, 30));
		chooseBT.setBounds(52, 29, 587, 131);
		frmFileModifier.getContentPane().add(chooseBT);
		
		JButton saveBT = new JButton("Save file");
		saveBT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saveFile();
			}
		});
		saveBT.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
			}
			@Override
			public void mousePressed(MouseEvent e) {
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				chooseFile();
			}
		});
		saveBT.setForeground(new Color(128, 128, 128));
		saveBT.setFont(new Font("Tahoma", Font.PLAIN, 30));
		saveBT.setBackground(new Color(192, 192, 192));
		saveBT.setBounds(52, 195, 587, 131);
		frmFileModifier.getContentPane().add(saveBT);
	}
}
