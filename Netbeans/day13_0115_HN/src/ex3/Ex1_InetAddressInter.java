package ex3;

import java.net.UnknownHostException;
import java.util.ArrayList;

public interface Ex1_InetAddressInter {
    //1. �������� �޾Ƽ� ã�ƿ��� �޼���
    //2. �޾ƿ� �������� ���� �迭�� ��ȯ ���ִ� �޼���
    
    public void searchDomain(String ns) throws UnknownHostException;
    public ArrayList<String> getDomainList();
    
}
