
public class EditorVideo extends Funcionario{
	
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do Editor de Vídeo");
		return 150; //O super especifica que o método foi herdado da classe mãe
	} 
}
