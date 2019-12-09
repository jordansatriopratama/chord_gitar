package com.uas.myapplication;

public class ChordMinorr {
    private String infoChordMinorr;
    private String chord;
    private String jenis;
    private String poster_url;
    private String deskripsi;
    private String gambar_url;

    public ChordMinorr() {}

    public ChordMinorr(String chord, String jenis, String poster_url, String deskripsi, String gambar_url) {
        this.chord = chord;
        this.jenis = jenis;
        this.poster_url = poster_url;
        this.deskripsi = deskripsi;
        this.gambar_url = gambar_url;
    }

    public String getChord() {
        return chord;
    }

    public String getJenis() {
        return jenis;
    }

    public String getPoster_url() { return poster_url; }

    public String getDeskripsi() {
        return deskripsi;
    }

    public String getGambar_url() {
        return gambar_url;
    }

    public void setChord(String chord) {
        this.chord = chord;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setPoster_url(String poster_url) {
        this.poster_url = poster_url;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public void setGambar_url(String gambar_url) {
        this.gambar_url = gambar_url;
    }

}