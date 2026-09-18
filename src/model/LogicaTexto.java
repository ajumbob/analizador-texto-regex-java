package model;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;

public class LogicaTexto {
    // Aqui es donde podemos registrar la ruta donde se va a crear el archivo txt de nuestro programa
	private final String RUTA_ARCHIVO = "src/text/archivo.txt";

    // creamos el metodo para guardar en el archivo de texto
    public void guardarTexto(String texto) throws IOException {
        File archivo = new File(RUTA_ARCHIVO);
        Files.writeString(Paths.get(RUTA_ARCHIVO), texto);
    }

    // usamos el matcher y el patter para poder compilar el texto
    public List<String> analizarConRegex(String texto, String regex) {
        List<String> palabrasEncontradas = new ArrayList<>();
        Pattern patron = Pattern.compile(regex);
        Matcher emparejador = patron.matcher(texto);

        while (emparejador.find()) {
            palabrasEncontradas.add(emparejador.group());
        }
        return palabrasEncontradas;
    }
}
