import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;


public class GroupBy {
    public static void main(String[] args) {

        List<String> listNames = Arrays.asList("Amir","Hatef","Mehran","Mojtaba","Mohammad","Ali","Davood","Reza", "Mohsen");
        Map<Integer, LinkedList<String>> mapNames = listNames
                .stream()
                .collect(groupingBy(String::length,
                        Collectors.toCollection(LinkedList::new)));

        System.out.println("part 1: " + mapNames + "\n\nPart 2: ");
        mapNames.forEach((key, value) -> System.out.println("key "+ key + "---->" + value.size()));
	}
}