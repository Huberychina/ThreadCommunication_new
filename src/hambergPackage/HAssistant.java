package hambergPackage;

class HAssistant extends Thread{
	public void sell(){
		synchronized(Ham.basket){
			try{
				sleep(1000);
			}catch(InterruptedException e){}
			System.out.println("һ���µĺ������Ѿ�������");
			//˼�������ʱ����Ҫȥ֪ͨ����һ���߳���	
			Ham.sales++;
			if(Ham.sales==Ham.production){
				try {
					System.out.println("�������������ˣ����λ�Ե�");
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
