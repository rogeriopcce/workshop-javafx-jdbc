package gui;

import java.net.URL;
import java.util.ResourceBundle;

import gui.alerta.Constraints;
import gui.alerta.alertas;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.entities.Department;

public class DepartmentFormController implements Initializable{


	private Department entity;
	
	@FXML
	private TextField txtId;
	
	@FXML
	private TextField txtName;
	
	@FXML
	private Label lblErrorName;
	
	@FXML
	private Button btnSalvar;
	
	@FXML
	private Button btnCancelar;
	
	public void setDepartment( Department entity) {
		this.entity = entity;
	}
	
	
	@FXML
	public void onbtSalvarAction() {
		alertas.showAlert("Concluido", null, "Clicou no botão Salvar", Alert.AlertType.INFORMATION);
	}
	
	@FXML
	public void onbtCancelarAction() {
		alertas.showAlert("Concluido", null, "Clicou no botão Cancelar", Alert.AlertType.INFORMATION);
	}	
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		initializeNodes();
	}

	private void initializeNodes() {
		Constraints.setTextFieldInteger(txtId);
		Constraints.setTextFieldMaxLength(txtName, 30);
	}
	
	public void updateFormdata() {
		if (entity == null) {
			throw new IllegalAccessError("Entidade é nula");
		}
		txtId.setText(String.valueOf(entity.getId()));
		txtName.setText(entity.getName());
	}
}
