
package baitap166;

public class KiemTrabai4 {

    public static void main(String[] args) {
        Diem d = new Diem();
        d.setX(3);
        d.setY(2);
        System.out.println("Diem cho co toa do la: "+d.getX()+","+d.getY());
        System.out.println("Xau chua gia tri cac thuoc tinh: "+d.toString());
            System.out.println("--------------------------------------------------");
        DiemDiChuyen dc = new DiemDiChuyen();
        //dc.setVx((float) 1.5);
        //dc.setVy((float) 3.5);
        
        dc.setVxVy(5,6);
        System.out.println("Diem di chuyen voi van toc (vx, vy) la: "+dc.getVxVy());
        dc.diChuyen();
        System.out.println("Xau chua gia tri cac thuoc tinh: "+dc.toString());
    }
    
}
