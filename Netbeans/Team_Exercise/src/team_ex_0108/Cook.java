
package team_ex_0108;

/**
 *
 * @author HannaRoh
 */
public class Cook {
  
    public String randomOrder(String foods[],String nation){ // �޼��� 
        int size=foods.length; // intŸ���� ������ foods.length�� return�� ���� ����
        int num=(int)(Math.random()*size); // int Ÿ���� ������ Math��� ��ü�ȿ� �ִ� random�޼��带 ȣ���� �Ŀ�, 
                                           // size ���� ���ؼ� ���� 
        return "�ֹ��Ͻ� "+nation+"�丮 : "+foods[num]; // ���ڿ� 4���� ��ģ ���� return �� 
                                                        // nation�� ���ڿ� & foods[num]= num��°�ִ� �ε����� ����� ���� ȣ��
    }
}
    
