package com.example.vitortaques.agendafedl;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Button btProfessor = (Button) findViewById(R.id.btProfessor);
       Button btAluno = (Button) findViewById(R.id.btAluno);
       Button btConexao = (Button) findViewById(R.id.btConexao);
       Button btRelatorio = (Button) findViewById(R.id.btRelatorio);

        btProfessor.setOnClickListener(new View.OnClickListener() {
                                          public void onClick(View v) {
                                              Intent it = new Intent(MainActivity.this, ProfessorActivity.class);
                                              startActivity(it);
                                          }
                                      }

        );

        btAluno.setOnClickListener(new View.OnClickListener() {
                                           public void onClick(View v) {
                                               Intent it = new Intent(MainActivity.this, AlunoActivity.class);
                                               startActivity(it);
                                           }
                                       }

        );

        btConexao.setOnClickListener(new View.OnClickListener() {
                                          public void onClick(View v) {
                                              Intent it = new Intent(MainActivity.this, ConexaoActivity.class);
                                              startActivity(it);
                                          }
                                      }

        );

         btRelatorio.setOnClickListener(new View.OnClickListener() {
                                           public void onClick(View v) {
                                               Intent it = new Intent(MainActivity.this, RelatorioActivity.class);
                                               startActivity(it);
                                           }
                                       }

        );

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
