package uz.najottalim.choyxona;

public class Choyxona {
    private int xonaNomeri;
    private int oshNarxi;
    private int qozonKabobNarxi;
    private int mehmonlarSoni;


       public Choyxona(int xonaNomeri, int oshNarxi, int qozonKabobNarxi, int mehmonlarSoni) {
        this.xonaNomeri = xonaNomeri;
        this.oshNarxi = oshNarxi;
        this.qozonKabobNarxi = qozonKabobNarxi;
        this.mehmonlarSoni = mehmonlarSoni;
    }

        public int getXonaNomeri() {
        return xonaNomeri;
    }

    public void setXonaNomeri(int xonaNomeri) {
        this.xonaNomeri = xonaNomeri;
    }

    public int getOshNarxi() {
        return oshNarxi;
    }

    public void setOshNarxi(int oshNarxi) {
        this.oshNarxi = oshNarxi;
    }

    public int getQozonKabobNarxi() {
        return qozonKabobNarxi;
    }

    public void setQozonKabobNarxi(int qozonKabobNarxi) {
        this.qozonKabobNarxi = qozonKabobNarxi;
    }

    public int getMehmonlarSoni() {
        return mehmonlarSoni;
    }

    public void setMehmonlarSoni(int mehmonlarSoni) {
        this.mehmonlarSoni = mehmonlarSoni;
    }
}
