package com.example.myviewandviews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.transition.Slide;
import android.view.View;
import android.view.ViewTreeObserver;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Biodata Ku");

            ImageSlider imageslider = findViewById(R.id.back);

            List<SlideModel> slideModels= new ArrayList<>();
            slideModels.add(new SlideModel(R.drawable.burung,"Aku"));
            slideModels.add(new SlideModel("https://i.pinimg.com/originals/64/9b/9d/649b9daffd009363d36618230f71e357.jpg","PemanisAja"));
            slideModels.add(new SlideModel("https://awsimages.detik.net.id/community/media/visual/2020/07/09/lamborghini-sian-roadster-1_169.jpeg?w=620","Mobilku"));
            slideModels.add(new SlideModel("https://i.pinimg.com/originals/e8/92/f3/e892f32007c565c440480ab262ea2e07.jpg","Rumahku"));
            slideModels.add(new SlideModel("https://i.pinimg.com/736x/3d/79/92/3d7992adb82045e2d2115caafa9f8386.jpg","Semoga Terkabul"));

            imageslider.setImageList(slideModels,true);

//            findViewById(R.id.fb).setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    clik_socialmedia("facebook.com");
//                }
//            });
//
//            findViewById(R.id.ig).setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    clik_socialmedia("https://www.instagram.com/rpw_24/?hl=id");
//                }
//            });
//
//            findViewById(R.id.ig).setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    clik_socialmedia("whatshap.com");
//                }
//            });
        }

    }

    public void clik_socialmedia(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://wa.wizard.id/512f64") );
        startActivity(intent);


    }

}
