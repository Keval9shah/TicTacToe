package sample;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class Controller implements Initializable {

    int l = 1;
    static int xoro = -1, c = -1, gover = 0;
    static char cf = 'n';
    static String p1 = "Motu", p2 = "Patlu";
    static int[] occupied = new int[9];

    @FXML
    private ImageView ochoice;

    @FXML
    private Button yes, frst_y, frst_n, no, go, one, two, three, four, five, six, seven, eight, nine;

    @FXML
    private AnchorPane frst, rootPane;

    @FXML
    private TextField np1, np2;

    @FXML
    private Text player, tf1, tf2;

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
                p2 = "Computer";
            }
            AnchorPane pane = FXMLLoader.load(getClass().getResource("sampple.fxml"));
            rootPane.getChildren().setAll(pane);
        }
    }

    @FXML
    void GridPane(ActionEvent event) {
        Put cin = new Put();
        Button[] bs = new Button[] { one, two, three, four, five, six, seven, eight, nine };
        Check win = new Check();
        Image x = new Image(getClass().getResourceAsStream("x.png"));
        ImageView xi = new ImageView(x);
        xi.setFitHeight(105);
        xi.setFitWidth(115);
        Image o = new Image(getClass().getResourceAsStream("o.png"));
        ImageView oi = new ImageView(o);
        oi.setFitHeight(105);
        oi.setFitWidth(115);
        if (gover == 0) {
            if (event.getSource() == one) {

                if (occupied[0] != 0) {

                } else {
                    if (l % 2 == 1) {
                        if (xoro == 1) {
                            one.setGraphic(xi);
                        } else {
                            one.setGraphic(oi);
                        }
                        occupied[0] = 1;
                        if (win.check(1, occupied)) {
                            tf2.setText(p1 + " WON!!");
                            gover = 1;
                        }
                        l++;
                        if (c == 1 && cf == 'n') {
                            bs[cin.put(occupied, cf) - 1].fire();
                        }
                    } else {
                        if (xoro == 1) {
                            one.setGraphic(oi);
                        } else {
                            one.setGraphic(xi);
                        }
                        occupied[0] = 2;
                        if (win.check(1, occupied)) {
                            tf2.setText(p2 + " WON!!");
                            gover = 1;
                        }
                        l++;
                        if (c == 1 && cf == 'y') {
                            bs[cin.put(occupied, cf) - 1].fire();
                        }
                    }
                }
            } else if (event.getSource() == two) {

                if (occupied[1] != 0) {

                } else {
                    if (l % 2 == 1) {
                        if (xoro == 1) {
                            two.setGraphic(xi);
                        } else {
                            two.setGraphic(oi);
                        }
                        occupied[1] = 1;
                        if (win.check(2, occupied)) {
                            tf2.setText(p1 + " WON!!");
                            gover = 1;
                        }
                        l++;
                        if (c == 1 && cf == 'n') {
                            bs[cin.put(occupied, cf) - 1].fire();
                        }
                    } else {
                        if (xoro == 1) {
                            two.setGraphic(oi);
                        } else {
                            two.setGraphic(xi);
                        }
                        occupied[1] = 2;
                        if (win.check(2, occupied)) {
                            tf2.setText(p2 + " WON!!");
                            gover = 1;
                        }
                        l++;
                        if (c == 1 && cf == 'y') {
                            bs[cin.put(occupied, cf) - 1].fire();
                        }
                    }
                }
            } else if (event.getSource() == three) {

                if (occupied[2] != 0) {

                } else {
                    if (l % 2 == 1) {
                        if (xoro == 1) {
                            three.setGraphic(xi);
                        } else {
                            three.setGraphic(oi);
                        }
                        occupied[2] = 1;
                        if (win.check(3, occupied)) {
                            tf2.setText(p1 + " WON!!");
                            gover = 1;
                        }
                        l++;
                        if (c == 1 && cf == 'n') {
                            bs[cin.put(occupied, cf) - 1].fire();
                        }
                    } else {
                        if (xoro == 1) {
                            three.setGraphic(oi);
                        } else {
                            three.setGraphic(xi);
                        }
                        occupied[2] = 2;
                        if (win.check(3, occupied)) {
                            tf2.setText(p2 + " WON!!");
                            gover = 1;
                        }
                        l++;
                        if (c == 1 && cf == 'y') {
                            bs[cin.put(occupied, cf) - 1].fire();
                        }
                    }
                }
            } else if (event.getSource() == four) {

                if (occupied[3] != 0) {

                } else {
                    if (l % 2 == 1) {
                        if (xoro == 1) {
                            four.setGraphic(xi);
                        } else {
                            four.setGraphic(oi);
                        }
                        occupied[3] = 1;
                        if (win.check(4, occupied)) {
                            tf2.setText(p1 + " WON!!");
                            gover = 1;
                        }
                        l++;
                        if (c == 1 && cf == 'n') {
                            bs[cin.put(occupied, cf) - 1].fire();
                        }
                    } else {
                        if (xoro == 1) {
                            four.setGraphic(oi);
                        } else {
                            four.setGraphic(xi);
                        }
                        occupied[3] = 2;
                        if (win.check(4, occupied)) {
                            tf2.setText(p2 + " WON!!");
                            gover = 1;
                        }
                        l++;
                        if (c == 1 && cf == 'y') {
                            bs[cin.put(occupied, cf) - 1].fire();
                        }
                    }
                }
            } else if (event.getSource() == five) {
                oi.setFitWidth(112);
                xi.setFitWidth(112);
                if (occupied[4] != 0) {

                } else {
                    if (l % 2 == 1) {
                        if (xoro == 1) {
                            five.setGraphic(xi);
                        } else {
                            five.setGraphic(oi);
                        }
                        occupied[4] = 1;
                        if (win.check(5, occupied)) {
                            tf2.setText(p1 + " WON!!");
                            gover = 1;
                        }
                        l++;
                        if (c == 1 && cf == 'n') {
                            bs[cin.put(occupied, cf) - 1].fire();
                        }
                    } else {
                        if (xoro == 1) {
                            five.setGraphic(oi);
                        } else {
                            five.setGraphic(xi);
                        }
                        occupied[4] = 2;
                        if (win.check(5, occupied)) {
                            tf2.setText(p2 + " WON!!");
                            gover = 1;
                        }
                        l++;
                        if (c == 1 && cf == 'y') {
                            bs[cin.put(occupied, cf) - 1].fire();
                        }
                    }
                }
            } else if (event.getSource() == six) {

                if (occupied[5] != 0) {

                } else {
                    if (l % 2 == 1) {
                        if (xoro == 1) {
                            six.setGraphic(xi);
                        } else {
                            six.setGraphic(oi);
                        }
                        occupied[5] = 1;
                        if (win.check(6, occupied)) {
                            tf2.setText(p1 + " WON!!");
                            gover = 1;
                        }
                        l++;
                        if (c == 1 && cf == 'n') {
                            bs[cin.put(occupied, cf) - 1].fire();
                        }
                    } else {
                        if (xoro == 1) {
                            six.setGraphic(oi);
                        } else {
                            six.setGraphic(xi);
                        }
                        occupied[5] = 2;
                        if (win.check(6, occupied)) {
                            tf2.setText(p2 + " WON!!");
                            gover = 1;
                        }
                        l++;
                        if (c == 1 && cf == 'y') {
                            bs[cin.put(occupied, cf) - 1].fire();
                        }
                    }
                }
            } else if (event.getSource() == seven) {

                if (occupied[6] != 0) {

                } else {
                    if (l % 2 == 1) {
                        if (xoro == 1) {
                            seven.setGraphic(xi);
                        } else {
                            seven.setGraphic(oi);
                        }
                        occupied[6] = 1;
                        if (win.check(7, occupied)) {
                            tf2.setText(p1 + " WON!!");
                            gover = 1;
                        }
                        l++;
                        if (c == 1 && cf == 'n') {
                            bs[cin.put(occupied, cf) - 1].fire();
                        }
                    } else {
                        if (xoro == 1) {
                            seven.setGraphic(oi);
                        } else {
                            seven.setGraphic(xi);
                        }
                        occupied[6] = 2;
                        if (win.check(7, occupied)) {
                            tf2.setText(p2 + " WON!!");
                            gover = 1;
                        }
                        l++;
                        if (c == 1 && cf == 'y') {
                            bs[cin.put(occupied, cf) - 1].fire();
                        }
                    }
                }
            } else if (event.getSource() == eight) {

                if (occupied[7] != 0) {

                } else {
                    if (l % 2 == 1) {
                        if (xoro == 1) {
                            eight.setGraphic(xi);
                        } else {
                            eight.setGraphic(oi);
                        }
                        occupied[7] = 1;
                        if (win.check(8, occupied)) {
                            tf2.setText(p1 + " WON!!");
                            gover = 1;
                        }
                        l++;
                        if (c == 1 && cf == 'n') {
                            bs[cin.put(occupied, cf) - 1].fire();
                        }
                    } else {
                        if (xoro == 1) {
                            eight.setGraphic(oi);
                        } else {
                            eight.setGraphic(xi);
                        }
                        occupied[7] = 2;
                        if (win.check(8, occupied)) {
                            tf2.setText(p2 + " WON!!");
                            gover = 1;
                        }
                        l++;
                        if (c == 1 && cf == 'y') {
                            bs[cin.put(occupied, cf) - 1].fire();
                        }
                    }
                }
            } else if (event.getSource() == nine) {

                if (occupied[8] != 0) {

                } else {
                    if (l % 2 == 1) {
                        if (xoro == 1) {
                            nine.setGraphic(xi);
                        } else {
                            nine.setGraphic(oi);
                        }
                        occupied[8] = 1;
                        if (win.check(9, occupied)) {
                            tf2.setText(p1 + " WON!!");
                            gover = 1;
                        }
                        l++;
                        if (c == 1 && cf == 'n') {
                            bs[cin.put(occupied, cf) - 1].fire();
                        }
                    } else {
                        if (xoro == 1) {
                            nine.setGraphic(oi);
                        } else {
                            nine.setGraphic(xi);
                        }
                        occupied[8] = 2;
                        if (win.check(9, occupied)) {
                            tf2.setText(p2 + " WON!!");
                            gover = 1;
                        }
                        l++;
                        if (c == 1 && cf == 'y') {
                            bs[cin.put(occupied, cf) - 1].fire();
                        }
                    }
                }
            }
        }
    }

    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    public void choice(javafx.scene.input.MouseEvent mouseEvent) {
        if (mouseEvent.getSource() == ochoice) {
            xoro = 0;
            player.setText("For " + np1.getText() + " O");
        } else {
            xoro = 1;
            player.setText("For " + np1.getText() + " X");
        }
        go.setDisable(false);

    }

    @FXML
    public void enter_text() {
        player.setText("For " + np1.getText());
    }

    @FXML
    void set0(){
        Arrays.fill(occupied,0);
        one.setGraphic(null);
        two.setGraphic(null);
        three.setGraphic(null);
        four.setGraphic(null);
        five.setGraphic(null);
        six.setGraphic(null);
        seven.setGraphic(null);
        eight.setGraphic(null);
        nine.setGraphic(null);
        l=1;
        gover=0;
        tf2.setText("Playing Again!!");
    }
}
