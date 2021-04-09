package Latihan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author khoirul
 */
public class TreeApp {

    public static void main(String[] args) throws IOException {
        int value;
        String data;
        Tree theTree = new Tree();
        theTree.insert(50, "Khoirul");
        theTree.insert(25, "Habibah");
        theTree.insert(75, "Purwati");
        theTree.insert(12, "Yuda");
        theTree.insert(37, "fajar");
        theTree.insert(43, "Riris");
        theTree.insert(30, "Safira");
        theTree.insert(33, "Risky");
        theTree.insert(87, "Nonik");
        theTree.insert(93, "Melly");
        theTree.insert(97, "Yanik");

        while (true) {
            System.out.print("Enter first letter of show, "
                    + "insert, find, delete, or traverse : ");
            int choice = getChar();
            switch (choice) {
                case 's':
                    theTree.displayTree();
                    break;
                case 'i':
                    System.out.print("Enter value and data to" + " insert :");
                    value = getInt();
                    data = getString();
                    theTree.insert(value, data);
                    break;
                case 'f':
                    System.out.print("Enter value find : ");
                    value = getInt();
                    Node found = theTree.find(value);
                    if (found != null) {
                        System.out.print("Found : ");
                        found.displayNode();
                        System.out.print("\n");
                    } else {
                        System.out.println("Could not find " + value);
                    }
                    break;
                case 'd':
                    System.out.print("Enter value delete : ");
                    value = getInt();
                    boolean didDelete = theTree.delete(value);
                    if (didDelete) {
                        System.out.print("Deleted : " + value);
                    } else {
                        System.out.println("Could not delete " + value);
                    }
                    break;
                case 't':
                    System.out.print("Enter type 1, 2 or 3 :");
                    value = getInt();
                    theTree.traverse(value);
                    break;
                default:
                    System.out.println("Invalid entry");
            }
        }
    }

    private static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }

    private static int getChar() throws IOException {
        String s = getString();
        return s.charAt(0);
    }

    private static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }
}
