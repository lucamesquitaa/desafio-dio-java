import java.time.LocalDate;

import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso();
		curso1.setCargaHoraria(10);
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("descrição Java");
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setData(LocalDate.now());
		mentoria1.setTitulo("Mentoria Java");
		mentoria1.setDescricao("descrição mentoria java");
		
		
		Bootcamp bootcamp1 = new Bootcamp();
		bootcamp1.setTitulo("Bootcamp Java");
		bootcamp1.setDescricao("descriçao bootcamp java");
		bootcamp1.getConteudos().add(curso1);
		bootcamp1.getConteudos().add(mentoria1);
		
		Dev dev1 = new Dev();
		dev1.setNome("Luca");
		dev1.inscreverBootcamp(bootcamp1);
		System.out.println(dev1.getNome() + " inscrito em : " + dev1.getConteudosInscritos());
		dev1.progredir();
		System.out.println(dev1.getNome() + " Concluiu : " + dev1.getConteudosConcluidos());
		
		
	}

}
