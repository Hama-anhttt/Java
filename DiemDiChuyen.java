package baitap166;

import java.util.Scanner;

public class DiemDiChuyen extends Diem {

    private float vx, vy;

    public DiemDiChuyen(float vx, float vy) {
        this.vx = vx;
        this.vy = vy;
    }

    public DiemDiChuyen() {
    }

    public float getVx() {
        return vx;
    }

    public void setVx(float vx) {
        this.vx = vx;
    }

    public float getVy() {
        return vy;
    }

    public void setVy(float vy) {
        this.vy = vy;
    }

    public String getVxVy() {
        return "(" + vx + "," + vy + ")";
    }

    public void setVxVy(float vx, float vy) {
        this.vx = vx;
        this.vy = vy;
    }

    public void diChuyen(float tg)
    {
       float x1 = super.getX() + tg* getVx();
        float y1 = super.getY() + tg* getVy();
        System.out.println("Diem moi sau khi di chuyen :"+ x1 +"," +y1);
    }
    @Override
    public String toString()
    {
        return "("+vx+","+ vy+")";
    }
    
}
