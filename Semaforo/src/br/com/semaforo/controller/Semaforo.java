package br.com.semaforo.controller;

public class Semaforo extends Thread {

	private boolean vermelho, amarelo, verde;
	private boolean execucao = true;

	public void run() {

		try {

			while (execucao) {

				vermelho = true;
				System.out.println(vermelho ? "[PARE]" : "");
				vermelho = false;
				Thread.sleep(10000);

				verde = true;
				System.out.println(verde ? "[SIGA]" : "");
				verde = false;
				Thread.sleep(10000);

				amarelo = true;
				System.out.println(amarelo ? "[ATENÇÃO]" : "");
				amarelo = false;
				Thread.sleep(10000);
				
				System.out.println("_________\n");
			}

		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
}
