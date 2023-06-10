package tarea1;
import java.awt.Color;

public aspect funAdd {
	
	
	pointcut funcion(Color c) : execution (void changeColor(Color)) && args(c);
    after(Color c) returning : funcion(c) {
			System.out.println("Nuevo color de fondo: " + c.toString());
		}
	
	
}
