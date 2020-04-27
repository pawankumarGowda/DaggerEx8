package com.example.daggerex8;

import android.util.Log;

import javax.inject.Inject;

public class Car {

    private static final String TAG = "Car";

    private Engine engine;
    private Wheel wheel;
    private Driver driver;

    @Inject
    public Car(Driver driver, Engine engine, Wheel wheel) {
        this.driver = driver;
        this.engine = engine;
        this.wheel = wheel;
    }

    public void enableRemote(Remote remote){

    }

    void drive(){
        engine.start();
        Log.d(TAG, driver + ".......driving...." + this);
    }


}
