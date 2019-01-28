package com.company;

public class BujurSangkar {
    private int sisi;
    private int keliling;

    public void HitungKel(){
        this.keliling = 4 * sisi;
    }

    public int getSisi() {
        return sisi;
    }

    public int getKeliling(){
        return keliling;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }
}
