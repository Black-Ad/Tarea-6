package com.example.administrador.tarea6;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ArrayAdapter;
        import android.widget.ListView;
        import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    private String[] paises = {"Argentina","Chile","Paraguay","Bolivia","Perú","Ecuador"};
    private String[] ciudades = {"Buenos Aires","Santiago","Asunción","La Paz","Lima","Quito"};
    private TextView tv1;
    private ListView lv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1=findViewById(R.id.tv1);
        lv1=findViewById(R.id.list1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, paises);
        lv1.setAdapter(adapter);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView adapterView, View view, int i, long l) {
                tv1.setText("Ha seleccionado la ciudad de "+ lv1.getItemAtPosition(i) + " es "+ ciudades[i]);
            }
        });
    }
}