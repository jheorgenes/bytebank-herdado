
public class EditorVideo extends Funcionario{
	
	public double getBonificacao() {
		System.out.println("Chamando o m�todo de bonifica��o do Editor de V�deo");
		return 150; //O super especifica que o m�todo foi herdado da classe m�e
	} 
}
