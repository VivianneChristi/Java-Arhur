package Sistema;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[][] jogo;

		do {
			jogo = iniciarJogo();

			boolean vazio = true;
			boolean jogoTerminado = false;

			do {
				for (int idLinha = 1; idLinha < 4; idLinha++) {
					for (int idColuna = 1; idColuna < 4; idColuna++) {
						if (jogo[idLinha][idColuna] == null) {
							jogo[idLinha][idColuna] = "[_]";
							vazio = true;
						}
					}
				}

				exibirTabuleiro(jogo);

				System.out.println("Jogador, faça sua jogada (linha coluna marcação): ");
				int linhaJogada = scanner.nextInt();
				int colunaJogada = scanner.nextInt();
				String marcacao = scanner.next();

				if (linhaJogada >= 1 && linhaJogada <= 3 && colunaJogada >= 1 && colunaJogada <= 3) {
					jogo[linhaJogada][colunaJogada] = "[" + marcacao + "]";
				} else {
					System.out.println("Jogada inválida. Tente novamente.");
					continue;
				}

				jogoTerminado = verificarVencedor(jogo);

			} while (vazio == true && jogoTerminado == false);

			System.out.println("Jogo terminado!");

			System.out.println("Deseja reiniciar o jogo? (S/N)");
			String reiniciar = scanner.next();
			if (!reiniciar.equalsIgnoreCase("S")) {
				break;
			}
		} while (true);

		scanner.close();
	}

	public static String[][] iniciarJogo() {
		String[][] jogo = new String[4][4];
		jogo[0][0] = "*";

		for (int indexColuna = 1; indexColuna < 4; indexColuna++) {
			jogo[0][indexColuna] = "[" + indexColuna + "]";
		}

		for (int indexLinha = 1; indexLinha < 4; indexLinha++) {
			jogo[indexLinha][0] = "[" + indexLinha + "]";
		}

		return jogo;
	}

	public static void exibirTabuleiro(String[][] jogo) {
		for (int linha = 0; linha < jogo.length; linha++) {
			for (int coluna = 0; coluna < jogo[linha].length; coluna++)
				System.out.printf("%-4s", jogo[linha][coluna]);
			System.out.println();
		}
	}

	public static boolean verificarVencedor(String[][] jogo) {
		// Verificar linhas e colunas
		for (int i = 1; i < 4; i++) {
			if (jogo[i][1].equals(jogo[i][2]) && jogo[i][2].equals(jogo[i][3]) && !jogo[i][1].equals("[_]")) {
				System.out.println("Jogador " + jogo[i][1].charAt(1) + " venceu!");
				return true;
			}
			if (jogo[1][i].equals(jogo[2][i]) && jogo[2][i].equals(jogo[3][i]) && !jogo[1][i].equals("[_]")) {
				System.out.println("Jogador " + jogo[1][i].charAt(1) + " venceu!");
				return true;
			}
		}

		// Verificar diagonais
		if (jogo[1][1].equals(jogo[2][2]) && jogo[2][2].equals(jogo[3][3]) && !jogo[1][1].equals("[_]")) {
			System.out.println("Jogador " + jogo[1][1].charAt(1) + " venceu!");
			return true;
		}
		if (jogo[1][3].equals(jogo[2][2]) && jogo[2][2].equals(jogo[3][1]) && !jogo[1][3].equals("[_]")) {
			System.out.println("Jogador " + jogo[1][3].charAt(1) + " venceu!");
			return true;
		}

		// Verificar empate
		boolean empate = true;
		for (int linha = 1; linha < 4; linha++) {
			for (int coluna = 1; coluna < 4; coluna++) {
				if (jogo[linha][coluna].equals("[_]")) {
					empate = false;
					break;
				}
			}
		}
		if (empate) {
			System.out.println("Empate!");
			return true;
		}

		return false;
	}
}