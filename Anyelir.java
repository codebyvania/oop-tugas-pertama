/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package anyelir;

/**
 *
 * @author vania
 */
public class Anyelir extends Bunga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Anyelir merah = new Anyelir();
        merah.setNamaIlmiah("Dianthus caryphyllus");
        merah.setHabitat("Daerah iklim sedang");
        merah.setJenisBiji("dikotil");
        merah.setCaraReproduksi("Generatif");
        merah.setUmurHidup("18-20 bulan");

        merah.setWarnaKelopak("Merah");
        merah.setJumlahKelopak(5);
        merah.setBentukKelopak("Bergelombang");
        merah.setAromaBunga("Harum lembut");
        merah.setCaraPenyerbukan("Serangga");
        merah.setMusimMekar("Musim semi");
        merah.setWarnaDominan("Merah tua");
        merah.setTinggiBatang("30-75cm");

        System.out.println("Nama ilmiah : " + merah.getNamaIlmiah());
        System.out.println("Habitat : " + merah.getHabitat());
        System.out.println("Jenis biji : " + merah.getJenisBiji());
        System.out.println("Cara reproduksi : " + merah.getCaraReproduksi());
        System.out.println("Umur hidup : " + merah.getUmurHidup());

        System.out.println("Warna kelopak : " + merah.getWarnaKelopak());
        System.out.println("Jumlah kelopak : " + merah.getJumlahKelopak());
        System.out.println("Bentuk kelopak : " + merah.getBentukKelopak());
        System.out.println("Aroma bunga : " + merah.getAromaBunga());
        System.out.println("Cara penyerbukan : " + merah.getCaraPenyerbukan());
        System.out.println("Musim mekar : " + merah.getMusimMekar());
        System.out.println("Warna dominan : " + merah.getWarnaDominan());
        System.out.println("Tinggi batang : " + merah.getTinggiBatang());

    }

}
