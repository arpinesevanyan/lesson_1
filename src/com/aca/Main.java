package com.aca;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Num1,2
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 8; j++) {
//                System.out.print(" *");
//            }
//            System.out.println();
//        }
//    }
//}
//
//        Num1,2 alternative
//        System.out.print("Height: ");
//        int height =scanner.nextInt();
//        System.out.print("Width: ");
//        int width =scanner.nextInt();
//        for (int i = 0; i < height; i++) {
//            for (int j = 0; j < width; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//        Num3
//        System.out.print("Height: ");
//        int height = scanner.nextInt();
//        System.out.print("Width: ");
//        int width = scanner.nextInt();
//        for (int i = 0; i < height; i++) {
//            for (int j = 0; j < width; j++) {
//                if (i == 0 || j == 0 || i == height - 1 || j == width - 1) {
//                    System.out.print("* ");
//                } else if (j >= 1 && j < width - 1) {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}
//         Num 4
//        int m = 10;
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < m; j++) {
//                System.out.print(" *");
//            }
//            m--;
//            System.out.println();
//        }
//    }
//}
//        Num4 alternative
//        System.out.print("Lenght: ");
//        int lenght = scanner.nextInt();
//        String asterisk="* ";
//        for (int i = 0; i < lenght; i++) {
//            System.out.print(asterisk);
//            asterisk+="* ";
//            System.out.println();
//        }
//    }
//}
//
//        Num5
//        System.out.print("Lenght: ");
//        int lenght = scanner.nextInt();
//        int k = 0;
//        for (int i = 0; i < lenght; i++) {
//            for (int j = k; j < lenght; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//            k++;
//        }
//    }
//}
//
//        Num6
//        System.out.print("Lenght: ");
//        int lenght = scanner.nextInt();
//        int k = 0;
//        for (int i = 0; i < lenght; i++) {
//            for (int j = 0; j <= k; j++) {
//                if (j == 0 || i == lenght - 1 || i == j) {
//                    System.out.print("* ");
//                } else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//            k++;
//        }
//    }
//}
//
//        Num7
//        System.out.print("Lenght: ");
//        int lenght = scanner.nextInt();
//        if (lenght % 2 == 0) {
//            lenght++;
//        }
//        int s = 0;
//        int h = 1;
//        for (int i = 0; i < lenght; i++) {
//            for (int j = s; j < lenght / 2; j++) {
//                System.out.print("  ");
//            }
//            for (int l = 0; l < h; l++) {
//                System.out.print("* ");
//            }
//            if (i < lenght / 2) {
//                s++;
//                h += 2;
//            } else if (i >= lenght / 2) {
//                s--;
//                h -= 2;
//            }
//            System.out.println();
//        }
//    }
//}
//
//        Num8
//        System.out.print("Lenght: ");
//        int lenght = scanner.nextInt();
//        if (lenght % 2 == 0) {
//            lenght++;
//        }
//        int s = 0;
//        for (int i = 0; i < lenght; i++) {
//            for (int j = 0; j < lenght; j++) {
//                if (j == lenght / 2 - s) {
//                    System.out.print("* ");
//                } else if (j == lenght / 2 + s) {
//                    System.out.print("* ");
//                    break;
//                } else {
//                    System.out.print("  ");
//                }
//            }
//            if (i < lenght / 2) {
//                s++;
//            } else if (i >= lenght / 2) {
//                s--;
//            }
//            System.out.println();
//        }
//    }
//}
//
//        Num9
//        System.out.print("Height: ");
//        int i1 = scanner.nextInt();
//        System.out.print("Width: ");
//        int j1 = scanner.nextInt();
//        for (int i = 0; i <= 5*i1; i++) {
//            for (int j = 0; j <= 5*j1; j++) {
//                if(i%5==0 || j%5==0){
//                    System.out.print("* ");
//                }else{
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}