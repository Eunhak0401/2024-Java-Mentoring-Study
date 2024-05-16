package week5;

import java.util.Scanner;

public class week5_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[100];
        int num = scanner.nextInt();
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
            }for(int i = 0; i < a.length; i++){
                if(a[i] > 35){
                    a[i] = scanner.nextInt();
                }
            }
        }
    }

