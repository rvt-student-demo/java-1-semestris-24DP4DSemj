package rvt;

import java.util.ArrayList;
import java.util.Scanner;

public class JMArayList {
public static void main(String[] args) {
listSize();
}
public static void onlyTheseNumbers() {
Scanner scanner = new Scanner(System.in);

int[] list = {72, 2, 8, 11, -1};
System.out.print("From where? ");
int first = Integer.valueOf(scanner.nextLine());
System.out.print("To where?: ");
int second = Integer.valueOf(scanner.nextLine());
for(int i = first; i <= second; i++){
System.out.println(list[i]);
}
}
public static void listSize() {
Scanner scanner = new Scanner(System.in);

ArrayList list = new ArrayList<>();

System.out.println("Max array size is 10 names.");

while (true){

if (list.size() >= 10) {
System.out.println("Maximum list size reached (10 names).");
break;
}

System.out.print("Ievadi vardu(ievadi exit to leave): ");
String name = scanner.nextLine();

if ("exit".equals(name.toLowerCase())){
break;
}

list.add(name);

}

System.out.print("In total: ");
System.out.println(list.size());

}
public static void OnTheList() {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> list = new ArrayList<>();

    while (true) {
        String input = scanner.nextLine();
        if (input.isEmpty()) {
            break;
        }
        list.add(input);
    }

    System.out.print("Search for? ");
    String searched = scanner.nextLine();

    if (list.contains(searched)) {
        System.out.println(searched + " was found!");
    } else {
        System.out.println(searched + " was not found!");
    }
}
public static void RemoveLast(ArrayList<String> strings) {
    if (strings.isEmpty()) {
            return;
    }
    int lastIndex = strings.size() - 1;
    strings.remove(lastIndex);
    }
}
