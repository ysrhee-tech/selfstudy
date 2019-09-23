class SyncMethodDrive extends Thread {

	String msg;
	SyncMethodDrive key;
	
	void setMsg(SyncMethodDrive key, String msg) {
		this.key = key;
		this.msg = msg;
		
		start();
	}
	
	public void run() {
		key.print(msg);
	}
	
	synchronized void print(String msg) {
//	void print(String msg) {
		System.out.print("[" + msg);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("]");
	}
	
	public static void main(String[] args) {
		SyncMethodDrive smd1 = new SyncMethodDrive();
		SyncMethodDrive smd2 = new SyncMethodDrive();
		SyncMethodDrive smd3 = new SyncMethodDrive();
		
		SyncMethodDrive key = new SyncMethodDrive();
		smd1.setMsg(key, "ysrhee");
		smd2.setMsg(key, "Rhee, Yun-Seok");
		smd3.setMsg(key, "yunseok.rhee");
	}

}
