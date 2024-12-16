package hust.soict.dsai.aims.media;

import java.util.Comparator;


public class MediaComparatorByTitleCost implements Comparator<Media>{

    public int compare(Media o1, Media o2){
        int titlecompare = o1.getTitle().compareTo(o2.getTitle());
        if(titlecompare!=0) return titlecompare;
        return Float.compare(o2.getCost(),o1.getCost());
    }
    
}
