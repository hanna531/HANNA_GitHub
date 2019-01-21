
package team_ex_0108;

/**
 *
 * @author HannaRoh
 */

//public class IndoCook {
//
//    String order() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
public class IndoCook extends Cook implements OrderInter {
    
    String[] order={"»Ã±≈","∏∂∂Û≈¡","∆»∫∏√§"};
    String nation="¡ﬂ±π";
    
    public String order(){
       return randomOrder(order,nation);
    }
 }
