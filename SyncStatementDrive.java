class SyncStatementDrive extends Thread {

	String msg;
	static Object key = new Object();
	
	void setMsg(String msg) {
		this.msg = msg;
		
		start();
	}
	
	public void run() {
		synchronized (key) {
//		synchronized (SyncStatementDrive.class) {
			System.out.print("[" + msg);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("]");
		}
	}
	
	public static void main(String[] args) {
		SyncStatementDrive ssd1 = new SyncStatementDrive();
		SyncStatementDrive ssd2 = new SyncStatementDrive();
		SyncStatementDrive ssd3 = new SyncStatementDrive();
		
		ssd1.setMsg("ysrhee");
		ssd2.setMsg("Rhee, Yun-Seok");
		ssd3.setMsg("yunseok.rhee");
	}

}
