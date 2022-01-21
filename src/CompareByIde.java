import java.util.Comparator;

public class CompareByIde implements Comparator<LinguagemFavorita> {


	@Override
	public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
		int ide = l1.getIde().compareTo(l2.getIde());
		return ide;
		
	}
	
	
	
	
}

