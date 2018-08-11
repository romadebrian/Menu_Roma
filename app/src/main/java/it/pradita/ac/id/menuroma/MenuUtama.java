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
        Profile = (ImageButton) findViewById(R.id.imageButton);

    }
    // WEW
    public void Profile_Click (View V)
    {
        Intent intent = new Intent(MenuUtama.this, Profil.class);
        startActivity(intent);
    }
}
