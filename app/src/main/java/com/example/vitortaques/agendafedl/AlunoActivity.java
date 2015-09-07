package com.example.vitortaques.agendafedl;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class AlunoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aluno);

        Button btAvaliarAluno = (Button) findViewById(R.id.btAvaliarAluno);

        btAvaliarAluno.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                {
                    Intent it = new Intent(AlunoActivity.this, AvaliacaoActivity.class);
                    startActivity(it);

                }
            }

        });
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
