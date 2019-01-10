package com.example.derysudrajat.appsbbi;

public class Rwayat {
    private String mNilaiBenar;
    private String mNilaiSalah;
    private String mTingkatKesulitan;
    private String mTanggal;
    private int mNilai;

    public Rwayat(String tanggal, String nilaiBenar, String nilaiSalah, String tingkatKesulitan, int nilai){
        mNilai = nilai;
        mNilaiBenar = nilaiBenar;
        mNilaiSalah = nilaiSalah;
        mTingkatKesulitan = tingkatKesulitan;
        mTanggal = tanggal;
    }
    public String getmNilaiBenar(){
        return mNilaiBenar;
    }
    public String getmNilaiSalah(){
        return mNilaiSalah;
    }

    public String getmTanggal() {
        return mTanggal;
    }
    public String getmTingkatKesulitan(){
        return mTingkatKesulitan;
    }
    public int getmNilai(){
        return mNilai;
    }
}
