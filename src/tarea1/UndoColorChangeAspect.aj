package tarea1;

import java.awt.Color;


public aspect UndoColorChangeAspect {
    private static Color previousColor;

    pointcut changeColorPointcut(Color c) : execution(void Jframe.changeColor(Color)) && args(c);
    pointcut undoColorChangePointcut() : execution(void Jframe.undoColorChange());

    before(Color c) : changeColorPointcut(c) {
        previousColor = c;
    }

    static void undoColorChange() {
        if (previousColor != null) {
            Jframe jframe = new Jframe();
            jframe.changeColor(previousColor);
            System.out.println("Color de fondo deshecho al estado anterior: " + previousColor.toString());
        } else {
            System.out.println("No hay cambios previos para deshacer.");
        }
    }
}