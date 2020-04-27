package com.example.daggerex8;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelModule {

    @Provides
    static Rims provideRims(){
        return new Rims();
    }

    @Provides
    static Tires provideTires(){
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    static Wheel provideWheels(Rims rims, Tires tires){
        return new Wheel(rims, tires);
    }
}
