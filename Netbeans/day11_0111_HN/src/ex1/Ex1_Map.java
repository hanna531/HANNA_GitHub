/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author HannaRoh
 */
public class Ex1_Map {
    //Map�� key, value�� �����ϴ� ����

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Map�� ������ �迭��
        String[] msg = {"AA","BB", "CC", "AA", "DD","EE","FF"};
        HashMap<Integer,String> map = new HashMap<>();
        int cnt = 0; //�迭�� ���� index��
        //�迭�� ������ŭ Map���� ����
        for(String e : msg){
            map.put(cnt+1, e);
            cnt++;
        }
        System.out.println("Map: "+map.size());
        //���!
        //Ű ���� ���� ��ü�� �ּҸ� ��ȯ�Ѵ�. ==> Set���� ����
        Set<Integer>keys = map.keySet();
        for(Integer e : keys){
            //map.put(k,v), map.get(key)
            System.out.println(map.get(e));
        }
        //�����
        //Map.Entry<Integer,String> : key�� value�� �޾ƿ��� ����
        //�������̽�, �ڷ��� => e key, value �����ϴ� ��ü �ּ�
        //entrySet(): key,value�� ������ �� Map.Entry<Integer,String>
        //�����ؼ� ��ȯ�Ѵ�.
        for(Map.Entry<Integer,String> e : map.entrySet()){
            System.out.println("Key: "+e.getKey());
            System.out.println("Value: "+e.getKey());
        }
                
        }
    
    }
