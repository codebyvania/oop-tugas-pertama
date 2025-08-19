/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package microwave;

/**
 *
 * @author vania
 */
public class Microwave extends Elektronik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Microwave mito = new Microwave();
        mito.setNamaBenda("Microwave Mito");
        mito.setBahanPenyusun("Besi dan kaca");
        mito.setBerat("12.5kg");
        mito.setWarna("Pink");
        mito.setProdusen("Mito");

        mito.setSumberDaya("Listrik");
        mito.setDayaWatt(800);
        mito.setTeganganVolt(220);
        mito.setGaransi("1Tahun");
        mito.setKapasitasLiter(23);
        mito.setTingkatPanas(10);
        mito.setJenisKontrol("Digital");

        System.out.println("Nama benda : " + mito.getNamaBenda());
        System.out.println("Bahan penyusun : " + mito.getBahanPenyusun());
        System.out.println("Berat : " + mito.getBerat());
        System.out.println("Warna : " + mito.getWarna());
        System.out.println("Produsen : " + mito.getProdusen());
        System.out.println("Sumber daya : " + mito.getSumberDaya());
        System.out.println("Daya dalam watt : " + mito.getDayaWatt());
        System.out.println("Tegangan dalam volt : " + mito.getTeganganVolt());
        System.out.println("Garansi : " + mito.getGaransi());
        System.out.println("Kapasitas dalam liter : " + mito.getKapasitasLiter());
        System.out.println("Tingkatan panas : " + mito.getTingkatPanas());
        System.out.println("Jenis kontrol : " + mito.getJenisKontrol());

    }

}
