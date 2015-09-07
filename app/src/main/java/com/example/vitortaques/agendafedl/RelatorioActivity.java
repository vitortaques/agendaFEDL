package com.example.vitortaques.agendafedl;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class RelatorioActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relatorio);

       /* ListView ListViewRelatorio = (ListView) findViewById(ListViewRelatorio);

        ListViewRelatorio.setOnClickListener(new View.OnClickListener() {
                                           public void onClick(View v) {
                                               Intent it = new Intent(RelatorioActivity.this, ResultadoActivity.class);
                                               startActivity(it);
                                           }
                                       }

        ); */
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}

