package gui;

import java.net.URL;
import java.util.ResourceBundle;

import gui.alerta.alertas;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable {


	
	@FXML
	private MenuItem menuItemVendedor;
	
	@FXML
	private MenuItem menuItemDepartamento;
	

	@FXML
	private MenuItem menuItemAbout;
	
	@FXML
	public void onMenuItemVendedorAction() {
		alertas.showAlert("Menu Item Vendedor", null, "Meus Primeiros passos Java FX",Alert.AlertType.INFORMATION);
	}

	@FXML
	public void onMenuItemDepartamentoAction() {
		alertas.showAlert("Menu Item Departamento", null, "OI",Alert.AlertType.INFORMATION);
	}
	
	@FXML
	public void onMenuItemAbautAction() {
		alertas.showAlert("Menu Item About", null, "OI",Alert.AlertType.INFORMATION);
	}

	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO Auto-generated method stub
		
	}

}
