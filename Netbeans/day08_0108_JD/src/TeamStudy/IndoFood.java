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
public class IndoFood extends Food implements Inter{
    //  Food Ŭ������ ����Ͽ� ����� �ϴ� �޼��带 ������
    //  �������̽��� ����Ͽ� �߻�޼��带 ������
    //  ���ϴ� ������ �̸��� ����� ���� �������� ����
    @Override
    public String setfood() {
        
        //  1���� 3 ������ ���ڸ� �������� ����
        int random =(int) ((Math.random()*3)+1);
        String a = new String();
        //  ���� ������ ������ ���� a �� ����
            switch (random) {
            case 1:
                a = "ī��";
                break;

            case 2:
                a = "��";
                break;
                
            case 3:
                a = "ź���� ġŲ";
                break;
            }
        return a;
    }
    
    //  Food Ŭ�������� ������ �޼��� ������
    //  ���� �̸��� �������� �޼��� ���� ������ ���� �̸��� ���
    @Override
    public String sendprint(String name) {
        return printFood(name, "�ε��丮", setfood());
    }
    
}
