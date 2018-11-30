package com.example.dorin.mr_potatohead;

import android.content.Intent;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    // list for all ImageViews
    ImageView[] ImageViews = new ImageView[10];
    // list for all CheckBoxes
    CheckBox[] CheckBoxes = new CheckBox[10];
    private LayoutInflater layoutInflater;
    private PopupWindow popupWindow;
    private RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);
        relativeLayout = findViewById(R.id.relative);

        // put all imageViews in list ImageViews
        ImageViews[0] = findViewById(R.id.hat);
        ImageViews[1] = findViewById(R.id.ears);
        ImageViews[2] = findViewById(R.id.arms);
        ImageViews[3] = findViewById(R.id.nose);
        ImageViews[4] = findViewById(R.id.glasses);
        ImageViews[5] = findViewById(R.id.shoes);
        ImageViews[6] = findViewById(R.id.mouth);
        ImageViews[7] = findViewById(R.id.mustache);
        ImageViews[8] = findViewById(R.id.eyes);
        ImageViews[9] = findViewById(R.id.eyebrows);
        // put all checkBoxes in list CheckBoxes
        CheckBoxes[0] = findViewById(R.id.hat_box);
        CheckBoxes[1] = findViewById(R.id.ears_box);
        CheckBoxes[2] = findViewById(R.id.arms_box);
        CheckBoxes[3] = findViewById(R.id.nose_box);
        CheckBoxes[4] = findViewById(R.id.glasses_box);
        CheckBoxes[5] = findViewById(R.id.shoes_box);
        CheckBoxes[6] = findViewById(R.id.mouth_box);
        CheckBoxes[7] = findViewById(R.id.mustache_box);
        CheckBoxes[8] = findViewById(R.id.eyes_box);
        CheckBoxes[9] = findViewById(R.id.eyebrows_box);
    }

    // save which image is visible and which is invisible in bundle
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        // the variables are integers, they stand for if the image is visible or not
        outState.putInt("Hat", ImageViews[0].getVisibility());
        outState.putInt("Ears", ImageViews[1].getVisibility());
        outState.putInt("Arms", ImageViews[2].getVisibility());
        outState.putInt("Nose", ImageViews[3].getVisibility());
        outState.putInt("Glasses", ImageViews[4].getVisibility());
        outState.putInt("Shoes", ImageViews[5].getVisibility());
        outState.putInt("Mouth", ImageViews[6].getVisibility());
        outState.putInt("Mustache", ImageViews[7].getVisibility());
        outState.putInt("Eyes", ImageViews[8].getVisibility());
        outState.putInt("Eyebrows", ImageViews[9].getVisibility());
    }

    // when rotate mobile, restore which image is visible and which invisible
    // with the keys from the bundle saved above
    @Override
    protected void onRestoreInstanceState(Bundle inState) {
        super.onRestoreInstanceState(inState);
        // set visibility of variable with integers from the key (bundle)
        ImageViews[0].setVisibility(inState.getInt("Hat"));
        ImageViews[1].setVisibility(inState.getInt("Ears"));
        ImageViews[2].setVisibility(inState.getInt("Arms"));
        ImageViews[3].setVisibility(inState.getInt("Nose"));
        ImageViews[4].setVisibility(inState.getInt("Glasses"));
        ImageViews[5].setVisibility(inState.getInt("Shoes"));
        ImageViews[6].setVisibility(inState.getInt("Mouth"));
        ImageViews[7].setVisibility(inState.getInt("Mustache"));
        ImageViews[8].setVisibility(inState.getInt("Eyes"));
        ImageViews[9].setVisibility(inState.getInt("Eyebrows"));
    }

        public void checkClicked(View v) {
            // make v a variable for checkbox
            CheckBox checkBox = (CheckBox) v;
            // iterate over all checkboxes
            for (int i = 0; i < 10; i++) {
                // if the checkbox where you on clicked is the same as checkbox[i]
                if (checkBox.getId() == CheckBoxes[i].getId()) {
                    // if checkbox is checked
                    if (checkBox.isChecked()) {
                        // set image visible
                        ImageViews[i].setVisibility(ImageView.VISIBLE);

                        // show pop up
                        layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
                        ViewGroup container = (ViewGroup) layoutInflater.inflate(R.layout.pop_up, null);
                        popupWindow = new PopupWindow(container, 300, 70,true);
                        popupWindow.showAtLocation(relativeLayout, Gravity.CENTER_HORIZONTAL, 0, 300);
                        container.setOnTouchListener(new View.OnTouchListener() {
                            @Override
                            public boolean onTouch (View view, MotionEvent motionEvent) {
                                popupWindow.dismiss();
                                return true;
                            }
                        });
                    }

                    // if checkbox is not checked
                    else {
                        // set image invisible
                        ImageViews[i].setVisibility(ImageView.INVISIBLE);
                        // show pop up
                        layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
                        ViewGroup container = (ViewGroup) layoutInflater.inflate(R.layout.pop_up, null);
                        popupWindow = new PopupWindow(container, 300, 70,true);
                        popupWindow.showAtLocation(relativeLayout, Gravity.CENTER_HORIZONTAL, 0, 300);
                        container.setOnTouchListener(new View.OnTouchListener() {
                            @Override
                            public boolean onTouch (View view, MotionEvent motionEvent) {
                                popupWindow.dismiss();
                                return true;
                            }
                        });

                    }
                }
            }
        }
}
