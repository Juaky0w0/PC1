package xyz.android.pregunta3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioGroup grupoConvertidor;
    EditText  editTextNum;
    Button btnConvertir;
    Button btnLimpiar;
    TextView resultados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        grupoConvertidor = findViewById(R.id.GrupoConvertidor);
        editTextNum = findViewById(R.id.editTextNum);
        btnConvertir = findViewById(R.id.btnConvertir);
        btnLimpiar = findViewById(R.id.btnLimpiar);
        resultados = findViewById(R.id.txtResult);

        btnConvertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double cantidad = Double.parseDouble(editTextNum.getText().toString());
                double resultado = 0;

                int seleccionId = grupoConvertidor.getCheckedRadioButtonId();
                if (seleccionId == R.id.radioButton1){
                    resultado = cantidad/1000;
                    resultados.setText(String.format("%.2f metros son %.2f kilómetros", cantidad, resultado));
                } else if (seleccionId == R.id.radioButton2){
                    resultado = cantidad*1000;
                    resultados.setText(String.format("%.2f kilómetros son %.2f metros", cantidad, resultado));
                }

            }

        });
        btnLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultados.setText("0");
                editTextNum.setText("");
            }
        });
    }
}