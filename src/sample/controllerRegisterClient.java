package sample;
import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import javax.swing.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class controllerRegisterClient implements Initializable{

    @FXML
    private JButton buton_reg_c;
    private JComboBox combo_box_judet_rc;
    private JComboBox combo_box_loc_rc;
    private JFXTextField text_field_nume_rc;
    private JFXTextField text_field_prenume_rc;
    private JFXTextField text_field_email_rc;
    private JFXTextField text_field_tel_rc;
    private JFXTextField text_field_adresa_rc;

    public void addToList(){
        ArrayList<String> lista;

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {}
}
