/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import java.util.Scanner;

/**
 *
 * @author HannaRoh
 */
public class SetTest_LottoMain {
       

    public static void main(String[] args) {
        SetTest_LottoService ls = new SetTest_LottoService();
        System.out.print("�ݾ��� �Է����ּ���: ");
        Scanner sc = new Scanner(System.in);
        int i = Integer.parseInt(sc.nextLine());
        int num = i/1000;
        int rem = num%1000;

        ls.setLottoGameNum(num);
        System.out.print("�ܾ��� "+rem+"�� �Դϴ�.");
            
    }
}
