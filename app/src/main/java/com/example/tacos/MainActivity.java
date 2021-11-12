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
    private int valorMaciza=12;
    private int valorLonganiza=12;
    private int valorEnchilada=12;
    private int valorBistec=13;
    private int valorTripa=16;
    private int valorTripaEsp=18;
    private int valorCombi=13;
    private int valorCombiTripa=16;
    private EditText cocacola600;
    private EditText cocacolaLata;
    private EditText sangriaCasera;
    private EditText jarochito600;
    private EditText jugoBoing;
    private EditText aguaNatural;
    private EditText cafeLeche;
    private EditText cafeAmericano;
    private int valorCocacola600=19;
    private int valorCocacolaLata=19;
    private int valorSagriaCasera=18;
    private int valorJarochito600=14;
    private int valorJugoBoing=14;
    private int valorAguaNatural=9;
    private int valorCafeLeche=16;
    private int valorCafeAmericano=14;
    private TextView sumTotal;
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
        //
        cocacola600=(EditText)findViewById(R.id.num_cocacola600);
        cocacolaLata=(EditText) findViewById(R.id.num_cocacolalata);
        sangriaCasera=(EditText) findViewById(R.id.num_sangriacasera);
        jarochito600=(EditText) findViewById(R.id.num_jarochito);
        jugoBoing=(EditText) findViewById(R.id.num_jugoBoing);
        aguaNatural=(EditText) findViewById(R.id.num_aguaNatural);
        cafeLeche=(EditText) findViewById(R.id.num_cafeLeche);
        cafeAmericano=(EditText) findViewById(R.id.num_cafeAmericano);
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
        //
        String i=cocacola600.getText().toString();
        String j=cocacolaLata.getText().toString();
        String k=sangriaCasera.getText().toString();
        String l=jarochito600.getText().toString();
        String m=jugoBoing.getText().toString();
        String n=aguaNatural.getText().toString();
        String o=cafeLeche.getText().toString();
        String p=cafeAmericano.getText().toString();
        int numCocaCola600 = Integer.parseInt(i);
        int numCocaColaLata = Integer.parseInt(j);
        int numSangriaCasera = Integer.parseInt(k);
        int numJarochito600 = Integer.parseInt(l);
        int numJugoBoing = Integer.parseInt(m);
        int numAguaNatural = Integer.parseInt(n);
        int numCafeLeche = Integer.parseInt(o);
        int numCafeAmericano = Integer.parseInt(p);



        int total = (numMaciza*valorMaciza)+(numLonganiza*valorLonganiza)+(numEnchilada*valorEnchilada)
        +(numBistec*valorBistec)+(numTripa*valorTripa)+(numTripaEsp*valorTripaEsp)+(numCombi*valorCombi)
        +(numCombiTripa*valorCombiTripa)+(numCocaCola600*valorCocacola600)+(numCocaColaLata*valorCocacolaLata)
        +(numSangriaCasera*valorSagriaCasera)+(numJarochito600*valorJarochito600)+(numJugoBoing*valorJugoBoing)
        +(numAguaNatural*valorAguaNatural)+(numCafeLeche*valorCafeLeche)+(numCafeAmericano*valorCafeAmericano);

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
        cocacola600.setText("0");
        cocacolaLata.setText("0");
        sangriaCasera.setText("0");
        jarochito600.setText("0");
        jugoBoing.setText("0");
        aguaNatural.setText("0");
        cafeLeche.setText("0");
        cafeAmericano.setText("0");
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
    public  void sumMaciza (View view){
        String a=maciza.getText().toString();
        int b = Integer.parseInt(a);
        b = b+1;
        String resultado = String.valueOf(b);
        maciza.setText(resultado);
    }
    public  void sumLonganiza (View view){
        String a=longaniza.getText().toString();
        int b = Integer.parseInt(a);
        b = b+1;
        String resultado = String.valueOf(b);
        maciza.setText(resultado);
    }
    public  void sumEnchilada (View view){
        String a=enchilada.getText().toString();
        int b = Integer.parseInt(a);
        b = b+1;
        String resultado = String.valueOf(b);
        maciza.setText(resultado);
    }
    public  void sumBistec (View view){
        String a=bistec.getText().toString();
        int b = Integer.parseInt(a);
        b = b+1;
        String resultado = String.valueOf(b);
        maciza.setText(resultado);
    }
    public  void sumTripa (View view){
        String a=tripa.getText().toString();
        int b = Integer.parseInt(a);
        b = b+1;
        String resultado = String.valueOf(b);
        maciza.setText(resultado);
    }
    public  void sumTripaEsp (View view){
        String a=tripaEspecial.getText().toString();
        int b = Integer.parseInt(a);
        b = b+1;
        String resultado = String.valueOf(b);
        maciza.setText(resultado);
    }
    public  void sumCombinados (View view){
        String a=combinados.getText().toString();
        int b = Integer.parseInt(a);
        b = b+1;
        String resultado = String.valueOf(b);
        maciza.setText(resultado);
    }
    public  void sumCombinadosTripa (View view){
        String a=combinadosTripa.getText().toString();
        int b = Integer.parseInt(a);
        b = b+1;
        String resultado = String.valueOf(b);
        maciza.setText(resultado);
    }
    public  void sumCocaCola600 (View view){
        String a=cocacola600.getText().toString();
        int b = Integer.parseInt(a);
        b = b+1;
        String resultado = String.valueOf(b);
        maciza.setText(resultado);
    }
    public  void sumCocaColaLata (View view){
        String a=cocacolaLata.getText().toString();
        int b = Integer.parseInt(a);
        b = b+1;
        String resultado = String.valueOf(b);
        maciza.setText(resultado);
    }
    public  void sumSangriaCasera (View view){
        String a=sangriaCasera.getText().toString();
        int b = Integer.parseInt(a);
        b = b+1;
        String resultado = String.valueOf(b);
        maciza.setText(resultado);
    }
    public  void sumJarochito600 (View view){
        String a=jarochito600.getText().toString();
        int b = Integer.parseInt(a);
        b = b+1;
        String resultado = String.valueOf(b);
        maciza.setText(resultado);
    }
    public  void sumAguaNatural (View view){
        String a=aguaNatural.getText().toString();
        int b = Integer.parseInt(a);
        b = b+1;
        String resultado = String.valueOf(b);
        maciza.setText(resultado);
    }
    public  void sumCafeLeche (View view){
        String a=cafeLeche.getText().toString();
        int b = Integer.parseInt(a);
        b = b+1;
        String resultado = String.valueOf(b);
        maciza.setText(resultado);
    }
    public  void sumCafeAmericano (View view){
        String a=cafeAmericano.getText().toString();
        int b = Integer.parseInt(a);
        b = b+1;
        String resultado = String.valueOf(b);
        maciza.setText(resultado);
    }


}