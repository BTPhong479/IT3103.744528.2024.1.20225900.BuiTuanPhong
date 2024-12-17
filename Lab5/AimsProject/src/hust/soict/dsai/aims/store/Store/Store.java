package hust.soict.dsai.aims.store.Store;

import hust.soict.dsai.aims.media.Media;
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

    public void print(){
        for(Media item : itemsInStore){
            System.out.println(item.toString());
        }
    }

    public ArrayList<Media> getItemsInStore(){
        return itemsInStore;
    }

    public void searchTitle(String title){
        int checkvar=1;
        for(Media item : itemsInStore){
            if(item.getTitle().equals(title)) {
                System.out.println(item.toString());
                checkvar=0;
            }
        }
        if(checkvar==1) System.out.println("Khong co Media co Title giong tren");
    }
    public Media getMediaById(int id){
        for(Media item : itemsInStore){
            if(item.getId()==id) {
                
                return item;
            }
        }
        return null;       
    }

    

}





    

