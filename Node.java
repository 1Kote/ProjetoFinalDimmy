class Node {
    String question;
    String reward; 
    Node yesNode; // Nó representando a resposta "não"
    Node noNode; // Nó representando a resposta "sim"

    public Node (String question, String reward, Node yesNode, Node noNode) {
        this.question = question;
        this.reward = reward;
        this.yesNode = yesNode;
        this.noNode = noNode;
    }
}
