package com.example.qurrataayuniapps;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Sekolah extends ListActivity {
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        String[] listSekolah = new String[]{"MAN 2 Pekanbaru", "MAN 1 Pekanbaru", "SMA 1 Pekanbaru", "SMA 5 Pekanbaru"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listSekolah));
    }

    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkanpilihan(pilihan);
    }

    private void tampilkanpilihan(String pilihan) {
        try {
            Intent a = null;
            if (pilihan.equals("MAN 2 Pekanbaru"))
                a = new Intent(this, MAN2PKU.class);
            {

            } if (pilihan.equals("MAN 1 Pekanbaru"))
                a = new Intent(this, MAN1PKU.class);
            {

            }  if (pilihan.equals("SMA 1 Pekanbaru"))
                a = new Intent(this, SMA1PKU.class);
            {

            }  if (pilihan.equals("SMA 5 Pekanbaru"))
                a = new Intent(this, SMA5PKU.class);
            {

            }

            startActivity(a);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}
