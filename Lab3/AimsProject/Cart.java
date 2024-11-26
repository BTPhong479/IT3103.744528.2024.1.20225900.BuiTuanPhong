public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 21;

    int qtyOrder=0;

    private DigitalVideoDisc itemsOdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED]; 

    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if(qtyOrder==20){
            System.out.println("Gio hang da day!!!");
        }
        else {
            for(int i=1;i<=itemsOdered.length;i++){
                if(itemsOdered[i]==null){
                    itemsOdered[i]=disc;
                    qtyOrder+=1;
                    break;
                }
            }
            System.out.println("Da them vao gio hang!!!");
            
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc disc1, DigitalVideoDisc disc2){
        if(qtyOrder==19){
            System.out.println("Gio hang da day!!!");
        }
        else{
            for(int i=1;i<itemsOdered.length;i++){
                if(itemsOdered[i]==null){
                    itemsOdered[i]=disc1;
                    itemsOdered[i+1]=disc2;
                    qtyOrder+=2;
                    break;
                }
            }
            System.out.println("Da them 2 sam pham!!!");
        }
    }
        

    public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList){
        if(qtyOrder + dvdList.length >= 21){
            System.out.println("Gio hang day do danh sach lon!!");
        }
        else{
        for(int i=1; i<=itemsOdered.length; i++){
            if(itemsOdered[i]==null){

                System.arraycopy(dvdList, 0, itemsOdered,i, dvdList.length );
                qtyOrder+=dvdList.length;
                break;

            }
            
        }
        System.out.println("Da them vao gio hang danh sach !!");
        }
    }


    /*  public void addDigitalVideoDisc(DigitalVideoDisc... discs){
        
        for(DigitalVideoDisc disc:discs){

        
        if(qtyOrder==20){
            System.out.println("Gio hang da day!!!");
        }
        else {
            for(int i=1;i<=itemsOdered.length;i++){
                if(itemsOdered[i]==null){
                    itemsOdered[i]=disc;
                    qtyOrder+=1;
                    break;
                }
            }
            System.out.println("Da them vao gio hang!!!");
            
        }
    }
    }
    */

    public float totalCost(){
        float sum = 0.0f;
        for(int i = 1 ; itemsOdered[i]!= null && i<itemsOdered.length ; i++){
            sum+= itemsOdered[i].getCost();
        }
        return sum;
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        for(int i=1;i<=itemsOdered.length;i++){
            if(itemsOdered[i].equals(disc)){
                for (int j = i; j < itemsOdered.length - 1; j++) {
                    itemsOdered[j] = itemsOdered[j + 1];
                }
                
                itemsOdered[itemsOdered.length - 1] = null;
                qtyOrder--;
                System.out.println("Da xoa thanh cong");
                break;
                
            }
            
        }

    }

    public void print(){
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for(int i=1 ; i<itemsOdered.length; i++){
            if(itemsOdered[i]==null) break;
            System.out.println(i+ ". "+ itemsOdered[i].toString());
            
        }
        System.out.println("Total cost: "+ totalCost());
        System.out.println("***************************************************");
    }
    public void searchId(int id){
        for(int i=1; i<=itemsOdered.length; i++){
            if(itemsOdered[i]!=null){
                if(itemsOdered[i].getId()==id) {
                    System.out.println(id+ ". "+ itemsOdered[i].toString());
                    break;
                }
            }else{
                System.out.println("not found");
                break;
            }
        }
    }


    public void searchTitle(String title){
        int checkvar=1;
        for(int i=1; i<itemsOdered.length;i++){
            if(itemsOdered[i]==null){
                if(checkvar==1) System.out.println("not found this title");
                break;
            }
            if(itemsOdered[i].isMatch(title)) {
                System.out.println(itemsOdered[i].toString()); 
                checkvar=0;
            }
        }
    }
}
