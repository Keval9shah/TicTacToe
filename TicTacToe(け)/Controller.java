package sample;

import java.io.IOException;
import java.net.URL;
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

    int l=1;
    static int xoro=-1,cf = -1;
    static String p1 = "", p2 = "Computer";
    int[] occupied = new int[9];

    @FXML
    private ImageView ochoice;

    @FXML
    private Button yes, frst_y, frst_n, no, go, one, two, three, four, five, six, seven, eight, nine;

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
        } else if (event.getSource() == no) {
            yes.setDisable(true);
            no.setDisable(true);
            np1.setVisible(true);
            np2.setVisible(true);
            np1.setLayoutY(169);
            np1.setLayoutX(82);
            np2.setLayoutX(82);
            np2.setLayoutY(232);
        }
    }

    @FXML
    void BA2(ActionEvent ev) throws IOException {
        if (ev.getSource() == frst_y) {
            frst_n.setDisable(true);
            frst_y.setDisable(true);
            cf = 1;
        } else if (ev.getSource() == frst_n) {
            frst_n.setDisable(true);
            frst_y.setDisable(true);
            cf = 0;
        } else if (ev.getSource() == go) {
            p1 = np1.getText();
            AnchorPane pane = FXMLLoader.load(getClass().getResource("sampple.fxml"));
            rootPane.getChildren().setAll(pane);
        }
    }

    @FXML
    void GridPane(ActionEvent event) {
        Image x = new Image(getClass().getResourceAsStream("x.png"));
        ImageView xi = new ImageView(x);
        xi.setFitHeight(105);
        xi.setFitWidth(115);
        Image o = new Image(getClass().getResourceAsStream("o.png"));
        ImageView oi = new ImageView(o);
        oi.setFitHeight(105);
        oi.setFitWidth(115);
        if (event.getSource() == one) {

            if (occupied[0] != 0) {

            } else {
                if (l % 2 == 1) {
                    System.out.println("l%2==1");
                    if (xoro == 1) {
                        System.out.println("l%2==1 & xoro==1");
                        one.setGraphic(xi);
                    } else {
                        System.out.println(xoro);
                        System.out.println("l%2==1 & xoro==0");
                        one.setGraphic(oi);
                    }
                    occupied[0] = 1;
                } else {
                    System.out.println("l%2==0");
                    if (xoro == 1) {
                        System.out.println("l%2==0 & xoro==1");
                        one.setGraphic(oi);
                    } else {
                        System.out.println("l%2==0 & xoro==0");
                        one.setGraphic(xi);
                    }
                    occupied[0] = 2;
                }
                l++;
            }
        }
        else if (event.getSource() == two) {

            if (occupied[1] != 0) {

            } else {
                if (l % 2 == 1) {
                    if (xoro == 1) {
                        two.setGraphic(xi);
                    } else {
                        two.setGraphic(oi);
                    }
                    occupied[1] = 1;
                } else {
                    if (xoro == 1) {
                        two.setGraphic(oi);
                    } else {
                        two.setGraphic(xi);
                    }
                    occupied[1] = 2;
                }
                l++;
            }
        }
        else if (event.getSource() == three) {

            if (occupied[2] != 0) {

            } else {
                if (l % 2 == 1) {
                    if (xoro == 1) {
                        three.setGraphic(xi);
                    } else {
                        three.setGraphic(oi);
                    }
                    occupied[2] = 1;
                } else {
                    if (xoro == 1) {
                        three.setGraphic(oi);
                    } else {
                        three.setGraphic(xi);
                    }
                    occupied[2] = 2;
                }
                l++;
            }
        }
        else if (event.getSource() == four) {

            if (occupied[3] != 0) {

            } else {
                if (l % 2 == 1) {
                    if (xoro == 1) {
                        four.setGraphic(xi);
                    } else {
                        four.setGraphic(oi);
                    }
                    occupied[3] = 1;
                } else {
                    if (xoro == 1) {
                        four.setGraphic(oi);
                    } else {
                        four.setGraphic(xi);
                    }
                    occupied[3] = 2;
                }
                l++;
            }
        }
        else if (event.getSource() == five) {
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
                } else {
                    if (xoro == 1) {
                        five.setGraphic(oi);
                    } else {
                        five.setGraphic(xi);
                    }
                    occupied[4] = 2;
                }
                l++;
            }
        }
        else if (event.getSource() == six) {

            if (occupied[5] != 0) {

            } else {
                if (l % 2 == 1) {
                    if (xoro == 1) {
                        six.setGraphic(xi);
                    } else {
                        six.setGraphic(oi);
                    }
                    occupied[5] = 1;
                } else {
                    if (xoro == 1) {
                        six.setGraphic(oi);
                    } else {
                        six.setGraphic(xi);
                    }
                    occupied[5] = 2;
                }
                l++;
            }
        }
        else if (event.getSource() == seven) {

            if (occupied[6] != 0) {

            } else {
                if (l % 2 == 1) {
                    if (xoro == 1) {
                        seven.setGraphic(xi);
                    } else {
                        seven.setGraphic(oi);
                    }
                    occupied[6] = 1;
                } else {
                    if (xoro == 1) {
                        seven.setGraphic(oi);
                    } else {
                        seven.setGraphic(xi);
                    }
                    occupied[6] = 2;
                }
                l++;
            }
        }
        else if (event.getSource() == eight) {

            if (occupied[7] != 0) {

            } else {
                if (l % 2 == 1) {
                    if (xoro == 1) {
                        eight.setGraphic(xi);
                    } else {
                        eight.setGraphic(oi);
                    }
                    occupied[7] = 1;
                } else {
                    if (xoro == 1) {
                        eight.setGraphic(oi);
                    } else {
                        eight.setGraphic(xi);
                    }
                    occupied[7] = 2;
                }
                l++;
            }
        }
        else if (event.getSource() == nine) {

            if (occupied[8] != 0) {

            } else {
                if (l % 2 == 1) {
                    if (xoro == 1) {
                        nine.setGraphic(xi);
                    } else {
                        nine.setGraphic(oi);
                    }
                    occupied[8] = 1;
                } else {
                    if (xoro == 1) {
                        nine.setGraphic(oi);
                    } else {
                        nine.setGraphic(xi);
                    }
                    occupied[8] = 2;
                }
                l++;
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
            System.out.println("xoro==0");
            player.setText("For " + np1.getText() + " O");
            System.out.println(p1);
        } else {
            xoro=1;
            System.out.println("xoro==1");
            System.out.println(xoro);
            player.setText("For " + np1.getText() + " X");
            System.out.println(p1);
        }
        go.setDisable(false);

    }

    @FXML
    public void enter_text() {
        player.setText("For " + np1.getText());
    }
}
