/*
Tanggal pengerjaan : 8 Mei 2022
        NIM : 10119224
        Nama : Daffa adisthia
        Kelas : IF-6
*/
package com.example.uts.dailyactivity;

import com.example.uts.R;

import java.util.ArrayList;

public class Friends_Data {
    private static String[] data_nama = {
            "Nuraeni Eka susanti",
            "Ferdi Bayu",
            "Badra Samsudin",
            "Fajar nugraha",
            "Mya haulia "
    };

    private static String[] data_username = {
            "@nuraekaa",
            "@ferdibayufbryan",
            "@aksaraaaaaaaaa",
            "@fajar.nugraha",
            "@haull__"
    };

    private static int[] data_img = {
            R.drawable.eka,
            R.drawable.bayu,
            R.drawable.badra,
            R.drawable.fajar,
            R.drawable.haul
    };

    public static ArrayList<Friends> getListData() {
        ArrayList<Friends> list = new ArrayList<>();
        for (int position = 0; position<data_nama.length; position++) {
            Friends friends = new Friends();
            friends.setNama(data_nama[position]);
            friends.setUsername(data_username[position]);
            friends.setFoto(data_img[position]);
            list.add(friends);
        }
        return list;
    }
}
