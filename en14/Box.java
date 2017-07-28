/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en14;

/**
 *
 * @author try
 */
public class Box {

    private int width;
    private int height;

    public Box(int width, int height) {
        this.width = width;
        this.height = height;
    }
/**
 * この四角形のインスタンスの対角線の長さを返す
 * @return double型
 */
    public double getDiagonal() {
        return Math.sqrt(width * width + height * height);
    }
/**四角形の縦と横に引数で指定された分たします。
 * 
 * @param dw widthに引数分たします。
 * @param dh heightに引数分たします。
 */
    public void changeSize(int dw, int dh) {
        this.height = height + dh;
        this.width = width + dw;
    }

    @Override
    public String toString() {
        return width + "*" + height;
    }

}
