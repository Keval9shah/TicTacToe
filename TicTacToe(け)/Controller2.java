package sample;

import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class Controller2 implements Initializable {

    int l = 1;
    static int[] occupied = new int[9];

    Controller xz = new Controller();
    int xoro = xz.xoro;
    int c = xz.c;
    int gover = xz.gover;
    String p1 = xz.p1;
    String p2 = xz.p2;
    char cf = xz.cf;

    @FXML
    private Button one,two,three,four,five,six,seven,eight,nine;

    @FXML
    private Text tf1, tf2;

    @FXML
    void GridPane(ActionEvent event) {
        Put cin = new Put();
        Button[] bs = new Button[]{one, two, three, four, five, six, seven, eight, nine};
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
        if(l==9){
            tf2.setText("Draw!!");
        }
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
        Put cin = new Put();
        Button[] bs = new Button[]{one, two, three, four, five, six, seven, eight, nine};
        if(c==1 && cf=='y'){
            bs[cin.put(occupied, cf) - 1].fire();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        Put cin = new Put();
        Button[] bs = new Button[]{one, two, three, four, five, six, seven, eight, nine};
        tf1.setText(p1+"  Vs  "+p2);
        if(c==1 && cf=='y'){
            bs[cin.put(occupied, cf) - 1].fire();
        }
    }
}
