package model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Mahasiswa {
    String npm;
    String nama;
    Date tanggalLahir;

    public Mahasiswa() {
    }

    public Mahasiswa(String npm, String nama, Date tanggalLahir) {
        this.npm = npm;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
    }

    public String getNpm() {
        return npm;
    }

    public void Npm(String npm) {
        this.npm = npm;
    }

    public void Nama(String nama) {
        this.nama = nama;
    }

    public Date Tanggallahir() {
        return tanggalLahir;
    }

    public void setTanggallahir(Date tanggallahir) {
        this.tanggalLahir = tanggallahir;
    }
    void tampilkanAtribut(){
        String polaTanggal = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(polaTanggal);

        System.out.println("Nama \t\t\t : "+ this.nama);
        System.out.println("NPM \t\t\t : "+ this.npm);
        System.out.println("Tanggal Lahir : " + simpleDateFormat);
    }

    String getNama(){
        return nama;
    }

    int hitungUsia() {
        Calendar tanggalLahir = Calendar.getInstance();
        tanggalLahir.setTime(this.tanggalLahir);
        Calendar tanggalIni = Calendar.getInstance();

        int tahunLahir = tanggalLahir.get(Calendar.YEAR);
        int tahunIni = tanggalIni.get(Calendar.YEAR);

        int selisihTahun = tahunIni - tahunLahir;

        int bulanLahir = tanggalLahir.get(Calendar.MONTH);
        int bulanIni = tanggalIni.get(Calendar.MONTH);

        if (bulanIni < bulanLahir) {
            selisihTahun--;
        } else {
            int tanggalTanggalLahir = tanggalLahir.get(Calendar.DAY_OF_MONTH);
            int tanggalTanggaIni = tanggalIni.get(Calendar.DAY_OF_MONTH);
            if (bulanIni == bulanLahir) {
                if (tanggalTanggaIni < tanggalTanggalLahir) {
                    selisihTahun--;
                }

            }
        }
        return selisihTahun;
    }
}
