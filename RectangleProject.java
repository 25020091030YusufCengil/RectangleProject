package rectangleproject;

public class RectangleProject {
    public static void main(String[] args) {
   
        Rectangle r1 = new Rectangle(44, 23);
        
        Rectangle r2 = new Rectangle(4.7, 23);

        System.out.println("1'nci dikdortgen:");
        System.out.println("genislik: " + r1.genislik);
        System.out.println("yukseklik: " + r1.yukseklik);
        System.out.println("alan: " + r1.getAlan());
        System.out.println("cevre: " + r1.getCevre());
        
        System.out.println("");

        // İkinci dikdörtgenin bilgileri
        System.out.println("2'nci dikdortgen:");
        System.out.println("genislik: " + r2.genislik);
        System.out.println("yukseklik: " + r2.yukseklik);
        System.out.println("alan: " + r2.getAlan());
        System.out.println("cevre: " + r2.getCevre());
    }
}

class Rectangle {
    double genislik = 1;
    double yukseklik = 1;

    Rectangle() {
    }

    Rectangle(double newGenislik, double newYukseklik) {
        genislik = newGenislik;
        yukseklik = newYukseklik;
    }
    double getAlan() {
        return genislik * yukseklik;
    }
    double getCevre() {
        return 2 * (genislik + yukseklik);
    }
}