package UserInterface;

import LinksFinder.LinksManager;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Patryk95 on 2016-09-27.
 */
public class SimpleInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj adres");
        String link = scanner.nextLine();
        LinksManager linksManager = new LinksManager(link);
        ArrayList links = linksManager.getArrayOfLinks();
        for(int i = 0; i<links.size(); i++)
            System.out.println(links.get(i));
    }

}
