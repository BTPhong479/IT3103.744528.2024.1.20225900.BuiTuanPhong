package hust.soict.dsai.aims.screen;

import javafx.event.ActionEvent;

import java.awt.FlowLayout;

import javax.swing.JDialog;
import javax.swing.JLabel;

import hust.soict.dsai.aims.cart.Cart.Cart;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Playable;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;

public class CartScreenController {

    private Cart cart;

    public CartScreenController(Cart cart){
        super();
        this.cart=cart;
    }

    @FXML
    private Button btnPlay;

    @FXML
    private Button btnRemove;

    @FXML
    private TableColumn<Media, Float> colMediaCost;

    @FXML
    private TableColumn<Media, String> colMediaTitle;

    @FXML
    private TableColumn<Media, String> colMediacategory;

    @FXML
    private ToggleGroup filterCategory;

    @FXML
    private TableView<Media> tblMedia;

    @FXML
    private RadioButton radioBtnFilterId;

    @FXML
    private RadioButton radioBtnFilterTitle;

    @FXML
    private TextField tfFilter;

    @FXML
    private Label totalCost;


    @FXML
    private void initialize(){

        colMediaCost.setCellValueFactory(new PropertyValueFactory<Media, Float>("cost"));
        colMediaTitle.setCellValueFactory(new PropertyValueFactory<Media, String>("title"));
        colMediacategory.setCellValueFactory(new PropertyValueFactory<Media, String>("category"));
        tblMedia.setItems(this.cart.getItemsOrdered());

        btnPlay.setVisible(false);
        btnRemove.setVisible(false);

        ToggleGroup toggleGroup = new ToggleGroup();
        radioBtnFilterTitle.setToggleGroup(toggleGroup);
        radioBtnFilterId.setToggleGroup(toggleGroup);
        radioBtnFilterTitle.setSelected(true);

        this.cart.getItemsOrdered().addListener((ListChangeListener<Media>) change -> updateTotalCost());

        tblMedia.getSelectionModel().selectedItemProperty().addListener(
            new ChangeListener<Media>() {
                
                @Override
                public void changed(ObservableValue<? extends Media> observable, Media oldValue, Media newValue){
                    if(newValue!= null){
                        updateButtonBar(newValue);
                    }
                } 
            }
        );
        tfFilter.textProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed (ObservableValue<? extends String> observable, String oldValue, String newValue) {
					showFilteredMedia(newValue);
				}
			}
		);
    }

    void updateButtonBar (Media media)
	{
		btnRemove.setVisible(true);
		if(media instanceof Playable) {
			btnPlay.setVisible(true);
		}
		else {
			btnPlay.setVisible(false);
		}
	}

    @FXML
    void btnRemovePressed(ActionEvent event) {
		Media media = tblMedia.getSelectionModel().getSelectedItem();
		System.out.print(media);
		cart.removeMedia(media);
    }

    @FXML
    void btnPlayPressed(ActionEvent event){
        Media media = tblMedia.getSelectionModel().getSelectedItem();
        JDialog dialog = new JDialog();
        dialog.setTitle("Playing ");
        dialog.setSize(500,100);
        dialog.setLayout(new FlowLayout());

        JLabel label = new JLabel("Playing " + media.toString());
        dialog.add(label);

        dialog.setLocationRelativeTo(null);

        dialog.setVisible(true);
    }

    private void showFilteredMedia(String filter) {
	    ObservableList<Media> filteredItems = FXCollections.observableArrayList();
	    
	    for (Media media : cart.getItemsOrdered()) {
            if(radioBtnFilterId.isSelected()){
                if(String.valueOf(media.getId()).contains(filter)){
                    filteredItems.add(media);
                }
            }else if(radioBtnFilterTitle.isSelected()){
	            if (media.getTitle().toLowerCase().contains(filter.toLowerCase())) {
	                filteredItems.add(media);
                }
	        }
	    }
	    
	    tblMedia.setItems(filteredItems);
	}

    private void updateTotalCost() {
		Platform.runLater(() -> {
	        totalCost.setText(String.format("%.2f", cart.totalCost()) + " $");
	    });
	}
}
