package com.example.dorin.mr_potatohead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    // define variables for images
    ImageView hat;
    ImageView eyebrows;
    ImageView eyes;
    ImageView glasses;
    ImageView nose;
    ImageView mustache;
    ImageView mouth;
    ImageView ears;
    ImageView arms;
    ImageView shoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // connect images to the variables
        hat = findViewById(R.id.hat);
        ears = findViewById(R.id.ears);
        arms = findViewById(R.id.arms);
        nose = findViewById(R.id.nose);
        glasses = findViewById(R.id.glasses);
        shoes = findViewById(R.id.shoes);
        mouth = findViewById(R.id.mouth);
        mustache = findViewById(R.id.mustache);
        eyes = findViewById(R.id.eyes);
        eyebrows = findViewById(R.id.eyebrows);
    }

    // save which image is visible and which is invisible in bundle
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        // the variables are integers, they stand for if the image is visible or not
        outState.putInt("Hat", hat.getVisibility());
        outState.putInt("Ears", ears.getVisibility());
        outState.putInt("Arms", arms.getVisibility());
        outState.putInt("Nose", nose.getVisibility());
        outState.putInt("Glasses", glasses.getVisibility());
        outState.putInt("Shoes", shoes.getVisibility());
        outState.putInt("Mouth", mouth.getVisibility());
        outState.putInt("Mustache", mustache.getVisibility());
        outState.putInt("Eyes", eyes.getVisibility());
        outState.putInt("Eyebrows", eyebrows.getVisibility());
    }

    // when rotate mobile, restore which image is visible and which invisible
    // with the keys from the bundle saved above
    @Override
    protected void onRestoreInstanceState(Bundle inState) {
        super.onRestoreInstanceState(inState);
        // set visibility of variable with integers from the key (bundle)
        hat.setVisibility(inState.getInt("Hat"));
        ears.setVisibility(inState.getInt("Ears"));
        arms.setVisibility(inState.getInt("Arms"));
        nose.setVisibility(inState.getInt("Nose"));
        glasses.setVisibility(inState.getInt("Glasses"));
        shoes.setVisibility(inState.getInt("Shoes"));
        mouth.setVisibility(inState.getInt("Mouth"));
        mustache.setVisibility(inState.getInt("Mustache"));
        eyes.setVisibility(inState.getInt("Eyes"));
        eyebrows.setVisibility(inState.getInt("Eyebrows"));
    }


        public void checkClicked(View v) {
        // make v a variable for checkbox
        CheckBox checkBox = (CheckBox) v;

        // iterate over al checkboxes and get id
        switch (checkBox.getId()) {
            // case for id arms image
            case R.id.arms_box:
                // check if checkbox is checked
                if (checkBox.isChecked()) {
                    // set image visible
                    arms.setVisibility(ImageView.VISIBLE);
                }
                // if checkbox is not checked, set image invisible
                else {
                    arms.setVisibility(ImageView.INVISIBLE);
                }
                break;
            case R.id.ears_box:
                //ImageView ears = findViewById(R.id.ears);
                if (checkBox.isChecked()) {
                    ears.setVisibility(ImageView.VISIBLE);
                }
                else {
                    ears.setVisibility(ImageView.INVISIBLE);
                }
                break;
            case R.id.shoes_box:
                //ImageView shoes = findViewById(R.id.shoes);
                if (checkBox.isChecked()) {
                    shoes.setVisibility(ImageView.VISIBLE);
                }
                else {
                    shoes.setVisibility(ImageView.INVISIBLE);
                }
                break;
            case R.id.nose_box:
                //ImageView nose = findViewById(R.id.nose);
                if (checkBox.isChecked()) {
                    nose.setVisibility(ImageView.VISIBLE);
                }
                else {
                    nose.setVisibility(ImageView.INVISIBLE);
                }
                break;
            case R.id.mouth_box:
                //ImageView mouth = findViewById(R.id.mouth);
                if (checkBox.isChecked()) {
                    mouth.setVisibility(ImageView.VISIBLE);
                }
                else {
                    mouth.setVisibility(ImageView.INVISIBLE);
                }
                break;
            case R.id.mustache_box:
                //ImageView mustache = findViewById(R.id.mustache);
                if (checkBox.isChecked()) {
                    mustache.setVisibility(ImageView.VISIBLE);
                }
                else {
                    mustache.setVisibility(ImageView.INVISIBLE);
                }
                break;
            case R.id.glasses_box:
                //ImageView glasses = findViewById(R.id.glasses);
                if (checkBox.isChecked()) {
                    glasses.setVisibility(ImageView.VISIBLE);
                }
                else {
                    glasses.setVisibility(ImageView.INVISIBLE);
                }
                break;
            case R.id.eyes_box:
                //ImageView eyes = findViewById(R.id.eyes);
                if (checkBox.isChecked()) {
                    eyes.setVisibility(ImageView.VISIBLE);
                }
                else {
                    eyes.setVisibility(ImageView.INVISIBLE);
                }
                break;
            case R.id.eyebrows_box:
                //ImageView eyebrows = findViewById(R.id.eyebrows);
                if (checkBox.isChecked()) {
                    eyebrows.setVisibility(ImageView.VISIBLE);
                }
                else {
                    eyebrows.setVisibility(ImageView.INVISIBLE);
                }
                break;
            case R.id.hat_box:
                //ImageView hat = findViewById(R.id.hat);
                if (checkBox.isChecked()) {
                    hat.setVisibility(ImageView.VISIBLE);
                }
                else {
                    hat.setVisibility(ImageView.INVISIBLE);
                }
                break;
        }
    }



}
