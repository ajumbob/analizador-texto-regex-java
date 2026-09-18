package main;

import model.LogicaTexto;
import view.VentanaAnalizador;
import controler.ControladorAnalizador;
import javax.swing.SwingUtilities;

public class Principal {

    public static void main(String[] args) {
        
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
               
                LogicaTexto modelo = new LogicaTexto();
                
              
                VentanaAnalizador vista = new VentanaAnalizador();
                
                
                ControladorAnalizador controlador = new ControladorAnalizador(vista, modelo);
                
                
                vista.setLocationRelativeTo(null); 
                vista.setVisible(true);            
            }
        });
    }
}