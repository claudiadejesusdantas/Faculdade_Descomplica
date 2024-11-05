// Atividade prática 13: Com base no exemplo anterior desenvolva um programa Java que escreva na tela: seu nome completo em String; seu curso em String; Sua idade em int; Seu gênero em char e Seu peso em double

class atividadePratica13
{
	public static void main (String args[]) {
	String name="Claudia de Jesus Dantas";
	String course = "Análise e desenvolvimento de sistemas";
	int age = 30;
	char gender = 'F';
	double weight = 110.5;
	
	System.out.println("Eu sou a " + name);
	System.out.println("Eu estudo "+ course);
	System.out.println("Minha idade é "+age);
	System.out.println("Meu gênero é "+gender);
	System.out.println("Meu peso é "+ weight);
	
	System.exit(0);
	}
}
