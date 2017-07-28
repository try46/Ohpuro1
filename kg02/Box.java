/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg02;

/**
 *
 * @author try
 */
public class Box {

    private int Width;
    private int Height;

    public void setWidth(int w) {
        this.Width = w;
    }

    public void setHeight(int h) {
        this.Height = h;
    }

    public int getArea() {
        return Width * Height;
    }
}
