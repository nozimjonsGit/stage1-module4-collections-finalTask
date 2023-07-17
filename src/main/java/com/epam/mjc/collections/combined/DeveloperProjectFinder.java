package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {

        List<String> developerProjects = new LinkedList<>();

        for (Map.Entry<String, Set<String>> entry : projects.entrySet()) {
            Set<String> developers = entry.getValue();

            if (developers.contains(developer)) {
                developerProjects.add(entry.getKey());
            }
        }

        developerProjects.sort(Comparator.comparingInt(String::length)
                .reversed()
                .thenComparing(Comparator.reverseOrder()));

        return developerProjects;

    }
}
