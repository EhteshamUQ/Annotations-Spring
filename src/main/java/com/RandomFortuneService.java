package com;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService{

    private String data[]= {
            "Charted",
            "No way Home",
            "Far From Home"
    };
    private Random random = new Random();
    @Override
    public String getFortune() {
        int index  = random.nextInt(data.length);

        return data[index];
    }
}
