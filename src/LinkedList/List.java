package LinkedList;

public class List {

    private Node head;

    // Objeto com endereço do primeiro 
    public List() {
        head = null;
    }

    public Node getHead() {
        return head;
    }

    // Método vazia
    // Verifica se a lista está vazia ou não
    public boolean isEmpty(List list) {
        return list.head == null;
    }

    // Método inserePrimeiro
    // Insere um valor no inicio da lista
    public void insertFirst(List list, int info) {

        Node node = new Node(info);

        if (isEmpty(list)) {
            list.head = node;
        } else {
            Node old = list.head;
            list.head = node;
            list.head.setNext(old);
        }
    }

    // Método insereDepois
    // Insere um valor depois de um nó esperado
    public void insertAfter(Node previousNode, int info)
    {
        if (previousNode == null)
        {
            System.out.println("O nó anterior fornecido não pode ser nulo");
            return;
        }
        Node newNode = new Node(info);
        newNode.setNext(previousNode.getNext());
        previousNode.setNext(newNode);
    }

    // Método insereUltimo
    // Insere um valor no final da lista
    public void insertLast(List list, int info)
    {
        Node node = new Node(info);

        if (isEmpty(list)) {
            list.head = node;
        } else {
            Node last = list.head;
            while (last.getNext() != null) {
                last = last.getNext();
            }

            last.setNext(node);
        }
    }

    // Método removePrimeiro
    // Remove o primeiro nó da lista
    public void removeFirst(List list)
    {
        Node second = list.head.getNext();
        list.head.setNext(null);
        list.head = second;
    }

    // Método removeUltimo
    // Remove o último nó da lista
    public void removeLast(List list)
    {
        if (list.head == null || list.head.getNext() == null) {
            System.out.println("errr");
            return;
        }

        Node temp = list.head;
        while(temp.getNext().getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(null);
    }

    // Método remove
    // Remove qualquer nó da lista, deverá passar este nó como parâmetro na chamada do método
    public void remove(List list, Node nodeToBeDeleted)
    {
        Node node = list.head;
        while (node.getNext() != null) {
            Node prev = node;
            Node next = node.getNext().getNext();

            node = node.getNext();

            if (node == nodeToBeDeleted) {
                prev.setNext(next);
            }
        }
    }

    // Método mostrar
    // Mostra no console todos os itens da lista
    public void display() {
        Node node = head;
        while (node != null) {
            System.out.print(node.getData());
            if (node.getNext() != null) {
                System.out.print(", ");
            }
            node = node.getNext();
        }
        System.out.println("");
    }
}
