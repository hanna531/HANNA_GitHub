
package team_ex_0108;

/**
 *
 * @author HannaRoh
 */

//public class ChinaCook { 
//
//    String order() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
////Ŭ���� ����
//
//    String order(){
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

public class ChinaCook extends Cook implements OrderInter { //CookȮ��, OrderInter����
    
    String[] order={"�̱�","������","�Ⱥ�ä"}; //String �迭�� 3���� �����̸� ����
    String nation="�߱�"; // "�߱�" ���ڿ��� String ������ nation�� ����
    
    public String order(){ // �޼��� ����
       return randomOrder(order,nation); 
       // �޼��� Ү ���๮ --> randomOrder��� �޼��带 
       // ȣ���ؼ� return ���� ���� return����
    }
 }

