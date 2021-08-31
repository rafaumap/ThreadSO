package controller;

public class ThreadController extends Thread {
	
	private int idThread;

	public ThreadController(int idThread) {
		this.idThread = idThread;
	}
	
	@Override
	public void run() {
		System.out.println(idThread);
	}
	
	
}
