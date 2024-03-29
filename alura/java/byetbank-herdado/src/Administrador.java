
public class Administrador extends Funcionario implements Autenticavel{
		
	private MetodoLogin login;
	
	public Administrador() {
		this.login = new MetodoLogin();
	}
	public void setSenha(int senha) {
		this.login.setSenha(senha);
		
	}

	public boolean autentica(int senha) {
		return this.login.autentica(senha);
	}
	
	@Override
	public double getBonificacao() {
		return 50;
	}

}
