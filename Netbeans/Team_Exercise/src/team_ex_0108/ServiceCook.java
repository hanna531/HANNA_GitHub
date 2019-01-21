
package team_ex_0108;

/**
 *
 * @author HannaRoh
 */
public class ServiceCook implements ServiceInter{ // ServiceCookŬ������ ServiceInter�� ����
    
    public String service(int num,String name){ 
        //�޼ҵ�. num & name�� �޾Ƽ�, �޼���ȿ��� ���������ν� ����Ѵ�.
        // �߰�ȣ �ȿ��� ����� ������ ��� ��������
        // �ܺο��� ���� ������ ����, �޼ҵ�� �ڿ� �Ұ�ȣ ��밡��
        // ���� Ŭ���� �ȿ����� ����ʵ忡 �ִ� �������� ����� ��,
        // �Ұ�ȣ ���� ��� ����; �Ұ�ȣ�� �� ������
        
        String msg=""; // ���ڿ� msg ����, " "�� ����
        switch(num){ // if���� ���� ����; 10�� ���ο� �ִ� num�� ������ �ͼ�
            case 1: //case �ڿ� �ִ� ���� �� ��, ���� or NOT ����
                msg= new KoreaCook().order(); //new�� ����, ������! ��ü ����
                break; //����������
            case 2:
                msg= new ChinaCook().order();
                break;
            case 3:
                msg= new IndoCook().order();
                break;
            default: // num�� ���� ��޵� ���� �ƴ� ���
                msg= "����"; // ����msg�� "����" ���ڿ� ����
        }
        return name+"���� "+msg+"\n"; // 4���� ���ڿ��� 1���� ���ڿ��� ���ļ� ������
                                        // 1�� �̻��� ���ڿ��� + ���� �Ҷ���, ������� "���ڿ�"��
    }
    
    
}
