package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
	
	public static void main(String[] args) {
		Curso curso1 = new Curso();
		
		curso1.setTitulo("curso java");
		curso1.setDescricao("descricao curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		
		curso2.setTitulo("curso js");
		curso2.setDescricao("descricao curso js");
		curso2.setCargaHoraria(4);
			
		
		Mentoria mentoria = new Mentoria();
		
		mentoria.setTitulo("mentoria de java");
		mentoria.setDescricao("descricao mentoria java");
		mentoria.setData(LocalDate.now());
		
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devGuilherme = new Dev();
		
		devGuilherme.setNome("Guilherme");
		devGuilherme.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos de Guilherme: " + devGuilherme.getConteudosInscritos());
		
		devGuilherme.progredir();
		devGuilherme.progredir();
		
		System.out.println("-");
		System.out.println("Conteudos Concluidos de Guilherme: " + devGuilherme.getConteudosConcluidos());
		System.out.println("Conteudos Inscritos de Guilherme: " + devGuilherme.getConteudosInscritos());
		System.out.println("XP: " + devGuilherme.calcularTotalXp());
		
		
		System.out.println("-------------------------");
		
		Dev devCamilla = new Dev();
		devCamilla.setNome("Camilla");
		devCamilla.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos de Camilla: " + devCamilla.getConteudosInscritos());
		
		devCamilla.progredir();
		devCamilla.progredir();
		devCamilla.progredir();
		
		
		System.out.println("-");
		System.out.println("Conteudos Inscritos de Camilla: " + devCamilla.getConteudosInscritos());
		System.out.println("Conteudos Concluidos de Camilla: " + devGuilherme.getConteudosConcluidos());
		System.out.println("XP: " + devCamilla.calcularTotalXp());
	}
}
