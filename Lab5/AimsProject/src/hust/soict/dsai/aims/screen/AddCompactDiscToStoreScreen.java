package hust.soict.dsai.aims.screen;

import hust.soict.dsai.aims.store.Store.Store;

public class AddCompactDiscToStoreScreen extends AddItemToStoreScreen{
    public AddCompactDiscToStoreScreen(Store store, Runnable callback) {
        super(store, callback);  // Truyền callback xuống lớp cha
        setTitle("Add CD to Store");
        setVisible(true);
    }
}
