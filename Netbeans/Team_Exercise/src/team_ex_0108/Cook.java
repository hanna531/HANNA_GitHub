
package team_ex_0108;

/**
 *
 * @author HannaRoh
 */
public class Cook {
  
    public String randomOrder(String foods[],String nation){ // 메서드 
        int size=foods.length; // int타입인 변수에 foods.length의 return된 값을 저장
        int num=(int)(Math.random()*size); // int 타입인 변수에 Math라는 객체안에 있는 random메서드를 호출한 후에, 
                                           // size 값을 곱해서 저장 
        return "주문하신 "+nation+"요리 : "+foods[num]; // 문자열 4개를 합친 것을 return 함 
                                                        // nation도 문자열 & foods[num]= num번째있는 인덱스에 저장된 값을 호출
    }
}
    
