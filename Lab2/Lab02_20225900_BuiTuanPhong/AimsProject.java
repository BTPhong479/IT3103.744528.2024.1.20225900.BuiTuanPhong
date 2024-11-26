
public class AimsProject{
    public static void main(String[] args){
        Cart a1 = new Cart();
        DigitalVideoDisc dvd1= new DigitalVideoDisc("abc","def", "ghi", 12, 19.95f);
        a1.addDigitalVideoDisc(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("hfgs", "jsfgsjf", "sjdfsj", 75, 24.95f);
        a1.addDigitalVideoDisc(dvd2);
        DigitalVideoDisc dvd3= new DigitalVideoDisc("sfgjsdf", "jsgfjsdfgs", "hgsfshgf", 25, 18.99f);
        a1.addDigitalVideoDisc(dvd3);
        DigitalVideoDisc dvd4= new DigitalVideoDisc("sfgjsgdf", "jsgfjshdfgs", "hggsfshgf", 225, 15.99f);
        a1.addDigitalVideoDisc(dvd4);
         
        System.out.print("Total cost is: ");
        System.out.println(a1.totalCost());
        a1.removeDigitalVideoDisc(dvd2);
        System.out.print("Total cost is: ");
        System.out.println(a1.totalCost());
    }
}

