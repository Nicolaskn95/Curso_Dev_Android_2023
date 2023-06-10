package devandroid.nicolas.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import devandroid.nicolas.applistacurso.R;
import devandroid.nicolas.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;

    EditText txtNome;
    EditText txtSobrenome;
    EditText txtNomeCurso;
    EditText txtTelContato;

    Button btnLimpar;
    Button btnSalvar;
    Button btnFinalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLimpar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void OnClick(view v){

            }
        });

    }
}