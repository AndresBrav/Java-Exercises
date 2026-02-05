package LeetCode.AddTwoNumbers;

class Solution {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        long numerolista1 = retornarNumeros(l1);
        long numerolista2 = retornarNumeros(l2);

        long sumaTotal = numerolista1 + numerolista2;

        System.out.println("numero 1 es " + numerolista1);
        System.out.println("numero 2 es " + numerolista2);
        System.out.println("la suma es  " + sumaTotal);

        return retornarList(sumaTotal);
    }

    public static void main(String[] args) {

        ListNode l1 = new ListNode(9);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(9);
        l2.next.next = new ListNode(9);
        l2.next.next.next = new ListNode(9);
        l2.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next.next.next.next.next = new ListNode(9);

        ListNode resultado = addTwoNumbers(l1, l2);

        System.out.print("Lista resultado: ");
        imprimirLista(resultado);
    }

    // Convierte lista a número (usando long)
    public static long retornarNumeros(ListNode aux) {
        int indice = 0;
        long numerolista = 0;

        while (aux != null) {
            numerolista += aux.val * (long) Math.pow(10, indice);
            indice++;
            aux = aux.next;
        }

        return numerolista;
    }

    // Convierte número a lista
    public static ListNode retornarList(long sumaTotal) {

        if (sumaTotal == 0) {
            return new ListNode(0);
        }

        ListNode head = new ListNode();
        ListNode current = head;

        while (sumaTotal != 0) {
            int numero = (int) (sumaTotal % 10);
            current.val = numero;
            sumaTotal /= 10;

            if (sumaTotal != 0) {
                current.next = new ListNode();
                current = current.next;
            }
        }

        return head;
    }

    // Imprimir lista
    public static void imprimirLista(ListNode nodo) {
        while (nodo != null) {
            System.out.print(nodo.val);
            if (nodo.next != null) {
                System.out.print(" -> ");
            }
            nodo = nodo.next;
        }
        System.out.println();
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
