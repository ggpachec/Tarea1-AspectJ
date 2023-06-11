# Tarea1-AspectJ

En este proyecto se va a Observar al JPanel, debido a que este va a cambiar su color de fondo, y va a notificar por mensaje de consola de dicho color en RGB. 


En este ejemplo, se crea una clase "Jframe" en donde contiene 3 botones y cada uno cambia el color correspondiente del JPanel.


Cada boton tiene una ActionListener para capturar los eventos al dar clic.


Esta implementación muestra la separación de preocupaciones (core y cross-cutting concerns) al tener una clase JFrame que se encarga de la lógica principal de la ventana y un ActionListener separado que se encarga de manejar los eventos de clic de los botones. Esto permite mantener un código más organizado y modular.
Además, se implemento un AspectJ "FunAdd" el cual imprime el codigo en rgb del color que se esta cambiando en el JPanel.

Adicionalmente hay una clase y un aspecto denominado UndoColorChange que permite que se pueda deshacer el cambio de color realizado. 
