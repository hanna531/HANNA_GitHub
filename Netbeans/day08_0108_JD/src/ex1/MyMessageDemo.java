package ex1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KOSTA
 */
public class MyMessageDemo {
    public String makeMessage(String name) {
        StringBuffer sb = new StringBuffer();
        sb.append("�ȳ��ϼ���. ").append(name).append(" �� �ݰ�����! \n");
        return sb.toString();
    }
    
    public String makeMessage(String name, boolean gender) {
        StringBuffer sb = new StringBuffer();
        if (gender) {
            sb.append("�ȳ��ϼ���. ").append(name).append(" �� �ݰ�����! \n");
        } else {
            sb.append("�ȳ��ϼ���. ").append(name).append(" �� �ݰ�����! \n");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        MyMessageDemo mmd = new MyMessageDemo();
        String message = mmd.makeMessage("��浿");
        System.out.println(message);
    }
}
