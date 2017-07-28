/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en03;

/**
 *
 * @author try
 */
public class Computer {

    private String Os;
    private int ram;
    private int disk;

    /**
     * コンピュータクラス
     */
    public Computer() {
        this.Os = "UNKNOWN";
        this.ram = 8;
        this.disk = 512;
    }

    public Computer(String s) {
        this();
        this.Os = s;

    }

    public Computer(String s, int i) {
        this();
        this.Os = s;
        this.ram = i;
    }

    public String getOS() {
        return Os;
    }

    public int getRam() {
        return ram;
    }

    public int getDisk() {
        return disk;
    }

}
