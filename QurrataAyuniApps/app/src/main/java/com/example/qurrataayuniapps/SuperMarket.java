package com.example.qurrataayuniapps;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SuperMarket extends ListActivity {
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        String[] listSM = new String[]{"Indomaret", "Alfamart", "Hypermart", "Giant"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listSM));
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
            if (pilihan.equals("Indomaret"))
                a = new Intent(this, Indomaret.class);
            {

            } if (pilihan.equals("Alfamart"))
                a = new Intent(this, Alfamart.class);
            {

            }  if (pilihan.equals("Hypermart"))
                a = new Intent(this, Hypermart.class);
            {

            }  if (pilihan.equals("Giant"))
                a = new Intent(this, Giant.class);
            {

            }

            startActivity(a);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}
