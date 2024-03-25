package Sistema;

public class JogoDaVelha {

	   private char[][] tabuleiro;
	    private char jogadorAtual;

	    public JogoDaVelha() {
	        tabuleiro = new char[3][3];
	        setJogadorAtual('X'); // Começa com o jogador X
	        inicializarTabuleiro();
	    }

	    // Inicializa o tabuleiro com espaços em branco
	    private void inicializarTabuleiro() {
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                tabuleiro[i][j] = ' ';
	            }
	        }
	    }

	    // Exibe o tabuleiro atual
	    public void exibirTabuleiro() {
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                System.out.print(tabuleiro[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }

	    // Verifica se houve um vencedor
	    public boolean verificarVencedor() {
	        // Verifica linhas e colunas
	        for (int i = 0; i < 3; i++) {
	            if (tabuleiro[i][0] == tabuleiro[i][1] && tabuleiro[i][1] == tabuleiro[i][2] && tabuleiro[i][0] != ' ') {
	                return true;
	            }
	            if (tabuleiro[0][i] == tabuleiro[1][i] && tabuleiro[1][i] == tabuleiro[2][i] && tabuleiro[0][i] != ' ') {
	                return true;
	            }
	        }
	        // Verifica diagonais
	        if ((tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][2] && tabuleiro[0][0] != ' ')
	                || (tabuleiro[0][2] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][0] && tabuleiro[0][2] != ' ')) {
	            return true;
	        }
	        return false;
	    }

	    // Realiza uma jogada
	    public boolean fazerJogada(int linha, int coluna) {
	        if (linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3 && tabuleiro[linha][coluna] == ' ') {
	            tabuleiro[linha][coluna] = getJogadorAtual();
	            return true;
	        }
	        return false;
	    }

	    // Alterna o jogador atual
	    public void alternarJogador() {  	 	 		
	        setJogadorAtual((getJogadorAtual() == 'X') ? 'O' : 'X');
	    }

	    // Verifica se o tabuleiro está cheio (deu velha)
	    public boolean tabuleiroCheio() {
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                if (tabuleiro[i][j] == ' ') {
	                    return false;
	                }
	            }
	        }
	        return true;
	    }

		public char getJogadorAtual() {
			return jogadorAtual;
		}

		public void setJogadorAtual(char jogadorAtual) {
			this.jogadorAtual = jogadorAtual;
		}
	}
