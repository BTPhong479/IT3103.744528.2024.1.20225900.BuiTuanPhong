package AimsProject.src.hust.soict.dsai.aims.store.Store;

import AimsProject.src.hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;
import AimsProject.src.hust.soict.dsai.aims.media.Media;
import java.util.ArrayList;


public class Store {

    private ArrayList<Media> itemsInStore = new ArrayList<Media>();

    public void addMedia(Media media){
        itemsInStore.add(media);
        System.out.println("Da them vao cua hang!!!");
    }

    public void removeMedia(Media media){
        if(itemsInStore.contains(media)) {
            itemsInStore.remove(media);
            System.out.println("Da xoa khoi cua hang!!!");
        }else System.out.println("Media tren ko co trong cua hang");
    }

}





    

