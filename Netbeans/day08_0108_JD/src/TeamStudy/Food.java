/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TeamStudy;

/**
 *
 * @author KOSTA
 */
public abstract class Food {
    //  ����� �̸�, ��û�� �丮�� ���� �̸�, �׸��� �丮 �̸��� ����ϴ� �޼���  
    
    public String printFood(String name, String country, String foodname){
        StringBuffer sb = new StringBuffer();
    //  �Է¹��� �̸�, �޼�������� ������ ������ ���ٿ� ����
        sb.append(name).append(" ���� �ֹ��Ͻ� ").append(country).append("\n").append(foodname).append(" �� ���Խ��ϴ�.");
    //  ������  ���� ���ڿ��� ��ȯ   
    return sb.toString();
    }

}
