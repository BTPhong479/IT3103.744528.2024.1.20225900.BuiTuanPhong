package hust.soict.dsai.aims.cart.Cart;

import java.util.Collections;

import javax.naming.LimitExceededException;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import hust.soict.dsai.aims.media.Media;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;




public class Cart {
    
    

    private final int MAX_NUMBERS_ORDERED = 20;
    private ObservableList<Media> itemsOrdered = FXCollections.observableArrayList();



    public void addMedia(Media media) throws LimitExceededException{
        if(itemsOrdered.size()< MAX_NUMBERS_ORDERED){
        itemsOrdered.add(media);
        System.out.println("Da them vao gio hang!!!");
        }else{
            throw new LimitExceededException("ERROR: the number of media has reached its limit");
        }
    }

   

    public void removeMedia(Media media){
        if(itemsOrdered.contains(media)){
             itemsOrdered.remove(media);
             System.out.println("Da xoa khoi gio hang!!!");
        }
        else System.out.println("Gio hang khong co san pham tren!!!");
    }



    public float totalCost(){
        float sum = 0.0f;
        for(Media item : itemsOrdered){
            sum += item.getCost();
        }
        return sum;
    }


    public void print(){
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for(Media item : itemsOrdered){
            System.out.println(item.toString());
        }
        System.out.println("Total cost: "+ totalCost());
        System.out.println("***************************************************");
    }


    public void searchId(int id){
        int checkvar=1;
        for(Media item : itemsOrdered){
            if(item.getId()==id){
                System.out.println(id + "."+ item.toString());
                checkvar=0;
                break;
            }
        }
        if(checkvar==1) System.out.println("Khong co Media nao co ID tren!!!");
    }

    


    public void searchTitle(String title){
        int checkvar=1;
        for(Media item : itemsOrdered){
            if(item.getTitle().equals(title)) {
            System.out.println(item.toString());
            checkvar=0;
            }
        }
        if(checkvar==1) System.out.println("Khong co Media nao giong ten!!!");
    }

    public int numberMediaCurCart(){
        return itemsOrdered.size();
    }

    public Media getMediaById(int id){
        for(Media item : itemsOrdered){
            if(item.getId()==id) {
                
                return item;
            }
        }
        return null;       
    }

    public void placeOrdered(){
        itemsOrdered.clear();
    }

    public void sortByTitle(){
        Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
        for(Media item : itemsOrdered) System.out.println(item.toString());
    }

    public void sortByCost(){
        Collections.sort(itemsOrdered, Media.COMPARE_BY_COST_TITLE);
        for(Media item : itemsOrdered) System.out.println(item.toString());
    }

    public ObservableList<Media> getItemsOrdered(){
        return itemsOrdered;
    }


    

}


