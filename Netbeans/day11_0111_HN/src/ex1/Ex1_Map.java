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
    //Map은 key, value로 저장하는 구조

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Map에 저장할 배열값
        String[] msg = {"AA","BB", "CC", "AA", "DD","EE","FF"};
        HashMap<Integer,String> map = new HashMap<>();
        int cnt = 0; //배열의 시작 index값
        //배열의 갯수만큼 Map에ㅐ 저장
        for(String e : msg){
            map.put(cnt+1, e);
            cnt++;
        }
        System.out.println("Map: "+map.size());
        //출력!
        //키 값을 가진 객체의 주소를 반환한다. ==> Set으로 추출
        Set<Integer>keys = map.keySet();
        for(Integer e : keys){
            //map.put(k,v), map.get(key)
            System.out.println(map.get(e));
        }
        //축약형
        //Map.Entry<Integer,String> : key와 value를 받아오기 위한
        //인터페이스, 자료형 => e key, value 저장하는 객체 주소
        //entrySet(): key,value를 추출한 후 Map.Entry<Integer,String>
        //저장해서 반환한다.
        for(Map.Entry<Integer,String> e : map.entrySet()){
            System.out.println("Key: "+e.getKey());
            System.out.println("Value: "+e.getKey());
        }
                
        }
    
    }
