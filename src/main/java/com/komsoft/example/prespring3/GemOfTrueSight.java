package com.komsoft.example.prespring3;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary
@Component
public class GemOfTrueSight extends Item {

    @Override
    public String getNameOfItem() {
        return "Gem Of True Sight";
    }

}
