package hust.soict.dsai.aims.screen;

import hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store.Store;

public class AimsScreen {
    public static void main(String args[]){
        Store store= new Store();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        store.addMedia(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star War", "Science Fiction", "George Lucas", 87, 24.95f);
        store.addMedia(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        store.addMedia(dvd3);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 20f);
        store.addMedia(dvd4);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Aladin2", "Animation", 18.99f);
        store.addMedia(dvd5);
        DigitalVideoDisc dvd6 = new DigitalVideoDisc("Aladin3", "Animation", 18.99f);
        store.addMedia(dvd6);
        System.out.println(store.getItemsInStore());

        new StoreScreen(store);

        
        
    }

}
