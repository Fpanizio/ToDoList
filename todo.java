import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class todo {
    private static List<String> currentList = new ArrayList<String>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int menuItem = -1;
        while (menuItem != 0) {
            menuItem = menu();
            switch (menuItem) {
                case 1:
                    showList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    removeItem();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção invalida");
            }
        }
    }

    public static int menu() {
        System.out.println("\n\n---------");
        System.out.println("Menu Principal\n");
        System.out.println("0. Sair do programa\n1. Mostrar a lista de tarefas\n2. Adicionar um item a lista\n3. Remover um item da lista\n\nEscolha uma das opções:");
        int choice = scanner.nextInt();
        return choice;
    }

    public static void showList() {
        System.out.println("\n\nLista de tarefas");
        System.out.println("--------------");
        int number = 0;
        for (String item : currentList) {
            System.out.println(++number + " -> " + item);
        }
    }

    public static void addItem() {
        System.out.println("Adicionar um item:");
        System.out.print("Digite oque deseja adicionar na lista: ");
        Scanner scanner = new Scanner(System.in);
        String item = scanner.nextLine();
        currentList.add(item);
        showList();
    }

    public static void removeItem() {
        System.out.println("Remover Item\n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual item vc deseja remover?");
        int index = scanner.nextInt();
        if ((index - 1) < 0 || index > currentList.size()) {
            System.out.println("Esse item não existe, escolha um item entre 1 até " + currentList.size());
        } else {
            currentList.remove(index - 1);
        }
        System.out.println("----------------------");
        showList();
    }
}