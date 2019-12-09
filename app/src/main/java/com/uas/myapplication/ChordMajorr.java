package com.uas.myapplication;

public class ChordMajorr {

    private String chord;
    private String jenis;
    private String deskripsi;
    private String gambar_url;
    private String poster_url;

    public ChordMajorr() {}

    public ChordMajorr(String chord, String jenis, String deskripsi, String gambar_url, String poster_url) {
        this.chord = chord;
        this.jenis = jenis;
        this.deskripsi = deskripsi;
        this.gambar_url = gambar_url;
        this.poster_url = poster_url;
    }

    public String getChord() {
        return chord;
    }

    public String getJenis() {
        return jenis;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public String getGambar_url() {
        return gambar_url;
    }

    public String getPoster_url() { return poster_url; }

    public void setChord(String chord) { this.chord = chord; }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public void setGambar_url(String gambar_url) {
        this.gambar_url = gambar_url;
    }

    public void setPoster_url(String poster_url) {
        this.poster_url = poster_url;
    }

}