package com.example.jim.jimboelrijkpset1;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MrPotatoHeadActivity extends AppCompatActivity {

    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getResources().getConfiguration().orientation ==
                Configuration.ORIENTATION_PORTRAIT) {
            setContentView(R.layout.activity_mr_potato_head);
        } else {
            setContentView(R.layout.activity_mr_potate_head_landscape);
        }
    }

    public void set_view_visible(View view) {
        // check if checkbox is checked.
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.checkBox_Hat:
                ImageView Hat  = (ImageView) findViewById(R.id.hat);
                if (checked) {
                    Hat.setVisibility(View.VISIBLE);
                }
                else {
                    Hat.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBox_Ears:
                ImageView Ears  = (ImageView) findViewById(R.id.ears);
                if (checked) {
                    Ears.setVisibility(View.VISIBLE);
                }
                else {
                    Ears.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBox_Glasses:
                ImageView Glasses  = (ImageView) findViewById(R.id.glasses);
                if (checked) {
                    Glasses.setVisibility(View.VISIBLE);
                }
                else {
                    Glasses.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBox_Eyes:
                ImageView Eyes  = (ImageView) findViewById(R.id.eyes);
                if (checked) {
                    Eyes.setVisibility(View.VISIBLE);
                }
                else {
                    Eyes.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBox_Arms:
                ImageView Arms = (ImageView) findViewById(R.id.arms);
                if (checked) {
                    Arms.setVisibility(View.VISIBLE);
                }
                else {
                    Arms.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBox_Nose:
                ImageView Nose  = (ImageView) findViewById(R.id.nose);
                if (checked) {
                    Nose.setVisibility(View.VISIBLE);
                }
                else {
                    Nose.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBox_Mustache:
                ImageView Mustache  = (ImageView) findViewById(R.id.mustache);
                if (checked) {
                    Mustache.setVisibility(View.VISIBLE);
                }
                else {
                    Mustache.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBox_Mouth:
                ImageView Mouth  = (ImageView) findViewById(R.id.mouth);
                if (checked) {
                    Mouth.setVisibility(View.VISIBLE);
                }
                else {
                    Mouth.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBox_Shoes:
                ImageView Shoes  = (ImageView) findViewById(R.id.shoes);
                if (checked) {
                    Shoes.setVisibility(View.VISIBLE);
                }
                else {
                    Shoes.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBox_Eyebrows:
                ImageView Eyebrows  = (ImageView) findViewById(R.id.hat);
                if (checked) {
                    Eyebrows.setVisibility(View.VISIBLE);
                }
                else {
                    Eyebrows.setVisibility(View.INVISIBLE);
                }
                break;
        }
    }
}