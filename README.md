# 🔍 Analizador de Textos por Expresiones Regulares (Regex)

Aplicación de escritorio desarrollada en Java que permite el análisis y la extracción de datos de bloques de texto utilizando Expresiones Regulares (Regex). El proyecto destaca por su estricta implementación del patrón arquitectónico Modelo-Vista-Controlador (MVC).

## 🚀 Tecnologías y Arquitectura
* **Lenguaje:** Java (Core)
* **Arquitectura:** Patrón MVC (Model-View-Controller) para una clara separación de responsabilidades entre la interfaz, la lógica y los eventos[cite: 23, 24, 25, 26].
* **Interfaz Gráfica (GUI):** Construida con Java Swing (`JFrame`, `JTextArea`, `JList`) para una experiencia de usuario fluida[cite: 25].
* **Persistencia de Datos:** Manejo de I/O mediante `java.nio.file.Files` para el almacenamiento local de la información en archivos `.txt`[cite: 26].

## ✨ Funcionalidades Principales
1. **Motor de Búsqueda Regex:** Procesamiento avanzado de cadenas de texto utilizando las clases `Pattern` y `Matcher` de Java para encontrar coincidencias exactas[cite: 26].
2. **Interfaz Dinámica:** Actualización en tiempo real del conteo de palabras y volcado de resultados en una lista gráfica interactiva (`DefaultListModel`)[cite: 24, 25].
3. **Gestión de Archivos:** Capacidad de guardar el texto analizado en el sistema de archivos local de forma estructurada[cite: 24, 26].
4. **Control de Eventos:** Uso de `ActionListener` para gestionar las interacciones del usuario de manera desacoplada[cite: 24].

---
*Desarrollado por [Álvaro Jumbo Balcazar](https://www.linkedin.com/in/alvaro-jumbo-balcazar/)*
