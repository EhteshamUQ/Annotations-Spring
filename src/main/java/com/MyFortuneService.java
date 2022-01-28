package com;

import org.springframework.stereotype.Component;

@Component
public class MyFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "Fortune Favours the Brave";
    }
}
