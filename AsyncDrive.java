// Add Git test

class AsyncDrive extends Thread {

	String msg;
	
	void setMsg(String msg) {
		this.msg = msg;
		start();
	}
	
	public void run() {
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
		AsyncDrive ad1 = new AsyncDrive();
		AsyncDrive ad2 = new AsyncDrive();
		AsyncDrive ad3 = new AsyncDrive();
		
		ad1.setMsg("ysrhee");
		ad2.setMsg("Rhee, Yun-Seok");
		ad3.setMsg("yunseok.rhee");
	}

}
