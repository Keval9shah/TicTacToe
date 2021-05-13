
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class Controller implements Initializable {

    static int xoro = -1, c = -1, gover = 0;
    static char cf = 'n';
    static String p1 = "Motu", p2 = "Patlu";

    @FXML
    private ImageView ochoice;

    @FXML
    private Button yes, frst_y, frst_n, no, go;

    @FXML
    private AnchorPane frst, rootPane;

    @FXML
    private TextField np1, np2;

    @FXML
    private Text player;

    public Controller() {
    }

    @FXML
    void handleButtonAction(ActionEvent event) {
        if (event.getSource() == yes) {
            yes.setDisable(true);
            no.setDisable(true);
            frst.setVisible(true);
            np1.setVisible(true);
            np1.setPromptText("Name of the Player");
            np1.setLayoutX(82);
            np1.setLayoutY(262);
            c = 1;
        } else if (event.getSource() == no) {
            yes.setDisable(true);
            no.setDisable(true);
            np1.setVisible(true);
            np2.setVisible(true);
            np1.setLayoutY(169);
            np1.setLayoutX(82);
            np2.setLayoutX(82);
            np2.setLayoutY(232);
            c = 0;
        }
    }

    @FXML
    void BA2(ActionEvent ev) throws IOException {
        if (ev.getSource() == frst_y) {
            frst_n.setDisable(true);
            frst_y.setDisable(true);
            cf = 'y';
        } else if (ev.getSource() == frst_n) {
            frst_n.setDisable(true);
            frst_y.setDisable(true);
            cf = 'n';
        } else if (ev.getSource() == go) {
            p1 = np1.getText();
            if (c == 0) {
                p2 = np2.getText();
            } else if (c == 1) {
                if (cf == 'y') {
                    p1 = "Computer";
                    p2 = np1.getText();
                }
                if (cf == 'n') {
                    p2 = "Computer";
                }
            }
            AnchorPane pane = FXMLLoader.load(getClass().getResource("sampple.fxml"));
            rootPane.getChildren().setAll(pane);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    public void choice(javafx.scene.input.MouseEvent mouseEvent) {
        if (mouseEvent.getSource() == ochoice) {
            xoro = 0;
            if (cf == 'y') {
                xoro = 1;
            }
            player.setText("For " + np1.getText() + " O");
        } else {
            xoro = 1;
            if (cf == 'y') {
                xoro = 0;
            }
            player.setText("For " + np1.getText() + " X");
        }
        go.setDisable(false);

    }

    @FXML
    public void enter_text() {
        player.setText("For " + np1.getText());
    }

}
