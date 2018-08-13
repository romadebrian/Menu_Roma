package it.pradita.ac.id.menuroma;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageButton;

public class MenuUtama extends AppCompatActivity {
    ImageButton Profile, Tools, Settings, About;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);
        Profile = (ImageButton) findViewById(R.id.Profile);
        Tools  = (ImageButton) findViewById(R.id.Tools);
        Settings = (ImageButton) findViewById(R.id.Setting);
        About = (ImageButton) findViewById(R.id.About);

        Profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuUtama.this, Profil.class);
                startActivity(intent);
            }
        });

        Tools.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuUtama.this, Tools.class);
                startActivity(intent);
            }
        });

        Settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuUtama.this, Pengaturan.class);
                startActivity(intent);
            }
        });

        About.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuUtama.this, About.class);
                startActivity(intent);
            }
        });
    }
}
