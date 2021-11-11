package com.example.tacos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText maciza;
    private EditText longaniza;
    private EditText enchilada;
    private EditText bistec;
    private EditText tripa;
    private EditText tripaEspecial;
    private EditText combinados;
    private EditText combinadosTripa;
    private TextView sumTotal;
    private int valorMaciza=12;
    private int valorLonganiza=12;
    private int valorEnchilada=12;
    private int valorBistec=13;
    private int valorTripa=16;
    private int valorTripaEsp=18;
    private int valorCombi=13;
    private int valorCombiTripa=16;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toast.makeText(this, "OnCreate", Toast.LENGTH_SHORT).show();
        // La actividad está a creada.
        maciza = (EditText)findViewById(R.id.num_maciza);
        longaniza = (EditText)findViewById(R.id.num_longaniza);
        enchilada = (EditText)findViewById(R.id.num_enchilada);
        bistec = (EditText)findViewById(R.id.num_bistec);
        tripa = (EditText)findViewById(R.id.num_tripa);
        tripaEspecial= (EditText)findViewById(R.id.num_tripaEsp);
        combinados = (EditText)findViewById(R.id.num_combi);
        combinadosTripa = (EditText)findViewById(R.id.num_combiTripa);
        sumTotal = (TextView) findViewById(R.id.txt_resultado);
    }

    public void Sumar (View view){
        String a=maciza.getText().toString();
        String b=longaniza.getText().toString();
        String c=enchilada.getText().toString();
        String d=bistec.getText().toString();
        String e=tripa.getText().toString();
        String f=tripaEspecial.getText().toString();
        String g=combinados.getText().toString();
        String h=combinadosTripa.getText().toString();
        int numMaciza = Integer.parseInt(a);
        int numLonganiza = Integer.parseInt(b);
        int numEnchilada = Integer.parseInt(c);
        int numBistec = Integer.parseInt(d);
        int numTripa = Integer.parseInt(e);
        int numTripaEsp = Integer.parseInt(f);
        int numCombi = Integer.parseInt(g);
        int numCombiTripa = Integer.parseInt(h);

        int total = (numMaciza*valorMaciza)+(numLonganiza*valorLonganiza)+(numEnchilada*valorEnchilada)+(numBistec*valorBistec)+(numTripa*valorTripa)+(numTripaEsp*valorTripaEsp)+(numCombi*valorCombi)+(numCombiTripa*valorCombiTripa);
        String resultado = String.valueOf(total);
        sumTotal.setText(resultado);

    }

    public void Restaurar (View view){
        maciza.setText("0");
        longaniza.setText("0");
        enchilada.setText("0");
        bistec.setText("0");
        tripa.setText("0");
        tripaEspecial.setText("0");
        combinados.setText("0");
        combinadosTripa.setText("0");
        sumTotal.setText("RESULTADO");
    }

    /*
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "OnStart", Toast.LENGTH_SHORT).show();
        // La actividad está a punto de hacerse visible.
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "OnResume", Toast.LENGTH_SHORT).show();
        // La actividad se ha vuelto visible (ahora se "reanuda").
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "OnPause", Toast.LENGTH_SHORT).show();
        // Enfocarse en otra actividad  (esta actividad está a punto de ser "detenida").
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "OnStop", Toast.LENGTH_SHORT).show();
        // La actividad ya no es visible (ahora está "detenida")
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "OnDestroy", Toast.LENGTH_SHORT).show();
        // La actividad está a punto de ser destruida.
    }

     */
    public  void sum (View view){
        String a=maciza.getText().toString();
        int numMaciza = Integer.parseInt(a);
        numMaciza = numMaciza+1;
        String resultado = String.valueOf(numMaciza);
        maciza.setText(resultado);
    }

}