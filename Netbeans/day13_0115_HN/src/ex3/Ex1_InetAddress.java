package ex3;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;

public class Ex1_InetAddress implements Ex1_InetAddressInter{ //�̱���
private InetAddress[] ar; //������ ������ �������� ���񽺸� ���� ���

    @Override
    public void searchDomain(String ns) throws UnknownHostException {
        ar = InetAddress.getAllByName(ns);
    }

    @Override
    public ArrayList<String> getDomainList() {
        ArrayList<String> list = new ArrayList<>();
        for(InetAddress e : ar){
            //InetAddress�� ����ؼ� ȣ��Ʈ�� �޾ƿ´�.
            list.add(e.getHostAddress());
        }
        return list;
    }

}
