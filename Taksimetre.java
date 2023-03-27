package patikaDev;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double km,perKm=2.20,tutar,total;
        int acilisUcreti=10;
        System.out.println("Mesafeyi (km) dahil edin..");

        km=sc.nextDouble();
        tutar=acilisUcreti+km*perKm;
        total=(tutar<20)?20:tutar;
        System.out.println("Total price:"+total);
    }
}
