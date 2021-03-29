package com.example.qurrataayuniapps;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class POLICE extends ListActivity {
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        String[] listPOLICE = new String[]{"Polsek Tampan", "Polda Riau", "Polresta Pekanbaru", "Polsek Sukajadi"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listPOLICE));
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
            if (pilihan.equals("Polsek Tampan"))
                a = new Intent(this, PolsekTampan.class);
            {

            } if (pilihan.equals("Polda Riau"))
                a = new Intent(this, PoldaRiau.class);
            {

            }  if (pilihan.equals("Polresta Pekanbaru"))
                a = new Intent(this, PolrestaPKU.class);
            {

            }  if (pilihan.equals("Polsek Sukajadi"))
                a = new Intent(this, PolsekSukajadi.class);
            {

            }

            startActivity(a);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}
