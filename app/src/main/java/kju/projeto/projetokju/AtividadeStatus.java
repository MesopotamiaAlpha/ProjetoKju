package kju.projeto.projetokju;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class AtividadeStatus extends AppCompatActivity {

    int contador = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atividade_status);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Meio de contato", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        try {
            iniciarcontador();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void iniciarcontador() throws InterruptedException {
        //Aqui faz a contagem
        setContentView(R.layout.activity_atividade_status);
        final TextView lblStatus1 =(TextView)findViewById(R.id.lblStatus1);

                contador++;

                    while (contador == 0 || contador <=5){
                        Log.e("Contador é:",Integer.toString(contador));
                        Thread.sleep(1000);
                        contador++;
                        lblStatus1.setText("Produto sendo feito...");
                        lblStatus1.setTextColor(0xffC8E8FD);
                    }if(contador == 4){
                        lblStatus1.setText("Produto pronto!");
                        lblStatus1.setTextColor(0xffC2CA43);
                    }

                }


            }






