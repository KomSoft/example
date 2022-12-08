package com.komsoft.example.prespring3;

import org.springframework.stereotype.Component;

@Component
//@Component("heroItem")
public class BootsOfTravel extends Item {

    @Override
    public String getNameOfItem() {
        return "Boots Of Travel";
    }


}
