package com.vektorel.entities;

public class Personel {
    public String ad;
    public String soyad;
    public String adres;
    public String tckimlik;
    public String telefon;
    public String departman;
    public int ayinelemanikatsayisi;

    public void maasVer(String unvan){
        System.out.println(unvan+" Personeline maaş ödemesi yapıldı");
    }
}
