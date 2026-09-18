package view;

import javax.swing.*;
import java.awt.*;

public class VentanaAnalizador extends JFrame {
    public JTextArea txtEntradaTexto;
    public JTextField txtExpresionRegular;
    public JButton btnAnalizarDatos;
    public JButton btnGuardar;
    public JLabel lblNumeroPalabras;
    public JList<String> listaPalabras; 
    public DefaultListModel<String> modeloLista;

    public VentanaAnalizador() {
        setTitle("Analizador de Textos por ER");
        setSize(550, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new BorderLayout(10, 10)); 

       
        txtEntradaTexto = new JTextArea(10, 40);
        txtExpresionRegular = new JTextField(20);
        btnAnalizarDatos = new JButton("Analizar datos");
        btnGuardar = new JButton("GUARDAR");
        lblNumeroPalabras = new JLabel("Número de palabras encontradas: 0");
        
        modeloLista = new DefaultListModel<>();
        listaPalabras = new JList<>(modeloLista);

        

        
        JPanel panelNorte = new JPanel(new BorderLayout());
        panelNorte.setBorder(BorderFactory.createTitledBorder("Archivo de texto"));
        panelNorte.add(new JScrollPane(txtEntradaTexto), BorderLayout.CENTER); 

        JPanel panelCentro = new JPanel(new FlowLayout());
        panelCentro.add(new JLabel("EXPRESIÓN REGULAR:"));
        panelCentro.add(txtExpresionRegular);
        panelCentro.add(btnAnalizarDatos);

       
        JPanel panelSur = new JPanel(new BorderLayout(5, 5));
        panelSur.setBorder(BorderFactory.createTitledBorder("Resultados"));
        
        
        JPanel panelEtiquetas = new JPanel(new GridLayout(2, 1));
        panelEtiquetas.add(lblNumeroPalabras);
        panelEtiquetas.add(new JLabel("Listado de palabras:"));
        
        panelSur.add(panelEtiquetas, BorderLayout.NORTH);
        panelSur.add(new JScrollPane(listaPalabras), BorderLayout.CENTER);
        
        
        JPanel panelBoton = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        panelBoton.add(btnGuardar);
        panelSur.add(panelBoton, BorderLayout.SOUTH);

        
        add(panelNorte, BorderLayout.NORTH);
        add(panelCentro, BorderLayout.CENTER);
        add(panelSur, BorderLayout.SOUTH);
    }
}