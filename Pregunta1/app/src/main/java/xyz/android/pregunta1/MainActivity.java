package xyz.android.pregunta1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textResultado;

    Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalcular =findViewById(R.id.buttonVer);
        textResultado = findViewById(R.id.textViewResultado);

    btnCalcular.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String nombres = "Calderón Alvarez Juan Carlos";
            textResultado.setText("Bienvenido " + nombres);
        }
    });
    }
}