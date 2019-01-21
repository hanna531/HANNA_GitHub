package ex2_synchronized;

import java.util.ArrayList;

public class Car_MT { //thread

    private ArrayList<String> carList;

    public Car_MT() {
        carList = new ArrayList<>();

    }

    public String getCar() {
        String carName = "";
        int carNum = (int) (Math.random() * 3);
        //자동차를 제작해서 반환 해주는 구문!
        switch (carNum) {
            case 0:
                carName = "뉴그랜져1";
                break;
            case 1:
                carName = "뉴그랜져2";
                break;
            case 2:
                carName = "뉴그랜져3";
                break;
        }
        return carName;
    }

    public synchronized String pop(Thread t) {
        String carName = "";
        if(carList.size() == 0){
            System.out.println("생산된 자동차가 없습니다.");
            System.out.println("생산이 완료될 때까지 대기실에서");
            System.out.println("커피 한잔 하면서 기다리세요!");
            System.out.println("----------------------------");
            try {
                wait();
            } catch (InterruptedException ex) {
            }
        }
        carName = carList.remove(carList.size() -1);
        System.out.println("손님은 차를 구입 했습니다.");
        System.out.println("구입한 차의 정보::===> ");
        System.out.println(carName+":"+t.getName());
        return carName;
}
    public synchronized void push(String car, Thread t){
        carList.add(car);
        System.out.println("주문하신"+car+"자동차가 만들어 졌습니다.");
        System.out.println("Thread: "+t.getName());
        if(carList.size()==5){
            notify();
        }
    }
}


