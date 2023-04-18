package xyz.android.pregunta2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editTextUser;
    EditText editTextPass;
    Button btnLogin;
    TextView textViewMsj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextUser = findViewById(R.id.editTextTextPersonName);
        editTextPass = findViewById(R.id.editTextTextPassword);
        btnLogin = findViewById(R.id.button);
        textViewMsj = findViewById(R.id.textViewMensaje);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = editTextUser.getText().toString();
                String pass = editTextPass.getText().toString();

                String msj = "Bienvenido, " + user + ". Tu contraseña es " + pass;

                Toast.makeText(getApplicationContext(), msj, Toast.LENGTH_SHORT).show();
               // textViewMsj.setText(msj);
            }
        });

    }
}