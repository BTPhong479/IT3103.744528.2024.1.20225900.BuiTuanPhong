package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media>{

    public int compare(Media o1, Media o2){
        int costcompare = Float.compare(o2.getCost(),o1.getCost());
        if(costcompare!=0) return costcompare;
        return o1.getTitle().compareTo(o2.getTitle());
    }
    
}