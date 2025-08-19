/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zoologi;

/**
 *
 * @author vania
 */
public class Zoologi extends IlmuBiologi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Zoologi hewan = new Zoologi();
        hewan.setNamaIlmu("Biologi");
        hewan.setObjekKajian("Hewan dan kehidupan hewan");
        hewan.setTokohPelopor("Aristoteles");
        hewan.setManfaat("Konversi dan kesehatan hewan");
        hewan.setRuangLingkup("Vertebrata dan invertebrata");
        
        hewan.setMetodePenelitian("Observasi dan eksperimen");
        hewan.setFokusKajian("Perilaku dan anatomi hewan");
        hewan.setTujuanPenelitian("Pemahaman ekosistem");
        hewan.setMetodePengamatan("Lapangan");
        
        System.out.println("Nama ilmu : " + hewan.getNamaIlmu());
        System.out.println("Objek kajian : " + hewan.getObjekKajian());
        System.out.println("Tokoh pelopor : " + hewan.getTokohPelopor());
        System.out.println("Manfaat : " + hewan.getManfaat());
        System.out.println("Ruang lingkup : " + hewan.getRuangLingkup());
        System.out.println("Metode penelitian : " + hewan.getMetodePenelitian());
        System.out.println("Fokus kajian : " + hewan.getFokusKajian());
        System.out.println("Tujuan Penelitian : " + hewan.getTujuanPenelitian());
        System.out.println("Metode pengamatan : " + hewan.getMetodePengamatan());
    }
    
}
