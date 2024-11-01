/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.dsa;

/**
 *
 * @author AORUS
 */
public class Dsa {

    public static void main(String[] args) {
        PatternPractice pattern = new PatternPractice();
//        pattern.solidRectangle(4, 5);
//        pattern.hollowRectacngle(4, 5);
//        pattern.halfPyramid(4);
//        pattern.invertedHalfPyramid(4);
//        pattern.rotatedHalfPyramid(4);
//        pattern.halfPyramidNumber(4);
//        pattern.invertedHalfPyramidNumber(4);
//        pattern.floydTriangle(10);
//        pattern.zeroOneTriangle(5);
//        pattern.butterflyPattern(4);
//        pattern.solidRhombus(4);
//        pattern.numberPyramid(5);
//        pattern.palindromicPattern(5);
        pattern.diamondPattern(5);

    }
}

//source https://youtu.be/Dr4PpNa7AYo?si=GNNab4JM0Xluh1nJ
class PatternPractice {

    void solidRectangle(int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    void hollowRectacngle(int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == 0 || i == row - 1 || j == 0 || j == col - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    void halfPyramid(int row) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    void invertedHalfPyramid(int row) {
        for (int i = row; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    void rotatedHalfPyramid(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row; j++) {
                if (j <= row - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }

    void halfPyramidNumber(int row) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1);
            }
            System.out.println("");
        }
    }

    void invertedHalfPyramidNumber(int row) {
        for (int i = row; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + 1);
            }
            System.out.println("");
        }
    }

    void floydTriangle(int row) {
        int sum = 1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(sum++ + " ");
            }
            System.out.println("");
        }
    }

    void zeroOneTriangle(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) { //even
                    System.out.print("1");
                } else { //odd
                    System.out.print("0");
                }
            }
            System.out.println("");
        }
    }

    void butterflyPattern(int n) {
        for (int i = 1; i <= n; i++) {
//            first pyramid
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
//            space print
            int space = 2 * (n - i);
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
//            second pyramid
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = n; i >= 0; i--) {
//            first pyramid
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
//            space print
            int space = 2 * (n - i);
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
//            second pyramid
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    void solidRhombus(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    void numberPyramid(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
                System.out.print(i + 1);
            }
            System.out.println("");
        }
    }

    void palindromicPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
//            left side numbers
            for (int j = i; j >= 0; j--) {
                System.out.print(j + 1);
            }
//            right side numbers

            for (int j = 1; j <= i; j++) {
                System.out.print(j + 1);
            }
            System.out.println("");
        }
    }

    void diamondPattern(int n) {
//        top pyramid
        for (int i = 0; i < n; i++) {
//            space print
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
//            left side pyramid
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
//            right side pyramid
            for (int j = i; j >= 0; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
//        bottom pyramid
        for (int i = n; i >= 0; i--) {
//            space print
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
//            left side pyramid
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
//            right side pyramid
            for (int j = i; j >= 0; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
