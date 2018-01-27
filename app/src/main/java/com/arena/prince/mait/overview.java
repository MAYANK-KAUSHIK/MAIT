package com.arena.prince.mait;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import in.goodiebag.carouselpicker.CarouselPicker;

public class overview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overview);


    CarouselPicker carouselPicker = (CarouselPicker) findViewById(R.id.carousel);
    List<CarouselPicker.PickerItem> imageItems = new ArrayList<>();
imageItems.add(new CarouselPicker.DrawableItem(R.drawable.col1));
imageItems.add(new CarouselPicker.DrawableItem(R.drawable.col));
imageItems.add(new CarouselPicker.DrawableItem(R.drawable.mait4));
    //Create an adapter
    CarouselPicker.CarouselViewAdapter imageAdapter = new CarouselPicker.CarouselViewAdapter(this, imageItems, 0);
//Set the adapter
    carouselPicker.setAdapter(imageAdapter);


}
}

