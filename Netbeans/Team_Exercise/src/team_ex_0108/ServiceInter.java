
package team_ex_0108;

/**
 *
 * @author HannaRoh
 */
public interface ServiceInter { // 상수, 추상메서드 (default메서드, static메서드)-jdk8버전 이상
    
    public String service(int num, String name); // ()있으면 메소드. {}가 없이 ;이 있으면 추상메서드
    // abstract라는 단어가 없어도, 인터페이스 내에선, 추상메서드임
}
