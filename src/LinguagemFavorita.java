import java.util.Objects;

public class LinguagemFavorita implements Comparable<LinguagemFavorita>{

	private String nome;
	private Integer anoDeCriacao;
	private String ide;
	
	public LinguagemFavorita(String nome, Integer anoDeCriacao, String ide) {
		this.nome = nome;
		this.anoDeCriacao = anoDeCriacao;
		this.ide = ide;
	}

	public LinguagemFavorita() {
	}

	public String getNome() {
		return nome;
	}

	public Integer getAnoDeCriacao() {
		return anoDeCriacao;
	}

	public String getIde() {
		return ide;
	}

	@Override
	public String toString() {
		return "{" +
					"nome:'" + nome + '\'' +
					"anoDeCriacao:'" + anoDeCriacao + '\'' +
					"ide:'" + ide + '\'' +
				"}";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		
		if((obj == null) || (getClass() != obj.getClass())) return false;
		
		LinguagemFavorita lingua = (LinguagemFavorita) obj;
		return nome.equals(lingua.nome) && anoDeCriacao.equals(lingua.anoDeCriacao) && ide.equals(lingua.ide);
	}
	
	@Override
	public int compareTo(LinguagemFavorita linguagem) {
		
		return this.getNome().compareTo(linguagem.getNome());

	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nome, anoDeCriacao, ide);
	}
}
