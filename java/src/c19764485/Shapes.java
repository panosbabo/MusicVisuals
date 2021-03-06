package c19764485;

import ie.tudublin.Visual;
import processing.core.PApplet;

public class Shapes extends Visual
{  
    MyVisual shp;
    float wave = sin(radians(PI * (float) 2.0));
    float angle = 0;

    public Shapes(MyVisual shp)
    {
        this.shp = shp; 
    } 

    public void render()
    {
        shp.translate(width * 5, height * 5);
        shp.colorMode(PApplet.HSB);
        shp.strokeWeight(2);
        // noFill();

        for (int i = 0; i < 255; i++)
        {
            float c = map(i, 0, 255, 0, 255);
            shp.stroke(c, 255, 255);
            shp.rotate(angle / 3);
            shp.line(850, i - wave / 2, -850, i++);
            shp.line(-850, i + wave, -850, i++);
            shp.line(-850, i - wave, -850, i++);    
        }
        angle += 0.01f;
    }
}
