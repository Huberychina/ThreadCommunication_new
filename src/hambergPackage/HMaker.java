package hambergPackage;

class HMaker extends Thread{
	public void make(){
		synchronized(Ham.basket){
			try{
				sleep(1000); //��������Ҫ��ʱ��
			}catch(InterruptedException e){
				
			}
			Ham.production++;
			System.out.println("һ���µĺ������Ѿ�������");
			//˼�������ʱ����Ҫȥ֪ͨ����һ���߳���
			//���ﲻ�ã�Ҫ��ѭ�����зţ��߼������
			Ham.basket.notify();  //����ע����£�����notify�����ͷ���������ط��������������������ж��������ٺ���
		}
		
	}
	public void run(){
		while(Ham.production<Ham.totalMaterial){
		make();
		
		}
		System.out.println("���������Ѿ�����");
	}
}
