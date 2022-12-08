package com.komsoft.example.prespring3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
//@Service("lineage")
public class Dota2 {

    //    @Autowired
//    @Qualifier("bootsOfTravel")
//    private Item heroItem;
    private final Item item;

/*
    public Dota2() {
    }
*/

    public Dota2(Item item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Dota2{" +
                "item=" + item.getNameOfItem() +
//                "item=" + item +
                '}';
    }

}
