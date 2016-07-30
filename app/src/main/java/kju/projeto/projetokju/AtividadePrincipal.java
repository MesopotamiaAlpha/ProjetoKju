package kju.projeto.projetokju;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AtividadePrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atividade_principal);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Seçao para logar

        final EditText edtUsuario = (EditText)findViewById(R.id.edtUsuario);
        final EditText edtSenha = (EditText)findViewById(R.id.edtSenha);
        Button  btnLogar = (Button)findViewById(R.id.btnLogar);
        final TextView lblResultado = (TextView)findViewById(R.id.lblResultado);


        btnLogar.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                String var1=edtUsuario.getText().toString();
                String var2=edtSenha.getText().toString();

                if(var1.equals("teste")|var2.equals("1234")){
                    lblResultado.setText("Sucesso");
                }else{
                    lblResultado.setText("Errado");
                };


            };
        });

        //Finaliza o log


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Email para contato", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_atividade_principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
