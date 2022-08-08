import java.util.List;

public class ListagemUsuarios {
	public static void main(String[] args) {
		Usuario u1 = new Usuario();
		u1.setId(1);
		u1.setNome("Gabriel");
		u1.setPontuacao(10);
		u1.setModerador(false);
		
		Usuario u2 = new Usuario();
		u2.setId(2);
		u2.setNome("Breno");
		u2.setPontuacao(90);
		u2.setModerador(true);
		
		Usuario u3 = new Usuario();
		u3.setId(3);
		u3.setNome("Nicholas");
		u3.setPontuacao(1);
		u3.setModerador(false);
		
		Usuario u4 = new Usuario();
		u4.setId(4);
		u4.setNome("Anilmar");
		u4.setPontuacao(99);
		u4.setModerador(false);
		
		Usuario u5 = new Usuario();
		u5.setId(5);
		u5.setNome("Luis");
		u5.setPontuacao(15);
		u5.setModerador(false);
		
		List<Usuario> lista = List.of(u1, u2, u3, u4, u5);
		lista.forEach(e->{
			System.out.println("Nome: " + e.getNome());
			System.out.println("Pontuacao: " + e.getPontuacao());
			System.out.println("Moderador: " + e.isModerador());
			System.out.println("\n");
		});
	}
}
