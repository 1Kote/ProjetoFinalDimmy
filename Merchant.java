import java.util.Scanner;

public class Merchant {
    private Node rootNode;

    public Merchant() {
        // Construção da árvore de decisão do mercador.
        // As folhas (Node decision"X") são os nós finais da árvore de decisão.
        // Question sendo igual a null por não ter mais perguntas a serem feitas, reward sendo igual a null por ainda não ter uma
        // recompensa atribuída e não há a necessidade de yesNode ter nó filho porque não tem mais perguntas, por isso é null.
        Node decision1 = new Node(null, null, null, "Perde 1 moeda e ganha 1 de limiar na jóia.");
        Node decision2 = new Node(null, null, null, "Perde 1 moeda.");
        Node decision3 = new Node(null, null, null, "Pere 1 moeda e ganha 2 de limiar na jóia.");
        Node decision4 = new Node(null, null, null, "Ganha 2 moedas.");
        Node decision5 = new Node(null, null, null, "Perde 3 moedas e ganha 2 de limiar na jóia.");
        Node decision6 = new Node(null, null, null, "Perde 2 moedas.");
        Node decision7 = new Node(null, null, null, "Perde 1 moeda e ganha 3 de limiar na jóia.");
        Node decision8 = new Node(null, null, null, "Perde 3 moedas.");
        Node decision9 = new Node(null, null, null, "Você vem de um lugar distante e está indo para um destino secreto.");
        Node decision10 = new Node(null, null, null, "Eu não me importo de onde você vem ou para onde você vai, apenas quero saber se tem moedas para trocar!");

        // "innerDecision" é usado para representar um nó da árvore que contém uma pergunta e duas possíveis respostas.
        // Com a resposta dada pelo usuário para a pergunta do nó atual, o caminho correto será escolhido até atingir
        // um nó final com uma recompensa.
        Node innerDecision1 = new Node("Disctância é menor que 3?", decision1, decision2, null);
        Node innerDecision2 = new Node("Distância é maior ou igual a 3?", decision3, decision4, null);
        Node innerDecision3 = new Node("Deseja trocar suas moedas por limiar na jóia?", decision5, decision6, null);
        Node innerDecision4 = new Node("De onde você vem, e para onde você vai?", decision9, decision10, null);

        rootNode = new Node("Quantas moedas de transporte você tem?", innerDecision1, innerDecision2, null);

        innerDecision1.yesNode = innerDecision3;
        innerDecision1.noNode = innerDecision4;
        innerDecision2.yesNode = innerDecision3;
        innerDecision2.noNode = innerDecision4;
        innerDecision3.yesNode = decision7;
        innerDecision3.noNode = decision8;
        innerDecision4.yesNode = innerDecision4;
        innerDecision4.noNode = innerDecision4;
    }

    public String lerRespostaDoUsuario() {
        Scanner sc = new Scanner(System.in);
        String resposta = sc.nextLine();
        sc.close();
        return resposta;
    }

    public void playGame() {
        // Método para iniciar o nó atual sendo a raiz da árvore (rootNode). Depois há um loop usando while para continuar com as
        // perguntas da árvore até chegar em uma folha que tenha alguma recompensa.
        Node currentNode = rootNode;
        while (currentNode.reward == null) {
            if (currentNode.question == "De onde você vem, e para onde você vai?") {
                System.out.println(currentNode.question);
                System.out.println("Responda com uma frase pequena, por favor.");
                String answer = lerRespostaDoUsuario();
                // Avaliação do destino para retornar verdadeiro ou falso.
                currentNode = answer.contains("destino") ? currentNode.yesNode : currentNode.noNode; 
            } else {
                currentNode = currentNode.noNode;
            }
        }
        // Exibir a recompensa final
        System.out.println(currentNode.reward);
    }
}
