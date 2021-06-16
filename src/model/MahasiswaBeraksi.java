package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class MahasiswaBeraksi {
    public static void main(String[] args) throws ParseException{

        String polaTanggal = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(polaTanggal);

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.npm = "19710095";
        mahasiswa.nama = "Nurafifah Hani";
        mahasiswa.tanggalLahir = simpleDateFormat.parse( "30-01-2001");

        System.out.println("Nama \t\t\t : " + mahasiswa.nama);
        System.out.println("Npm \t\t\t : " + mahasiswa.npm);
        System.out.println("Tanggal Lahir \t : " + simpleDateFormat.format(mahasiswa.tanggalLahir));
        System.out.println("Usia  \t\t\t : " + mahasiswa.hitungUsia() + " Tahun");
        System.out.println("");

        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.npm = "19710015";
        mahasiswa2.nama = "Muhammad Sidik";
        mahasiswa2.tanggalLahir = simpleDateFormat.parse( "06-03-2000");

        System.out.println("Nama \t\t\t : " + mahasiswa2.nama);
        System.out.println("Npm \t\t\t : " + mahasiswa2.npm);
        System.out.println("Tanggal Lahir \t : " + simpleDateFormat.format(mahasiswa2.tanggalLahir));
        System.out.println("Usia \t\t\t : " + mahasiswa2.hitungUsia() + " Tahun");
        System.out.println("");
    }
}