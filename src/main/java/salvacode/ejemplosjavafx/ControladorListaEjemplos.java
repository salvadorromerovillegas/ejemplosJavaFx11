package salvacode.ejemplosjavafx;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import salvacode.ejemplosjavafx.ejemplos.*;
import salvacode.ejemplosjavafx.ejemplos.Ejemplo10OrganizandoVistas.Ejemplo10OrganizandoVistas;
import salvacode.ejemplosjavafx.ejemplos.Ejemplo11AccediendoAPropiedades.Ejemplo11AccediendoAPropiedades;
import salvacode.ejemplosjavafx.ejemplos.Ejemplo12MiPrimerCSS.Ejemplo12MiPrimerCSS;
import salvacode.ejemplosjavafx.ejemplos.Ejemplo13CSSDesdeArchivo.Ejemplo13CSSDesdeArchivo;
import salvacode.ejemplosjavafx.ejemplos.Ejemplo14UsandoClasesCSS.Ejemplo14UsandoClasesCSS;
import salvacode.ejemplosjavafx.ejemplos.Ejemplo15LayoutTilePane.Ejemplos15Layout;
import salvacode.ejemplosjavafx.ejemplos.Ejemplo15LayoutTilePane.Ejemplos15LayoutTilePane;
import salvacode.ejemplosjavafx.ejemplos.Ejemplo16LayoutGridPane.Ejemplo16ALayoutGridPane;
import salvacode.ejemplosjavafx.ejemplos.Ejemplo16LayoutGridPane.Ejemplo16BLayoutGridPane;
import salvacode.ejemplosjavafx.ejemplos.Ejemplo17LabelTextButton.Ejemplo17LabelTextButton;
import salvacode.ejemplosjavafx.ejemplos.Ejemplo18FXML.Ejemplo18FXML;
import salvacode.ejemplosjavafx.ejemplos.Ejemplo19ComunicacionEntreScenes.Ejemplo19ComunicacionEntreScenes;

public class ControladorListaEjemplos {

    @FXML private VBox vbox11;
    
    @FXML
    private void execEjemplo1() {  
        Platform.runLater(() -> {
            try {
                new Ejemplo1ExtenderApplication().start(new Stage());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
        closeWindow();
    }
    
    @FXML
    private void execEjemplo2() {  
        Platform.runLater(() -> {
            try {
                new Ejemplo2MiPrimerScene().start(new Stage());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
        closeWindow();
    }
   
    @FXML
    private void execEjemplo3() {  
        Platform.runLater(() -> {
            try {
                new Ejemplo3AñadiendoHojas().start(new Stage());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
        closeWindow();
    }

    @FXML
    private void execEjemplo4() {  
        Platform.runLater(() -> {
            try {
                new Ejemplo4ContenedorDentroDeContenedor().start(new Stage());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
        closeWindow();
    }

    @FXML
    private void execEjemplo5() {  
        Platform.runLater(() -> {
            try {
                new Ejemplo5MiPrimerEvento().start(new Stage());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
        closeWindow();
    }
    
    @FXML
    private void execEjemplo6() {  
        Platform.runLater(() -> {
            try {
                new Ejemplo6EventHandlerEnComun().start(new Stage());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
        closeWindow();
    }

    @FXML
    private void execEjemplo7V1() {  
        Platform.runLater(() -> {
            try {
                new Ejemplo7EventHandlerComoLambdaV1().start(new Stage());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
        closeWindow();
    }
    
    @FXML
    private void execEjemplo7V2() {  
        Platform.runLater(() -> {
            try {
                new Ejemplo7EventHandlerComoLambdaV2().start(new Stage());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
        closeWindow();
    }

    @FXML
    private void execEjemplo8() {  
        Platform.runLater(() -> {
            try {
                new Ejemplo8EventHandlerEnUnContenedor().start(new Stage());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
        closeWindow();
    }

    @FXML
    private void execEjemplo9() {  
        Platform.runLater(() -> {
            try {
                new Ejemplo9DiscriminandoElTipoDeEvento().start(new Stage());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
        closeWindow();
    }

    @FXML
    private void execEjemplo10() {  
        Platform.runLater(() -> {
            try {
                new Ejemplo10OrganizandoVistas().start(new Stage());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
        closeWindow();
    }

    @FXML
    private void execEjemplo11() {  
        Platform.runLater(() -> {
            try {
                new Ejemplo11AccediendoAPropiedades().start(new Stage());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
        closeWindow();
    }

    @FXML
    private void execEjemplo12() {  
        Platform.runLater(() -> {
            try {
                new Ejemplo12MiPrimerCSS().start(new Stage());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
        closeWindow();
    }

    @FXML
    private void execEjemplo13() {  
        Platform.runLater(() -> {
            try {
                new Ejemplo13CSSDesdeArchivo().start(new Stage());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
        closeWindow();
    }

    @FXML
    private void execEjemplo14() {  
        Platform.runLater(() -> {
            try {
                new Ejemplo14UsandoClasesCSS().start(new Stage());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
        closeWindow();
    }

    @FXML
    private void execEjemplo15a() {  
        Platform.runLater(() -> {
            try {
                new Ejemplos15Layout().start(new Stage());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
        closeWindow();
    }

    @FXML
    private void execEjemplo15b() {  
        Platform.runLater(() -> {
            try {
                new Ejemplos15LayoutTilePane().start(new Stage());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
        closeWindow();
    }

    @FXML
    private void execEjemplo16A() {  
        Platform.runLater(() -> {
            try {
                new Ejemplo16ALayoutGridPane().start(new Stage());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
        closeWindow();
    }

    @FXML
    private void execEjemplo16B() {  
        Platform.runLater(() -> {
            try {
                new Ejemplo16BLayoutGridPane().start(new Stage());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
        closeWindow();
    }

    @FXML
    private void execEjemplo17() {  
        Platform.runLater(() -> {
            try {
                new Ejemplo17LabelTextButton().start(new Stage());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
        closeWindow();
    }
    
    @FXML
    private void execEjemplo18() {  
        Platform.runLater(() -> {
            try {
                new Ejemplo18FXML().start(new Stage());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
        closeWindow();
    }
    
    @FXML
    private void execEjemplo19() {  
        Platform.runLater(() -> {
            try {
                new Ejemplo19ComunicacionEntreScenes().start(new Stage());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
        closeWindow();
    }
    
    @FXML
    private void execEjemplo20() {  
        Platform.runLater(() -> {
            try {                
                (new salvacode.ejemplosjavafx.ejemplos.Ejemplo20ComunicacionEntreScenesFXML.Main()).start(new Stage());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
        closeWindow();
    }
    
    private void closeWindow()
    {            
        Stage stage = (Stage) vbox11.getScene().getWindow();
        stage.close();
    }
}
