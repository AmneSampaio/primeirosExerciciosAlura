package br.com.bytebank.teste;

import br.com.bytebank.modelo.ContaCorrente;
import br.com.bytebank.modelo.ContaPoupanca;
import br.com.bytebank.modelo.SaldoInsuficienteException;

public class TesteContas {
	
	public static void main(String[] args) throws SaldoInsuficienteException{
		
		ContaCorrente cc = new ContaCorrente(111, 222);
		cc.deposita(100.0);
	
		ContaPoupanca cp = new ContaPoupanca(333, 444);
		cp.deposita(100.0);
		
		cc.transfere(50.0, cp);
	
		System.out.println("CC:" + cc.getSaldo());
		System.out.println("CP:" + cp.getSaldo());
	}
	
	
}
