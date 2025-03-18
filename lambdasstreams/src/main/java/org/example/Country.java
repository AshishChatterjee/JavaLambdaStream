package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Country {

    public void OrderInt() {
        Integer[] scores = new Integer[]{80, 66, 73, 92, 43};
        Stream<Integer> scoreStream = Arrays.stream(scores);
        scoreStream.sorted().forEach(item -> System.out.println(item));
    }

    //
    public void ShopList() {
        List<String> shoppingList = new ArrayList<>();
        shoppingList.add("coffee");
        shoppingList.add("bread");
        shoppingList.add("pineapple");
        shoppingList.add("milk");
        shoppingList.add("pasta");
        shoppingList.add("cookie");
        shoppingList.add("chips");
        //Stream<String> shopListStream = shoppingList.stream();
        //shopListStream.sorted()
        List<String> sortedShoppingList = shoppingList.stream()
                .sorted()
                .map(lst -> lst.toUpperCase())
                .filter(lst -> lst.startsWith("P"))
                .collect(Collectors.toList());
        System.out.println(sortedShoppingList);

        System.out.println(shoppingList);
    }

    static List<String> applyFilters(List<String> words) {
        return words.stream()
                .filter(word -> word.length() > 5)
                .filter(word -> word.startsWith("G"))
                .collect(Collectors.toList());
    }

}
