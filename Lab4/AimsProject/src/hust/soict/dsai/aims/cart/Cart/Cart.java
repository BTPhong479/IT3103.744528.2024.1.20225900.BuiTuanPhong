package AimsProject.src.hust.soict.dsai.aims.cart.Cart;

import java.util.ArrayList;

import AimsProject.src.hust.soict.dsai.aims.media.Media;
import AimsProject.src.hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;



public class Cart {
    
    

    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();



    public void addMedia(Media media){
        itemsOrdered.add(media);
        System.out.println("Da them vao gio hang!!!");
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
        for(Media item : itemsOrdered){
            if(item.getId()==id){
                System.out.println(id + "."+ item.toString());
                break;
            }
        }
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
    

}


