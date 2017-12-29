import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JToolBar;
import javax.swing.JTabbedPane;

public class GUILauncher {

	private JFrame frmGui;
	private JTextField TFNumberone;
	private JTextField TFNumbertwo;
	private JLabel lblSecondNumber;
	private JLabel lblThirdNumber;
	private JTextField TFNumber3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUILauncher window = new GUILauncher();
					window.frmGui.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUILauncher() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGui = new JFrame();
		frmGui.getContentPane().setBackground(Color.BLUE);
		frmGui.setForeground(Color.BLUE);
		frmGui.setResizable(false);
		frmGui.setIconImage(Toolkit.getDefaultToolkit().getImage("/Users/neal/Library/Mobile Documents/com~apple~CloudDocs/Backup/bwspit.jpg"));
		frmGui.setTitle("GUI");
		frmGui.setBackground(Color.BLUE);
		frmGui.setAlwaysOnTop(true);
		frmGui.setBounds(100, 100, 450, 171);
		frmGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGui.getContentPane().setLayout(null);
		
		JButton btnMath = new JButton("Math");
		btnMath.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int textone = Integer.parseInt(TFNumberone.getText());
				int texttwo = Integer.parseInt(TFNumbertwo.getText());
				String result = Integer.toString(textone + texttwo);
				TFNumber3.setText(result);
				JOptionPane.showMessageDialog(null, "Anwser Computed!");
			}
		});
		btnMath.setBounds(171, 44, 117, 29);
		frmGui.getContentPane().add(btnMath);
		
		JLabel lblFirstNumber = new JLabel("First number:");
		lblFirstNumber.setBounds(53, 29, 84, 16);
		frmGui.getContentPane().add(lblFirstNumber);
		
		TFNumberone = new JTextField();
		TFNumberone.setBounds(29, 44, 130, 26);
		frmGui.getContentPane().add(TFNumberone);
		TFNumberone.setColumns(10);
		
		TFNumbertwo = new JTextField();
		TFNumbertwo.setBounds(300, 44, 130, 26);
		frmGui.getContentPane().add(TFNumbertwo);
		TFNumbertwo.setColumns(10);
		
		lblSecondNumber = new JLabel("Second number:");
		lblSecondNumber.setBounds(312, 29, 101, 16);
		frmGui.getContentPane().add(lblSecondNumber);
		
		lblThirdNumber = new JLabel("Third number:");
		lblThirdNumber.setBounds(181, 73, 94, 29);
		frmGui.getContentPane().add(lblThirdNumber);
		
		TFNumber3 = new JTextField();
		TFNumber3.setBounds(159, 101, 130, 26);
		frmGui.getContentPane().add(TFNumber3);
		TFNumber3.setColumns(10);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 74, 21);
		frmGui.getContentPane().add(tabbedPane);
	}
}
