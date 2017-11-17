package hambergPackage;

class HAssistant extends Thread{
	public void sell(){
		synchronized(Ham.basket){
			try{
				sleep(1000);
			}catch(InterruptedException e){}
			System.out.println("一个新的汉堡包已经卖出了");
			//思考，这个时候需要去通知另外一个线程吗	
			Ham.sales++;
			if(Ham.sales==Ham.production){
				try {
					System.out.println("汉堡数量不够了，请各位稍等");
					Ham.basket.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					
				}
				
			}
			
			
		}
		}
	public void run(){
		
		while(Ham.sales<Ham.production)
		{sell();
		}
	}
}
