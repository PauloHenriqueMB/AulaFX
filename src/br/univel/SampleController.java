package br.univel;
/*Primeiro java FX*/
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class SampleController {
    @FXML
    private TextArea campo;

    @FXML
    private Button botao;

    @FXML
    void executar(ActionEvent event) {
     System.out.println(campo.getText());
    }
	
}
