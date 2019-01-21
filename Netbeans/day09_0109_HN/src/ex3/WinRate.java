/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

/**
 *
 * @author HannaRoh
 */
public class WinRate implements WinRateInter{
    public String wr(int win, int total){
        double winRate1 = (double)win/total; 
        double winRate = Math.round(winRate1*100)/100.0;
        return "´ç½ÅÀÇ ½Â·üÀº"+winRate+"%ÀÔ´Ï´Ù.+\n";
    }
}
