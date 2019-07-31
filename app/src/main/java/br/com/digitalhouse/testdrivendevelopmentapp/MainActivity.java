package br.com.digitalhouse.testdrivendevelopmentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText palavra_edittext_id;
    private Button ok_button_id;
    private TextView resultado_text_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        palavra_edittext_id = findViewById(R.id.palavra_edittext_id);
        ok_button_id = findViewById(R.id.ok_button_id);
        resultado_text_id = findViewById(R.id.resultado_text_id);

        ok_button_id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String palavraInvertida = invertePalavra(palavra_edittext_id.getEditableText().toString());
                resultado_text_id.setText(palavraInvertida);
            }
        });
    }

    public String invertePalavra(String palavra) {
        String palavraInvertida = "";

        for (int i = palavra.length(); i > 0; i--) {
            palavraInvertida = palavraInvertida + palavra.substring(i - 1, i);
        }

        return palavraInvertida;
    }
}