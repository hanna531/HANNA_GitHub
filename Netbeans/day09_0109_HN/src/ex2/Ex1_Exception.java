package ex2;

import java.util.Scanner;

public class Ex1_Exception {

    public static void main(String[] args) {
        System.out.println("���� �Է�");
        int num = 0;
        int res = 0;
        Scanner sc = new Scanner(System.in);
        try {
            num = Integer.parseInt(sc.nextLine()); //���� �߻�!
            res = 10 / num; //���� �߻�!
            System.out.println("Res: " + res); //���ܹ߻��� ������ �ȵ�!
            
//        } catch(NumberFormatException e){
//            System.out.println("���ڸ� �Է��ϼ���");
//        } catch(ArithmeticException e){
//            System.out.println("0���� ���� �� �����ϴ�.");
//        } catch(Exception e){ //�ֻ��� ��Ӱ��迡 �ִ�,,
//            //e���� ������ ó����ü�� �ּҰ�
//            System.out.println("������ ����");
//        }  

        } catch(Exception e){ 
            if (e instanceof NumberFormatException){
                System.out.println("���ڸ� �Է��ϼ���");
            }
            else if (e instanceof ArithmeticException );
             System.out.println("0���� ���� �� �����ϴ�.");
            }
        
//        } catch (NumberFormatException e) {
//            System.out.println("���ڸ� �Է��ϼ���");
//        } catch (ArithmeticException e) {
//            System.out.println("0���� ���� ���� �����ϴ�.");


//        } catch (NumberFormatException e | ArithmeticException e) {
//            System.out.println("���ڸ� �Է��ϼ���");
            
            
        System.out.println("���� ����! ������ ����");
    }
}
  