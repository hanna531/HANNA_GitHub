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
public class ServiceFood implements Serviceinter{
    //  �����̸��� 
    //  �������̽� �� �������� ���� ���� ����
    Inter in;
    
    //  ��ư�� ���� ���ڿ� ����� �̸��� ���������� �޾ƿͼ�
   @Override
    public String selectFood(int i, String name){
        //  ��ư���� ���� ���ϴ� Ŭ������ ����
        if (i == 1) {
            in = new KoreaFood();
        } else if (i == 2){
            in = new ChinaFood();
        } else if (i == 3){
            in = new IndoFood();
        }
        //  ������ Ŭ���� �� ���Ե� �޼��� ����
    return in.sendprint(name);
    } 
}
