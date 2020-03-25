package sample;
//93 I m forced to use if rather than else if
/**
 * Put
 */
public class Put {

    int put(int[] o, char f) {
        int x;
        if (f == 'n') {
            x = 2;
        } else {
            x = 1;
        }
        for (int i = 0; i < 9; i++) {
            // Win
            if (o[i] == x) {
                // Horizontal
                if (i + 1 < 9 && o[i + 1] == x) {
                    if (i + 2 < 9 && o[i + 2] == 0 && i % 3 == 0) {
                        System.out.println(1);
                                       return i + 3;
                    } else if (i - 1 >= 0 && o[i - 1] == 0 && i % 3 == 1) {
                        System.out.println(2);
                                       return i;
                    }
                } else if (i + 2 < 9 && o[i + 2] == x && o[i + 1] == 0 && i % 3 == 0) {
                    System.out.println(3);
                                       return i + 2;
                }
                // Vertical
                else if (i + 3 < 9 && o[i + 3] == x) {
                    if (i + 6 < 9 && o[i + 6] == 0) {
                        System.out.println(4);
                                       return i + 7;
                    } else if (i - 3 >= 0 && o[i - 3] == 0) {
                        System.out.println(5);
                                       return i - 2;
                    }
                } else if (i + 6 < 9 && o[i + 6] == x && o[i + 3] == 0) {
                    System.out.println(6);
                                       return i + 4;
                }
                // Cross
                else if (o[0] == x) {
                    if (o[4] == x && o[8] == 0) {
                        System.out.println(7);
                                       return 9;
                    } else if (o[8] == x && o[4] == 0) {
                        System.out.println(8);
                                       return 5;
                    }
                } else if (o[2] == x) {
                    if (o[4] == x && o[6] == 0) {
                        System.out.println(9);
                                       return 7;
                    } else if (o[6] == x && o[4] == 0) {
                        System.out.println(10);
                                       return 5;
                    }
                } else if (o[4] == x) {
                    if (o[6] == x && o[2] == 0) {
                        System.out.println(11);
                                       return 3;
                    } else if (o[8] == x && o[0] == 0) {
                        System.out.println(12);
                                       return 1;
                    }
                }
            }
        }
        for (int i = 0; i < 9; i++) {
            // Check Win
            if (o[i] == 3 - x) {
                if(i==1){
                    System.out.println(3-x);
                    System.out.println("o[i]  "+o[i]+"  o[i+3]  "+o[i+3]+"  o[i+6]  "+o[i+6]);
                }
                // Horizontal
                if (i + 1 < 9 && o[i + 1] == 3 - x) {
                    if (o[i + 2] == 0 && i % 3 == 0) {
                        System.out.println(13);
                                       return i + 3;
                    } else if (i - 1 >= 0 && o[i - 1] == 0 && i % 3 == 1) {
                        System.out.println(14);
                                       return i;
                    }
                } else if (i + 2 < 9 && o[i + 2] == 3 - x && o[i + 1] == 0 && i % 3 == 0) {
                    System.out.println(15);
                                       return i + 2;
                }
                // Vertical
                if (i + 3 < 9 && o[i + 3] == 3 - x) {
                    if (i + 6 < 9 && o[i + 6] == 0) {
                        System.out.println(16);
                                       return i + 7;
                    } else if (i - 3 >= 0 && o[i - 3] == 0) {
                        System.out.println(17);
                                       return i - 2;
                    }
                } else if (i + 6 < 9 && o[i + 6] == 3 - x && o[i + 3] == 0) {
                    System.out.println(18);
                                       return i + 4;
                }
                // Cross
                else if (o[0] == 3 - x) {
                    if (o[4] == 3 - x && o[8] == 0) {
                        System.out.println(19);
                                       return 9;
                    } else if (o[8] == 3 - x && o[4] == 0) {
                        System.out.println(20);
                                       return 5;
                    }
                } else if (o[2] == 3 - x) {
                    if (o[4] == 3 - x && o[6] == 0) {
                        System.out.println(21);
                                       return 7;
                    } else if (o[6] == 3 - x && o[4] == 0) {
                        System.out.println(22);
                                       return 5;
                    }
                } else if (o[4] == 3 - x) {
                    if (o[6] == 3 - x && o[2] == 0) {
                        System.out.println(23);
                                       return 3;
                    } else if (o[8] == 3 - x && o[0] == 0) {
                        System.out.println(24);
                                       return 1;
                    }
                }
            }
        }
        if (o[4] == 0) {
            System.out.println(25);
                                       return 5;
        } else if (o[0] == 3 - x && o[8] == 0) {
            System.out.println(26);
                                       return 9;
        } else if (o[2] == 3 - x && o[6] == 0) {
            System.out.println(27);
                                       return 7;
        } else if (o[6] == 3 - x && o[2] == 0) {
            System.out.println(28);
                                       return 3;
        } else if (o[8] == 3 - x && o[0] == 0) {
            System.out.println(29);
                                       return 1;
        } else {
            if (o[0] == 0) {
                System.out.println(30);
                                       return 1;
            } else if (o[2] == 0) {
                System.out.println(31);
                                       return 3;
            } else if (o[6] == 0) {
                System.out.println(32);
                                       return 7;
            } else if (o[8] == 0) {
                System.out.println(33);
                                       return 9;
            }
            for (int i = 0; i < 9; i++) {
                if (o[i] == 0) {
                    System.out.println(34);
                                       return i + 1;
                }
            }
        }
        System.out.println(35);
                                       return 9;
    }
}