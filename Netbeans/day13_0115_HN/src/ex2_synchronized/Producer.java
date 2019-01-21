package ex2_synchronized;

public class Producer implements Runnable{
    private Car_MT car; //생성자
    public Producer(Car_MT car){this.car = car;}

    // 재정의!!
    @Override
    public void run() {
        String carName = "";
        for(int i=0; i<20; i++){
            carName = car.getCar();
            Thread t = Thread.currentThread();
            car.push(carName, t);
            try{
                Thread.sleep((int)(Math.random()*200));
            } catch (InterruptedException ex){
                ex.printStackTrace();
            }
        }
    }
    
    
}
