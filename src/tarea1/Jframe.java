package tarea1;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Jframe extends JFrame {
    private JPanel contentPane;
    private JButton b_rojo;
    private JButton b_green;
    private JButton b_blue;
    private JButton b_undo;

    private Color previousColor;

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

    public Jframe() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 400);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        b_rojo = new JButton("Rojo");
        b_rojo.addActionListener(e -> changeColor(Color.RED));
        b_rojo.setBounds(131, 48, 117, 29);
        contentPane.add(b_rojo);

        b_green = new JButton("Verde");
        b_green.addActionListener(e -> changeColor(Color.GREEN));
        b_green.setBounds(131, 114, 117, 29);
        contentPane.add(b_green);

        b_blue = new JButton("Azul");
        b_blue.addActionListener(e -> changeColor(Color.BLUE));
        b_blue.setBounds(131, 180, 117, 29);
        contentPane.add(b_blue);

        b_undo = new JButton("Deshacer");
        b_undo.addActionListener(e -> undoColorChange());
        b_undo.setBounds(131, 246, 117, 29);
        contentPane.add(b_undo);
    }

    void changeColor(Color c) {
        previousColor = contentPane.getBackground();
        contentPane.setBackground(c);
        System.out.println("Nuevo color de fondo: " + c.toString());
    }

    private void undoColorChange() {
        if (previousColor != null) {
            contentPane.setBackground(previousColor);
            System.out.println("Color de fondo deshecho al estado anterior: " + previousColor.toString());
        } else {
            System.out.println("No hay cambios previos para deshacer.");
        }
    }
}
