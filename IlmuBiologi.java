/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoologi;

/**
 *
 * @author vania
 */
public class IlmuBiologi extends Ilmu {

    /**
     * @return the metodePengamatan
     */
    protected String getMetodePengamatan() {
        return metodePengamatan;
    }

    /**
     * @param metodePengamatan the metodePengamatan to set
     */
    protected void setMetodePengamatan(String metodePengamatan) {
        this.metodePengamatan = metodePengamatan;
    }

    /**
     * @return the metodePenelitian
     */
    protected String getMetodePenelitian() {
        return metodePenelitian;
    }

    /**
     * @param metodePenelitian the metodePenelitian to set
     */
    protected void setMetodePenelitian(String metodePenelitian) {
        this.metodePenelitian = metodePenelitian;
    }


    /**
     * @return the fokusKajian
     */
    protected String getFokusKajian() {
        return fokusKajian;
    }

    /**
     * @param fokusKajian the fokusKajian to set
     */
    protected void setFokusKajian(String fokusKajian) {
        this.fokusKajian = fokusKajian;
    }

    /**
     * @return the tujuanPenelitian
     */
    protected String getTujuanPenelitian() {
        return tujuanPenelitian;
    }

    /**
     * @param tujuanPenelitian the tujuanPenelitian to set
     */
    protected void setTujuanPenelitian(String tujuanPenelitian) {
        this.tujuanPenelitian = tujuanPenelitian;
    }
    
    private String metodePenelitian;
    private String fokusKajian;
    private String tujuanPenelitian;
    private String metodePengamatan;

}
