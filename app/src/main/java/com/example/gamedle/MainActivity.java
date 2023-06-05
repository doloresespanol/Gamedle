package com.example.gamedle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Gra wylosowanaGra;
    String[] images;

    int imageIndex = 0,punkty = 0,dodaj;
    ArrayList<String> list = new ArrayList<>();

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.textView);
        TextView textView2 = findViewById(R.id.textView2);
        TextView textView3 = findViewById(R.id.textView3);
        TextView textView4 = findViewById(R.id.textView4);
        TextView textView5 = findViewById(R.id.textView5);
        TextView textView6 = findViewById(R.id.textView6);
        EditText editText = findViewById(R.id.editText);
        textView.setText("Liczba zebranych punktów: "+punkty);

        ArrayList<Gra> listaGier = new ArrayList<Gra>();
        Gra gra1 = new Gra("Pac-Man","🕹","\uD83D\uDC7B","\uD83C\uDF52","\uD83D\uDC7E","\uD83C\uDF55","Pacman");
        Gra gra2 = new Gra("Super Mario Bros.","\uD83C\uDF44","\uD83E\uDDE2","\uD83C\uDFF0","\uD83D\uDC22","\uD83C\uDFAE","Mario");
        Gra gra3 = new Gra("The Legend of Zelda: Ocarina of Time","\uD83D\uDDE1","\uD83D\uDD11","\uD83D\uDC0E","\uD83C\uDF33","\uD83C\uDF19","Zelda");
        Gra gra4 = new Gra("Halo: Combat Evolved","\uD83D\uDD2B","\uD83C\uDF0D","\uD83D\uDC7D","\uD83D\uDE80","\uD83D\uDCA5","Halo");
        Gra gra5 = new Gra("Grand Theft Auto: San Andreas","\uD83D\uDE97","\uD83D\uDCB0","\uD83D\uDD2B","\uD83C\uDF06","\uD83D\uDCA5","GTA");
        Gra gra6 = new Gra("Call of Duty: Modern Warfare","\uD83D\uDCA3","\uD83D\uDCA5","\uD83D\uDD2B","\uD83C\uDF0D","\uD83D\uDC80","COD");
        Gra gra7 = new Gra("Minecraft","\uD83E\uDDF1","\uD83D\uDD28","\uD83D\uDC7E","\uD83D\uDC6A","\uD83C\uDF33","Mc");
        Gra gra8 = new Gra("Metal Gear Solid 4: Guns of the Patriots","\uD83D\uDEE1","\uD83E\uDD16","\uD83D\uDD2B","\uD83C\uDF0D","\uD83D\uDCA3","Metal Gear Solid");
        Gra gra9 = new Gra("The Sims","\uD83D\uDC68","\u200D\uD83D\uDC69","\u200D\uD83D\uDC67","\uD83D\uDC66","\uD83D\uDCBC","Sims");
        Gra gra10 = new Gra("Angry Birds","\uD83D\uDC26","\uD83D\uDC37","\uD83D\uDCA3","\uD83C\uDFF0","\uD83D\uDE21","Angry Birds");
        Gra gra11 = new Gra("Candy Crush Saga","\uD83C\uDF6D","\uD83C\uDF6C","\uD83C\uDF6B","\uD83C\uDFC6","\uD83C\uDF1F","Candy Crush");
        Gra gra12 = new Gra("Fortnite","\uD83C\uDF2A","\uD83D\uDEF8","\uD83D\uDD2B","\uD83D\uDC51","\uD83D\uDCA3","Fortnite");
        Gra gra13 = new Gra("Pokemon Red/Blue","⚡","\uD83D\uDD25","\uD83D\uDCA7","\uD83C\uDF0D","\uD83D\uDD1D","Pokemon");
        Gra gra14 = new Gra("Super Smash Bros. Ultimate","\uD83D\uDC4A","\uD83C\uDFAE","\uD83C\uDF1F","\uD83E\uDD4A","\uD83C\uDF89","Super Smash Bros");
        Gra gra15 = new Gra("Assassin's Creed: Odyssey","⚔","\uD83C\uDFDB","\uD83D\uDDFA","\uD83C\uDF0A","\uD83E\uDDDC","Assassin's Creed");
        Gra gra16 = new Gra("Tomb Raider","⚔","\uD83E\uDDD7","♀","\uD83C\uDFF9","\uD83D\uDD11","Tomb Raider");
        Gra gra17 = new Gra("FIFA 21","⚽","\uD83C\uDFAE","\uD83C\uDFC6","\uD83C\uDF0D","⚡","FIFA");
        Gra gra18 = new Gra("Need for Speed: Underground","\uD83D\uDE97","\uD83D\uDCA8","\uD83C\uDF06","\uD83C\uDFC1","\uD83D\uDD25","Need for Speed");
        Gra gra19 = new Gra("Overwatch","\uD83D\uDE80","\uD83D\uDCA5","\uD83D\uDD2B","\uD83D\uDEE1","\uD83C\uDF0E","OW");
        Gra gra20 = new Gra("Resident Evil 2","\uD83E\uDDDF","♂","\uD83D\uDD2B","\uD83C\uDFE2","\u200D\uD83C\uDF03","Resident Evil");
        Gra gra21 = new Gra("God of War","⚔","\uD83C\uDF0B","\uD83C\uDFDB","\uD83C\uDF0D","\uD83D\uDD25","God of War");
        Gra gra22 = new Gra("Portal","\uD83D\uDEAA","\uD83D\uDD35","\uD83E\uDD16","\uD83D\uDD3A","\uD83D\uDD73","Portal");
        Gra gra23 = new Gra("Bioshock","\uD83D\uDC89","\uD83C\uDF0A","\uD83C\uDFE2","\uD83D\uDD2B","\uD83D\uDC68","Bioshock");
        Gra gra24 = new Gra("Mass Effect","\uD83D\uDE80","\uD83C\uDF0C","\uD83D\uDC7D","\uD83D\uDD2B","\uD83C\uDF0D","Mass Effect");
        Gra gra25 = new Gra("StarCraft","⭐","\uD83D\uDE80","\uD83C\uDF0C","\uD83D\uDD2B","\uD83C\uDFF0","SC");
        Gra gra26 = new Gra("World of Warcraft","⚔","\uD83C\uDF0D","\uD83E\uDDDD","♂","\uD83D\uDD25","WOW");
        Gra gra27 = new Gra("Diablo III","⚔","\uD83C\uDFF0","\uD83D\uDD25","\uD83D\uDC79","\uD83C\uDF0C","Diablo");
        Gra gra28 = new Gra("Tetris","\uD83D\uDD79","\uD83E\uDDF1","\uD83D\uDD3A","⬇","\uD83C\uDFAE","Tetris");
        Gra gra29 = new Gra("Street Fighter II","\uD83D\uDC4A","\uD83E\uDD4B","\uD83C\uDF06","\uD83C\uDF1F","\uD83D\uDCA5","Street Fighter");
        Gra gra30 = new Gra("Skyrim","⚔","\uD83C\uDFF0","\uD83D\uDC09","❄","\uD83E\uDDD9","Skyrim");
        listaGier.add(gra1);
        listaGier.add(gra2);
        listaGier.add(gra3);
        listaGier.add(gra4);
        listaGier.add(gra5);
        listaGier.add(gra6);
        listaGier.add(gra7);
        listaGier.add(gra8);
        listaGier.add(gra9);
        listaGier.add(gra10);
        listaGier.add(gra11);
        listaGier.add(gra12);
        listaGier.add(gra13);
        listaGier.add(gra14);
        listaGier.add(gra15);
        listaGier.add(gra16);
        listaGier.add(gra17);
        listaGier.add(gra18);
        listaGier.add(gra19);
        listaGier.add(gra20);
        listaGier.add(gra21);
        listaGier.add(gra22);
        listaGier.add(gra23);
        listaGier.add(gra24);
        listaGier.add(gra25);
        listaGier.add(gra26);
        listaGier.add(gra27);
        listaGier.add(gra28);
        listaGier.add(gra29);
        listaGier.add(gra30);

        Button btn = findViewById(R.id.button);
        Button losujBtn = findViewById(R.id.button2);
        losujBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                list.clear();
                Random random = new Random();
                int index = random.nextInt(listaGier.size());
                textView2.setText("✘");
                textView3.setText("✘");
                textView4.setText("✘");
                textView5.setText("✘");
                textView6.setText("✘");
                wylosowanaGra = listaGier.get(index);
                listaGier.remove(index);
                textView.setText("Liczba zebranych punktów: "+punkty);

                images = new String[]{wylosowanaGra.e1, wylosowanaGra.e2, wylosowanaGra.e3, wylosowanaGra.e4, wylosowanaGra.e5};

                if (list.isEmpty()) {
                    for (String i : images) {
                        list.add(i);
                    }
                }
                Collections.shuffle(list);
                textView2.setText(list.get(0));
                imageIndex = 1;
                dodaj=5;
                losujBtn.setEnabled(false);
                btn.setEnabled(true);
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String text = editText.getText().toString();
                if(text.equalsIgnoreCase(wylosowanaGra.nazwa) || text.equalsIgnoreCase(wylosowanaGra.nazwa_alt)){
                    editText.setText("");
                    textView2.setText("✅");
                    textView3.setText("✅");
                    textView4.setText("✅");
                    textView5.setText("✅");
                    textView6.setText("✅");
                    punkty += dodaj;
                    textView.setText("Liczba zebranych punktów: "+punkty);

                    imageIndex=4;
                    Toast.makeText(MainActivity.this, "udało sie", Toast.LENGTH_SHORT).show();
                    btn.setEnabled(false);
                    losujBtn.setEnabled(true);
                    imageIndex = 0;
                    if(listaGier.isEmpty()){
                        Toast.makeText(MainActivity.this, "Brawo wygrałeś!", Toast.LENGTH_SHORT).show();
                        textView.setText("Koniec\nPunkty: "+punkty);
                        losujBtn.setEnabled(false);

                        editText.setText("");
                    }
                }else{
                    if (imageIndex == 1) {
                        textView3.setText(list.get(1));
                        imageIndex = 2;
                        dodaj = 4;
                        textView.setText("Liczba zebranych punktów: "+punkty);
                    } else if (imageIndex == 2) {
                        textView4.setText(list.get(2));
                        imageIndex = 3;
                        dodaj = 3;
                        textView.setText("Liczba zebranych punktów: "+punkty);
                    }  else if (imageIndex == 3) {
                        textView5.setText(list.get(3));
                        imageIndex = 4;
                        dodaj = 2;
                        textView.setText("Liczba zebranych punktów: "+punkty);
                    }else if(imageIndex == 4){
                        textView6.setText(list.get(4));
                        imageIndex = 5;
                        dodaj = 1;
                        textView.setText("Liczba zebranych punktów: "+punkty);
                    }
                }
            }
        });
    }
}