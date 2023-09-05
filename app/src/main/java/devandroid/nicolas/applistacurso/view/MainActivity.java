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

    Pessoa outraPessoa;

    String dadosPessoa;
    String dadosOutraPessoa;


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

        pessoa = new Pessoa();

        pessoa.setNome("Nicolas");
        pessoa.setSobrenome("Nagano");
        pessoa.setCurso("ADS");
        pessoa.setTelefone("33274919");

        outraPessoa = new Pessoa();
        outraPessoa.setNome("Isabelle");
        outraPessoa.setSobrenome("Oliveira");
        outraPessoa.setCurso("Estetica");
        outraPessoa.setTelefone("9999944444");

        dadosPessoa = "Primeiro Nome: ";
        dadosPessoa += pessoa.getNome(); //concatenar usa =+
        dadosPessoa += " Sobrenome: ";
        dadosPessoa += pessoa.getSobrenome();
        dadosPessoa += " Curso desejado: ";
        dadosPessoa += pessoa.getCurso();
        dadosPessoa += " Telefone : ";
        dadosPessoa += pessoa.getTelefone();

        dadosOutraPessoa = "Primeiro Nome: ";
        dadosOutraPessoa += outraPessoa.getNome(); //concatenar usa =+
        dadosOutraPessoa += " Sobrenome: ";
        dadosOutraPessoa += outraPessoa.getSobrenome();
        dadosOutraPessoa += " Curso desejado: ";
        dadosOutraPessoa += outraPessoa.getCurso();
        dadosOutraPessoa += " Telefone : ";
        dadosOutraPessoa += outraPessoa.getTelefone();
        int parada = 0;

        //btnLimpar.setOnClickListener(new View.OnClickListener(){
            //@Override
            //public void OnClick(view v){

            //}
        //});

    }
}