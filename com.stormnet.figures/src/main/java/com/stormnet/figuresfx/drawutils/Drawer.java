package com.stormnet.figuresfx.drawutils;

import com.stormnet.figuresfx.figures.Figure;
import javafx.scene.canvas.GraphicsContext;

import java.util.List;

public class Drawer<T extends Figure & Drawable>{
    List<T> figures;

    public Drawer(List<T> figures){
        this.figures = figures;
    }

    public void draw(GraphicsContext gc){
        for(T figure : figures){
            if(figure != null){
                figure.draw(gc);
            }
        }
    }

}
