package com.apps.gomregion.data;

import androidx.annotation.NonNull;

import com.apps.gomregion.domain.model.JustLink;
import com.apps.gomregion.domain.model.Selsovet;
import com.apps.gomregion.domain.utilities.Links;
import com.apps.gomregion.R;

import java.util.ArrayList;

public class DataProvider {

    public static ArrayList<Selsovet> dataProviderSelsovet() {
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
        list.add(new Selsovet(Links.LINK_INST_SEVENTEENTH, "Грабовский сельсовет", R.drawable.image_17));
        list.add(new Selsovet(Links.LINK_INST_EIGHTEENTH, "Марковичский сельсовет", R.drawable.image_18));
        list.add(new Selsovet(Links.LINK_INST_NINETEENTH, "Зябровский сельсовет", R.drawable.image_19));

        return list;
    }

    @NonNull
    public static ArrayList<JustLink> dataProviderJustLink() {
        ArrayList<JustLink> list = new ArrayList<>();
        list.add(new JustLink(R.string.title_01, R.string.description_01, Links.LINK_JUST_FIRST, R.drawable.just_title_01, true));
        list.add(new JustLink(R.string.title_02, R.string.description_02, Links.LINK_JUST_SECOND, R.drawable.just_title_02, true));
        list.add(new JustLink(R.string.title_03, R.string.description_03, Links.LINK_JUST_THIRD, R.drawable.just_ic_03, false));
        list.add(new JustLink(R.string.title_04, R.string.description_04, Links.LINK_JUST_FOURTH, R.drawable.just_ic_04, false));
        list.add(new JustLink(R.string.title_05, R.string.description_05, Links.LINK_JUST_FIFTH, R.drawable.just_ic_05, false));
        list.add(new JustLink(R.string.title_06, R.string.description_06, Links.LINK_JUST_SIXTH, R.drawable.just_ic_06, false));
        list.add(new JustLink(R.string.title_07, R.string.description_07, Links.LINK_JUST_SEVENTH, R.drawable.just_ic_07, false));
        list.add(new JustLink(R.string.title_08, R.string.description_08, Links.LINK_JUST_EIGHTH, R.drawable.just_ic_08, false));
        list.add(new JustLink(R.string.title_09, R.string.description_09, Links.LINK_JUST_NINTH, R.drawable.just_title_09, true));
        list.add(new JustLink(R.string.title_10, R.string.description_10, Links.LINK_JUST_TENTH, R.drawable.just_title_10, true));

        return list;
    }
}
