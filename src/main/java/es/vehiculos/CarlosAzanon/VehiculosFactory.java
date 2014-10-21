package es.vehiculos.CarlosAzanon;

import es.upm.miw.pd.doo.polymorphism.inheritance.Figure;
import es.upm.miw.pd.factoryMethod.figure.solution.FigureCreator;

public class VehiculosFactory {
    
    private String tipo;
    
    public void setType(FigureType type) {
        this.type = type;
    }

    public void createFigure() {
        if (this.type == FigureType.CIRCLE) {
            this.figure = new Circle("Circle", 1);
        } else if (this.type == FigureType.SQUARE) {
            this.figure = new Square("Square", 1);
        } else if (this.type == FigureType.TRIANGLE) {
            this.figure = new Triangle("Triangle", 1, 1);
        } else {
            assert false : "tipo figura inesperado";
        }
    }

    public Figure getFigure() {
        return figure;
    }
    
    
    
    private Figure figure;

    private FigureCreator creator;

    public void setCreator(FigureCreator creator) {
        this.creator = creator;
    }

    public void createFigure() {
        this.figure = this.creator.createFigure();
    }

    public Figure getFigure() {
        return figure;
    }
    
}
