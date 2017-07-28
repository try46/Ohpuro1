/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en02;

/**
 *
 * @author try
 */
public class Cube {
/*
    privateメンバのint型変数名sideを宣言
    */
    private int side;

    public Cube(int s) {//int型の引数を一つもつコンストラクタを作成
        this.side = s;

    }
    
    public Cube() {//引数無しのコンストラクタを作成
        this.side = new java.util.Random().nextInt(8)+3;//3から10までの乱数を生成
    }

    public int getSide() {//一辺の長さを返す
        return side;
    }

    public int getVolume() {//体積を計算して返す
        return side * side * side;
    }
}