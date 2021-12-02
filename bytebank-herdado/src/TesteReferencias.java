
public class TesteReferencias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario g1 = new Gerente();
		g1.setSalario(5000.0);		
		
		Funcionario e = new EditorVideo();
		e.setSalario(2500.0);
		
		Designer d = new Designer();
		e.setSalario(2500.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(e);
		controle.registra(d);
		
		System.out.println(controle.getSoma());
	}

}
