package hust.soict.dsai.test.disc.TestPassingParameter;

import hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

public class TestPassingParameter {
    public static void main(String args[]){
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("JungLe");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

        swap(jungleDVD, cinderellaDVD);
        System.out.println("jungle dvd title: "+ jungleDVD.getTitle());
        System.out.println("cinderella dvd title: "+ cinderellaDVD.getTitle());

        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("jungle dvd title: "+ jungleDVD.getTitle());


    }

    public static void swap(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2){
        String tmp1 = dvd1.getTitle();
        String tmp2 = dvd2.getTitle();
        dvd1.setTitle(tmp2);
        dvd2.setTitle(tmp1);

    }

    public static void changeTitle(DigitalVideoDisc dvd, String Title){
        String oldTitle= dvd.getTitle();
        dvd.setTitle(Title);
        dvd= new DigitalVideoDisc(oldTitle);

    }
}
