/*
Tanggal pengerjaan : 8 Mei 2022
        NIM : 10119224
        Nama : Daffa adisthia
        Kelas : IF-6
*/
package com.example.uts.dailyactivity;

import java.util.ArrayList;

public class Daily_Data {
    private static String[] data_kegiatan = {
            "Bangun Tidur",
            "Mandi",
            "Sarapan",
            "Kuliah",
            "Main Game",
            "Nonton Film",
            "Shalat",
            "Makan Malam",
            "Tidur"
    };

    public static ArrayList<Daily> getListData() {
        ArrayList<Daily> list = new ArrayList<>();
        for (int position = 0; position < data_kegiatan.length; position++) {
            Daily daily = new Daily();
            daily.setKegiatan(data_kegiatan[position]);
            list.add(daily);
        }
        return list;
    }
}
