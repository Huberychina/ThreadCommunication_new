package hambergPackage;

class HMaker extends Thread{
	public void make(){
		synchronized(Ham.basket){
			try{
				sleep(1000); //做汉堡需要的时间
			}catch(InterruptedException e){
				
			}
			Ham.production++;
			System.out.println("一个新的汉堡包已经做好了");
			//思考，这个时候需要去通知另外一个线程吗
			//这里不用，要在循环体中放，逻辑更清楚
			Ham.basket.notify();  //这里注意个事，就是notify并不释放锁，这个地方还是制做汉堡，篮子有多大就做多少汉堡
		}
		
	}
	public void run(){
		while(Ham.production<Ham.totalMaterial){
		make();
		
		}
		System.out.println("汉堡篮子已经满了");
	}
}
