package com.example.gomregion.data;

import com.example.gomregion.R;
import com.example.gomregion.domain.utilities.Links;
import com.example.gomregion.presentation.Selsovet;

import java.util.ArrayList;

public class DataProvider {
    public static ArrayList<Selsovet> dataProvider() {
        ArrayList<Selsovet> list = new ArrayList<>();
        list.add(new Selsovet(Links.LINK_INST_FIRST, "Азделинский сельсовет", R.drawable.image_01));
        list.add(new Selsovet(Links.LINK_INST_SECOND, "Бобовичский сельсовет", R.drawable.image_02));
        list.add(new Selsovet(Links.LINK_INST_THIRD, "Большевитский сельсовет", R.drawable.image_03));
        list.add(new Selsovet(Links.LINK_INST_FOURTH, "Долголесский сельсовет", R.drawable.image_04));
        list.add(new Selsovet(Links.LINK_INST_FIFTH, "Красненский сельсовет", R.drawable.image_05));
        list.add(new Selsovet(Links.LINK_INST_SIXTH, "Прибытковский сельсовет", R.drawable.image_06));
        list.add(new Selsovet(Links.LINK_INST_SEVENTH, "Руднемаримоновский сельсовет", R.drawable.image_07));
        list.add(new Selsovet(Links.LINK_INST_EIGHTH, "Тереничский сельсовет", R.drawable.image_08));
        list.add(new Selsovet(Links.LINK_INST_NINTH, "Терешковичский сельсовет", R.drawable.image_09));
        list.add(new Selsovet(Links.LINK_INST_TENTH, "Терюхский сельсовет", R.drawable.image_10));
        list.add(new Selsovet(Links.LINK_INST_ELEVENTH, "Улуковский сельсовет", R.drawable.image_11));
        list.add(new Selsovet(Links.LINK_INST_TWELFTH, "Урицкий сельсовет", R.drawable.image_12));
        list.add(new Selsovet(Links.LINK_INST_THIRTEENTH, "Ченковский сельсовет", R.drawable.image_13));
        list.add(new Selsovet(Links.LINK_INST_FOURTEENTH, "Черетянский сельсовет", R.drawable.image_14));
        list.add(new Selsovet(Links.LINK_INST_FIFTEENTH, "Шарпиловский сельсовет", R.drawable.image_15));
        list.add(new Selsovet(Links.LINK_INST_SIXTEENTH, "Приборский сельсовет", R.drawable.image_16));

        return list;
    }
}
