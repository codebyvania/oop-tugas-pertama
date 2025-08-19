/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package microwave;

/**
 *
 * @author vania
 */
public class Elektronik extends Benda{

    /**
     * @return the jenisKontrol
     */
    protected String getJenisKontrol() {
        return jenisKontrol;
    }

    /**
     * @param jenisKontrol the jenisKontrol to set
     */
    protected void setJenisKontrol(String jenisKontrol) {
        this.jenisKontrol = jenisKontrol;
    }

    /**
     * @return the sumberDaya
     */
    protected String getSumberDaya() {
        return sumberDaya;
    }

    /**
     * @param sumberDaya the sumberDaya to set
     */
    protected void setSumberDaya(String sumberDaya) {
        this.sumberDaya = sumberDaya;
    }

    /**
     * @return the daya
     */
    protected int getDayaWatt() {
        return dayaWatt;
    }

    /**
     * @param daya the daya to set
     */
    protected void setDayaWatt(int daya) {
        this.dayaWatt = daya;
    }

    /**
     * @return the tegangan
     */
    protected int getTeganganVolt() {
        return teganganVolt;
    }

    /**
     * @param tegangan the tegangan to set
     */
    protected void setTeganganVolt(int tegangan) {
        this.teganganVolt = tegangan;
    }

    /**
     * @return the garansi
     */
    protected String getGaransi() {
        return garansi;
    }

    /**
     * @param garansi the garansi to set
     */
    protected void setGaransi(String garansi) {
        this.garansi = garansi;
    }

    /**
     * @return the kapasitasLiter
     */
    protected int getKapasitasLiter() {
        return kapasitasLiter;
    }

    /**
     * @param kapasitasLiter the kapasitasLiter to set
     */
    protected void setKapasitasLiter(int kapasitasLiter) {
        this.kapasitasLiter = kapasitasLiter;
    }

    /**
     * @return the tingkatPanas
     */
    protected int getTingkatPanas() {
        return tingkatPanas;
    }

    /**
     * @param tingkatPanas the tingkatPanas to set
     */
    protected void setTingkatPanas(int tingkatPanas) {
        this.tingkatPanas = tingkatPanas;
    }

    
    
    private String sumberDaya;
    private int dayaWatt; //watt
    private int teganganVolt; //volt
    private String garansi;
    private int kapasitasLiter;
    private int tingkatPanas;
    private String jenisKontrol;
}
