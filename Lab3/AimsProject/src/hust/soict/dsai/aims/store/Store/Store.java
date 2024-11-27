package AimsProject.src.hust.soict.dsai.aims.store.Store;

import AimsProject.src.hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

public class Store {

    public static final int MAX_NUMBERS_STORE = 1000;

    private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[MAX_NUMBERS_STORE];

    public void addDVD(DigitalVideoDisc disc){
        
        
            for(int i=1;i<=itemsInStore.length;i++){
                if(itemsInStore[i]==null){
                    itemsInStore[i]=disc;
                    
                    break;
                }
            }
            System.out.println("Da them vao cua hang!!!");
            
        
    }


    public void removeDVD(DigitalVideoDisc disc){
        for(int i=1;i<=itemsInStore.length;i++){
            if(itemsInStore[i].equals(disc)){
                for (int j = i; j < itemsInStore.length - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }
                
                itemsInStore[itemsInStore.length - 1] = null;
                
                System.out.println("Da xoa thanh cong");
                break;
                
            }
            
        }

    }





    
}
