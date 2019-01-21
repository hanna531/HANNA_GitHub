package ex2;

import java.util.Scanner;

public class Ex1_Exception {

    public static void main(String[] args) {
        System.out.println("수를 입력");
        int num = 0;
        int res = 0;
        Scanner sc = new Scanner(System.in);
        try {
            num = Integer.parseInt(sc.nextLine()); //예외 발생!
            res = 10 / num; //예외 발생!
            System.out.println("Res: " + res); //예외발생시 실행이 안됨!
            
//        } catch(NumberFormatException e){
//            System.out.println("숫자만 입력하세요");
//        } catch(ArithmeticException e){
//            System.out.println("0으로 나눌 수 없습니다.");
//        } catch(Exception e){ //최상위 상속관계에 있는,,
//            //e에는 예외의 처리객체의 주소값
//            System.out.println("나머지 예외");
//        }  

        } catch(Exception e){ 
            if (e instanceof NumberFormatException){
                System.out.println("숫자만 입력하세요");
            }
            else if (e instanceof ArithmeticException );
             System.out.println("0으로 나눌 수 없습니다.");
            }
        
//        } catch (NumberFormatException e) {
//            System.out.println("숫자만 입력하세요");
//        } catch (ArithmeticException e) {
//            System.out.println("0으로 나눌 수가 없습니다.");


//        } catch (NumberFormatException e | ArithmeticException e) {
//            System.out.println("숫자만 입력하세요");
            
            
        System.out.println("실행 종료! 마무리 영역");
    }
}
  