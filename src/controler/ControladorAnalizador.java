package controler;

import model.LogicaTexto;
import view.VentanaAnalizador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.List;

public class ControladorAnalizador implements ActionListener {
    private VentanaAnalizador vista;
    private LogicaTexto modelo;

    public ControladorAnalizador(VentanaAnalizador vista, LogicaTexto modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.vista.btnAnalizarDatos.addActionListener(this);
        this.vista.btnGuardar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnGuardar) {
            
            try {
                modelo.guardarTexto(vista.txtEntradaTexto.getText());
                
            } catch (IOException ex) {
                
            }
        } else if (e.getSource() == vista.btnAnalizarDatos) {
            
            String texto = vista.txtEntradaTexto.getText();
            String regex = vista.txtExpresionRegular.getText();
            
            List<String> resultados = modelo.analizarConRegex(texto, regex);
            
            
            vista.lblNumeroPalabras.setText("Número de palabras encontradas: " + resultados.size());
            
            
            vista.modeloLista.clear();
            for (String palabra : resultados) {
                vista.modeloLista.addElement(palabra);
            }
        }
    }
}
