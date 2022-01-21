import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		@SuppressWarnings("serial")
		Set<LinguagemFavorita> linguasInsertion = new LinkedHashSet<>() {{
			add(new LinguagemFavorita("Java", 1990, "Eclipse"));
			add(new LinguagemFavorita("Php", 1890, "VSCode"));
			add(new LinguagemFavorita("Cobol", 710, "Pedra"));
		}};
		

		Set<LinguagemFavorita> linguasNome = new TreeSet<>(linguasInsertion);
		
		Set<LinguagemFavorita> linguasIde = new TreeSet<>(new CompareByIde());
		linguasIde.addAll(linguasInsertion);
		
		Set<LinguagemFavorita> linguasAnoENome = new TreeSet<>(new CompareByYearThenName());
		linguasAnoENome.addAll(linguasInsertion);
		
		Set<LinguagemFavorita> linguasNomeAnoIde = new TreeSet<>(new CompareByNameYearIde());
		linguasNomeAnoIde.addAll(linguasInsertion);
		
		System.out.println("Ordem de Inserção: ");
		System.out.println(linguasInsertion);
		System.out.println("============================================================= ");
		System.out.println("Ordem de Nome: ");
		System.out.println(linguasNome);
		System.out.println("============================================================= ");
		System.out.println("Ordem de Ide: ");
		System.out.println(linguasIde);
		System.out.println("============================================================= ");
		System.out.println("Ordem de Ano/Nome: ");
		System.out.println(linguasAnoENome);
		System.out.println("============================================================= ");
		System.out.println("Ordem de Nome/Ano/Ide: ");
		System.out.println(linguasNomeAnoIde);
		
	}

}
