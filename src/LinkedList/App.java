package LinkedList;

public class App {
    public static void main(String[] args) throws Exception {

        // Inicia lista vazia
        List list = new List();

        // Insere numeros no final da lista
        list.insertLast(list, 50);
        list.insertLast(list, 20);
        list.insertLast(list, 30);

        // Deve mostrar: 50, 20, 30
        list.display();

        // Insere numero no começo a lista
        list.insertFirst(list, 12);

        // Deve mostrar: 12, 50, 20, 30
        list.display();

        // Pega segundo nó da lista
        Node n2 = list.getHead().getNext();

        // Insere numero após nó da segunda lista
        list.insertAfter(n2, 400);

        // Deve mostrar: 12, 50, 400, 20, 30
        list.display();

        // Remove lista do primeiro nó
        list.removeFirst(list);

        // Deve mostrar: 50, 400, 20, 30
        list.display();

        // Remove lista do ultimo nó
        list.removeLast(list);

        // Deve mostrar: 50, 400, 20
        list.display();

        // Pega lista do terceiro nó
        Node nn3 = list.getHead().getNext().getNext();

        // Remove nó passado nos parametros junto da lista
        // Passado terceiro nó da lista como parametro (remove lista do terceiro nó)
        list.remove(list, nn3);

        // Deve mostrar: 50, 400
        list.display();
    }
}
