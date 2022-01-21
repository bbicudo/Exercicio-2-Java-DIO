import java.util.Comparator;

public class CompareByYearThenName implements Comparator<LinguagemFavorita>{

	@Override
	public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
		
		int ano = l1.getAnoDeCriacao().compareTo(l2.getAnoDeCriacao());
		if(ano != 0) return ano;
		
		return l1.getNome().compareTo(l2.getNome());
	}
	
}
