package hust.soict.dsai.test.store.StoreTest;

import hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;
import hust.soict.dsai.aims.screen.StoreScreen;
import hust.soict.dsai.aims.store.Store.Store;

public class StoreTest {

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

        
        store.removeMedia(dvd4);

    }
    
}
