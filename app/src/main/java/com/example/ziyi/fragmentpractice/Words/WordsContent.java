package com.example.ziyi.fragmentpractice.Words;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p/>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class WordsContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<WordsItem> ITEMS = new ArrayList<WordsItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, WordsItem> ITEM_MAP = new HashMap<String, WordsItem>();

    private static final int COUNT = 25;

    static {
        // Add some sample items.
        /*for (int i = 1; i <= COUNT; i++) {
            addItem(createWordsItem(i));
        }*/

        addItem(new WordsItem("1","apple","It is a very healthy fruit."));
        addItem(new WordsItem("2","tea","It is a very popular drink."));
        addItem(new WordsItem("3","rabbit","It is a very lovely animal."));
        addItem(new WordsItem("4","book","It is a good way to study."));
        addItem(new WordsItem("5","math","It is a kind of science."));
    }

    private static void addItem(WordsItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static WordsItem createWordsItem(int position) {
        return new WordsItem(String.valueOf(position), "Item " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class WordsItem {
        public final String id;
        public final String content;
        public final String details;

        public WordsItem(String id, String content, String details) {
            this.id = id;
            this.content = content;
            this.details = details;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
