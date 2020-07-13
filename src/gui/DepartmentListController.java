package gui;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import gui.alerta.alertas;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.entities.Department;

public class DepartmentListController implements Initializable{

	@FXML
	private TableView<Department> tableViewDepartment;
	
	@FXML
	private TableColumn<Department, Integer> tableColumnId;

	@FXML
	private TableColumn<Department, String> tableColumnName;
	
	@FXML
	private Button btnNovo;
	
	public void btnNovo() {
		alertas.showAlert("Adicionou", null, "Registro adicionado com sucesso", Alert.AlertType.INFORMATION);
	}
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		InitializeNodes();		
	}
	
	private void InitializeNodes() {
		
		tableColumnId.setCellValueFactory(new PropertyValueFactory<>("id"));
		tableColumnName.setCellValueFactory(new PropertyValueFactory<>("name"));
		
		Stage stage = (Stage) Main.getMainScene().getWindow();
		
		tableViewDepartment.prefHeightProperty().bind(stage.heightProperty());
	}

}
