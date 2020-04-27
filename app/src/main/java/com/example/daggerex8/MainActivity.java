package com.example.daggerex8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
@Inject Car car1;
@Inject Car car2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CarComponent component1 = DaggerCarComponent.builder().horsePower(100).engineCapacity(1400).build();
        /*CarComponent component2 = DaggerCarComponent.builder().horsePower(100).engineCapacity(1400).build();

        component1.getCar().drive();
        component2.getCar().drive();*/
        component1.inject(this);
        car1.drive();
        car2.drive();
    }
}
