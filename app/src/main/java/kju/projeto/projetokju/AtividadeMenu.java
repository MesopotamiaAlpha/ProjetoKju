package kju.projeto.projetokju;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class AtividadeMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atividade_menu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        //Traz a janela Produtos doces

        Button btnDoces = (Button)findViewById(R.id.btnDoces);
        btnDoces.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent i = new Intent(AtividadeMenu.this,AtividadeProdutosDoces.class);
                startActivities(new Intent[]{i});
            }
        });
        //Termina o processo produtos

        //Traz a tela status
        Button btnStatus = (Button)findViewById(R.id.btnStatus);
        btnStatus.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent i = new Intent(AtividadeMenu.this,AtividadeStatus.class);
                startActivities(new Intent[]{i});
            }
        });
        //Termina o processo

        //Traz Janela Status

        //Traz a janela de sucos
        Button btnSucos = (Button)findViewById(R.id.btnSucos);
        btnSucos.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent i = new Intent(AtividadeMenu.this,AtividadeSucos.class);
                startActivities(new Intent[]{i});
            }
        });
        //Termina o processo



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Algum contato", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
