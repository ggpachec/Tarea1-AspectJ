import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Jframe extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton b_rojo;
	private JButton b_green;
	private JButton b_blue;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jframe frame = new Jframe();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Jframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		b_rojo = new JButton("Rojo");
		b_rojo.addActionListener(this);
		b_rojo.setBounds(131, 48, 117, 29);
		contentPane.add(b_rojo);
		
		b_green = new JButton("Verde");
		b_green.addActionListener(this);
		b_green.setBounds(131, 114, 117, 29);
		contentPane.add(b_green);
		
		b_blue = new JButton("Azul");
		b_blue.addActionListener(this);
		b_blue.setBounds(131, 180, 117, 29);
		contentPane.add(b_blue);
	}
	
	private void changeColor(Color c) {
		 contentPane.setBackground(c);
		
	}
	
	public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b_rojo) {
        	changeColor(Color.red);
        } else if (e.getSource() == b_green) {
        	changeColor(Color.green);
        } else if (e.getSource() == b_blue) {
        	changeColor(Color.blue);
        }
    }
}
