package id.ac.polinema.recyclerviewsangatsederhana;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.recyclerviewsangatsederhana.adapters.SuperHeroAdapter;
import id.ac.polinema.recyclerviewsangatsederhana.models.SuperHero;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvMain;
    List<SuperHero> listSuperHero = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMain = findViewById(R.id.rvMain);

        SuperHero superHero = new SuperHero("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a6/COLLECTIE_TROPENMUSEUM_Papieren_wayangpop_voorstellende_Petruk_%28kinderspeelgoed%29_TMnr_809-45b.jpg/360px-COLLECTIE_TROPENMUSEUM_Papieren_wayangpop_voorstellende_Petruk_%28kinderspeelgoed%29_TMnr_809-45b.jpg","Petruk");
        listSuperHero.add(superHero);

        superHero = new SuperHero("https://upload.wikimedia.org/wikipedia/commons/f/f8/COLLECTIE_TROPENMUSEUM_Papieren_wayangpop_voorstellende_Nala-gareng_%28kinderspeelgoed%29_TMnr_809-45c.jpg","Gareng");
        listSuperHero.add(superHero);

        superHero = new SuperHero("https://upload.wikimedia.org/wikipedia/commons/thumb/3/3c/Wayang_Kulit_of_Semar_crop.jpg/360px-Wayang_Kulit_of_Semar_crop.jpg","Semar");
        listSuperHero.add(superHero);

        superHero = new SuperHero("https://upload.wikimedia.org/wikipedia/commons/thumb/0/00/COLLECTIE_TROPENMUSEUM_Wajangpop_voorstellende_Bagong_TMnr_3582-16.jpg/360px-COLLECTIE_TROPENMUSEUM_Wajangpop_voorstellende_Bagong_TMnr_3582-16.jpg","Bagong");
        listSuperHero.add(superHero);

        superHero = new SuperHero("https://4.bp.blogspot.com/-J-uswg5czu0/WcpN7566u_I/AAAAAAAA8C0/2imeah5_5L88bHbap8c_4EGgDQI-BSneACLcBGAs/s1600/Puntadewa.jpg","Puntadewa");
        listSuperHero.add(superHero);

        superHero = new SuperHero("https://wayang.files.wordpress.com/2010/07/bimasena1.jpg","Werkudara");
        listSuperHero.add(superHero);

        superHero = new SuperHero("https://disk.mediaindonesia.com/thumbs/600x400/news/2018/09/edcdd878e00303eda2d124a0f2788d7a.jpg","Arjuna");
        listSuperHero.add(superHero);


        superHero = new SuperHero("https://1.bp.blogspot.com/-bQrpgozxbCM/V4OdTSQmIEI/AAAAAAAAATE/1X7Wni2IuqseDhByhxDSmgME7HtYAgb8wCLcB/s1600/nakula.jpg","Nakula");
        listSuperHero.add(superHero);

        superHero = new SuperHero("https://kupubiru.files.wordpress.com/2010/12/arjuna_w.png","Sadewa");
        listSuperHero.add(superHero);

        SuperHeroAdapter superHeroAdapter = new SuperHeroAdapter(listSuperHero);

        rvMain.setAdapter(superHeroAdapter);
        rvMain.setLayoutManager(new GridLayoutManager(this,2));
    }
}