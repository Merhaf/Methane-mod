package com.modrinth.methane.util;

import com.modrinth.methane.Methane;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.random.Random;

import java.util.concurrent.ThreadLocalRandom;

public class MethaneTests {

    public static void BenchmarkRandom(){

        int iterations = 1000000000;

        ThreadLocalRandom random = ThreadLocalRandom.current();

        long time = System.nanoTime();

        for(int x = 0; x < iterations; x++ ){
            random.nextFloat();
        }

        long finaltime = System.nanoTime() - time;

        Methane.MethaneDebugger.Log("Random Benchmark Results (ThreadLocal): " + finaltime);

        Random random2 = Random.create();

        long time2 = System.nanoTime();

        for(int x = 0; x < iterations; x++ ){
            random2.nextFloat();
        }


        long finaltime2 = System.nanoTime() - time2;

        Methane.MethaneDebugger.Log("Random Benchmark Results (Random): " + finaltime2);

        if(finaltime < finaltime2){
            Methane.MethaneDebugger.Log("ThreadLocal was faster!");
        }

    }

}
