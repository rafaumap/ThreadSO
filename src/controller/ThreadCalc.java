package controller;

public class ThreadCalc extends Thread {
	
	private int a, b, op;

	public ThreadCalc(int a, int b, int op) {
		this.a = a;
		this.b = b;
		this.op = op;
	}	
	
	@Override
	public void run() {
		calc();
	}
	
	private void calc() {
		int res = 0;
		int tempo = 1000;
		String operacao = "";
		
		try {
			sleep(op * tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		switch (op) {
			case 0:
				res = a + b;
				operacao = "+";
				break;
			case 1:
				res = a - b;
				operacao = "-";
				break;
			case 2:
				res = a * b;
				operacao = "*";
				break;
			case 3:
				res = a / b;
				operacao = "/";
		}
		
		System.out.println("TID #" + getId() + " ==> "  + a + " " + operacao + " " + b + " " + " = " + res);
	}

}