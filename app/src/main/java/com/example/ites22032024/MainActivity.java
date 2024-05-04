package com.example.ites22032024;
import android.os.Bundle;
        import android.content.Intent;

        import android.view.View;
        import android.widget.EditText;
        import android.widget.Toast;
        import androidx.appcompat.app.AppCompatActivity;
        import androidx.core.graphics.Insets;
        import androidx.core.view.ViewCompat;
        import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText textocorreo;
    private EditText textocontrasenia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textocorreo = findViewById(R.id.textocorreo);
        textocontrasenia = findViewById(R.id.textocontrasenia);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.login), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void login(View view) {
        String inputUsername = textocorreo.getText().toString();
        String inputPassword = textocontrasenia.getText().toString();

        if (inputUsername.equals("alumno") && inputPassword.equals("1234")) {
            Toast.makeText(this, "Inicio de sesión exitoso", Toast.LENGTH_SHORT).show();
            // Crear un Intent para iniciar la siguiente Activity
            Intent intent = new Intent(this, SegundaActivity.class);
            startActivity(intent);
        } else {
            Toast.makeText(this, "Credenciales incorrectas", Toast.LENGTH_SHORT).show();
        }
    }
}