package Sistema;

import java.util.ArrayList;
import java.util.Scanner;

import models.Vaga;

public class Sistema {

	public static void main(String[] args) {

		// instanciando o ArrayList

		ArrayList<String> palavras = new ArrayList<String>();

		// Adiciona mais valores palavras.add("Palavra"); palavras.add("Cantada");
		// palavras.add("O"); palavras.add("Sapo"); palavras.add("Não");
		// palavras.add("Lava"); palavras.add("OPé");

		// palavras.forEach(palavra -> {

		// if (palavra.equalsIgnoreCase("Cantada")) {
		// System.out.println("Estou cantando"); } else if
		// (palavra.equalsIgnoreCase("Lava")) { System.out.println("Porco"); }else {
		// System.out.println(palavra); }

		// });

		// boolean existe = palavras.contains("Palavra");

		// if (existe) { //buscar a posição da palavra/variavel int posicao =
		// palavras.indexOf("Sapo");

		// int posicao = 2;
		// get => trazer a variavel de acordo com a posição
		// System.out.println(palavras.get(posicao )); System.out.println(posicao); }
		// //Verificar se existe System.out.println(palavras.contains("Palavras"));

		// Verificar position System.out.println(palavras.indexOf("Cantada"));

		// Pega position index System.out.println(palavras.get(3));

		// muda pelo num do index palavras.set(2, "Ruan");

		// System.out.println(palavras.get(2));

		// CRUD

		Scanner sc = new Scanner(System.in);

		boolean opcao = true;
//
//		System.out.println("O que deseja fazer?");
//		int opcaoNum = sc.nextInt();
//
//		if (opcaoNum == 0) {
//			System.exit(0);
//			System.out.println("");
//		} else if (opcaoNum == 1) {
//			System.out.println("Cadastro Vaga");
//		} else if (opcaoNum == 2){
//			System.out.println("Se cadastrar na Vaga");
//		}

		ArrayList<Vaga> vagas = new ArrayList<Vaga>();

		do {
            int escolha;
            menu();
            escolha = sc.nextInt();
            sc.nextLine(); // Limpar o buffer

            switch (escolha) {
                case 1:
                    Vaga vagaAprendiz = new Vaga(0, null, null, null, null, 0);
                    System.out.println("Qual o salário?");
                    double Salario = sc.nextDouble();
                    sc.nextLine(); // Limpar o buffer
                    System.out.println("Qual o modelo de trabalho?");
                    String Modelo = sc.nextLine();
                    System.out.println("Qual os requisitos da vaga?");
                    String Requisitos = sc.nextLine();
                    System.out.println("Qual o horário de trabalho?");
                    String Horario = sc.nextLine();
                    System.out.println("Descreva a Vaga?");
                    String Descricao = sc.nextLine();
                    System.out.println("Quantas vagas você precisa?");
                    int QntCandidatos = sc.nextInt();
                    sc.nextLine(); // Limpar o buffer

                    vagaAprendiz.setSalario(Salario);
                    vagaAprendiz.setModelo(Modelo);
                    vagaAprendiz.setRequisitos(Requisitos);
                    vagaAprendiz.setDescricao(Descricao);
                    vagaAprendiz.setHorario(Horario);
                    vagaAprendiz.setCandidatos(QntCandidatos);
                    vagas.add(vagaAprendiz);
                    break;

                case 2:
                    vagas.forEach(vagas2 -> {
                        System.out.print("ID: ");
                        System.out.println(vagas.indexOf(vagas2));
                        System.out.println("");
                        System.out.println("Salário: ");
                        System.out.println(vagas2.getSalario());
                        System.out.println("Requisitos: ");
                        System.out.println(vagas2.getRequisitos());
                        System.out.println("Modelo: ");
                        System.out.println(vagas2.getModelo());
                        System.out.println("Quantidade de Vagas: ");
                        System.out.println(vagas2.getDescricao());
                        System.out.println("");
                    });
                    break;

                case 3:
                    System.out.println("Modificar Vagas");
                    System.out.println("Informe o ID da vaga que deseja modificar:");
                    int idModificar = sc.nextInt();
                    sc.nextLine(); // Limpar o buffer

                    if (idModificar >= 0 && idModificar < vagas.size()) {
                        Vaga vagaModificar = vagas.get(idModificar);
                        System.out.println("Qual campo deseja modificar?");
                        System.out.println("1 - Salário");
                        System.out.println("2 - Modelo de trabalho");
                        System.out.println("3 - Requisitos");
                        System.out.println("4 - Descrição");
                        System.out.println("5 - Horário de trabalho");
                        System.out.println("6 - Quantidade de candidatos");
                        int campoModificar = sc.nextInt();
                        sc.nextLine(); // Limpar o buffer

                        switch (campoModificar) {
                            case 1:
                                System.out.println("Informe o novo salário:");
                                double novoSalario = sc.nextDouble();
                                sc.nextLine(); // Limpar o buffer
                                vagaModificar.setSalario(novoSalario);
                                break;

                            case 2:
                                System.out.println("Informe o novo modelo de trabalho:");
                                String novoModelo = sc.nextLine();
                                vagaModificar.setModelo(novoModelo);
                                break;

                            case 3:
                                System.out.println("Informe os novos requisitos:");
                                String novosRequisitos = sc.nextLine();
                                vagaModificar.setRequisitos(novosRequisitos);
                                break;

                            case 4:
                                System.out.println("Informe a nova descrição:");
                                String novaDescricao = sc.nextLine();
                                vagaModificar.setDescricao(novaDescricao);
                                break;

                            case 5:
                                System.out.println("Informe o novo horário de trabalho:");
                                String novoHorario = sc.nextLine();
                                vagaModificar.setHorario(novoHorario);
                                break;

                            case 6:
                                System.out.println("Informe a nova quantidade de candidatos:");
                                int novaQuantidade = sc.nextInt();
                                sc.nextLine(); // Limpar o buffer
                                vagaModificar.setCandidatos(novaQuantidade);
                                break;

                            default:
                                System.out.println("Opção inválida!");
                                break;
                        }
                        System.out.println("Vaga modificada com sucesso!");
                    } else {
                        System.out.println("ID de vaga inválido!");
                    }
                    break;

                case 4:
                    System.out.println("Excluir Vaga");
                    System.out.println("Informe o ID da vaga que deseja excluir:");
                    int idExcluir = sc.nextInt();
                    sc.nextLine(); // Limpar o buffer

                    if (idExcluir >= 0 && idExcluir < vagas.size()) {
                        vagas.remove(idExcluir);
                        System.out.println("Vaga excluída com sucesso!");
                    } else {
                        System.out.println("ID de vaga inválido!");
                    }
                    break;

                case 9:
                    opcao = false;
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao);

        sc.close();
    }

    static public void menu() {
        System.out.println(" ");
        System.out.println("Bem Vindo ao Sistema - Gerenciamento de Vagas ");
        System.out.println(" ");
        System.out.println("------------------------------------");
        System.out.println("1 - Adicionar Vaga");
        System.out.println("2 - Listar Vagas");
        System.out.println("3 - Modificar Vagas");
        System.out.println("4 - Excluir Vaga");
        System.out.println("9 - Sair do Sistema");
        System.out.println("------------------------------------");
        System.out.println(" ");
    }
}