
package team_ex_0108;

/**
 *
 * @author HannaRoh
 */

//public class KoreaCook {
//
//    String order() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    
//    }
//    
public class KoreaCook extends Cook implements OrderInter {
    
    String[] order={"µÈÀåÂî°³","±èÄ¡Âî°³","ÀâÃ¤"};
    String nation="ÇÑ±¹";
    
    public String order(){
       return randomOrder(order,nation);
    }
 }
