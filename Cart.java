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


}
