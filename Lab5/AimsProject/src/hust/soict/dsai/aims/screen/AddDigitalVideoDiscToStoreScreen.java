package hust.soict.dsai.aims.screen;

import hust.soict.dsai.aims.store.Store.Store;

public class AddDigitalVideoDiscToStoreScreen extends AddItemToStoreScreen{
    public AddDigitalVideoDiscToStoreScreen(Store store, Runnable callback) {
        super(store, callback);  // Truyền callback xuống lớp cha
        setTitle("Add DVD to Store");
        setVisible(true);
    }
}
