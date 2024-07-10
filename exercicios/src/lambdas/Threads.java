package lambdas;

public class Threads {

	public static void main(String[] args) {

		
		Runnable tarefa1 = new Trabalho1();
		Runnable tarefa2 = new Runnable() {
			
			
			//Classe anônima (sem nome)
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					
					System.out.println("Tarefa #02");
					
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
				}
			}
		};
		
		Runnable tarefa3 = Threads::tarefa3;
		
		
		Thread t1 = new Thread(tarefa1);
		Thread t2 = new Thread(tarefa2);
		Thread t3 = new Thread(tarefa3);
		
		
		t1.start();
		t2.start();
		t3.start();
		

	}
	
	static void tarefa3() {
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println("Tarefa #02");
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
