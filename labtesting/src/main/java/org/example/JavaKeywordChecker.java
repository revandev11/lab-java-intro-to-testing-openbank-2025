package org.example;

import java.util.Set;
public class JavaKeywordChecker {
    private static final Set<String> KEYWORDS = Set.of(
            "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char",
            "class", "const", "continue", "default", "do", "double", "else", "enum",
            "extends", "final", "finally", "float", "for", "goto", "if", "implements",
            "import", "instanceof", "int", "interface", "long", "native", "new",
            "package", "private", "protected", "public", "return", "short", "static",
            "strictfp", "super", "switch", "synchronized", "this", "throw", "throws",
            "transient", "try", "var", "void", "volatile", "while"
    );
    public static boolean containsJavaKeyword(String text) {
        if (text == null || text.isBlank()) {
            return false;
        }
        String[] words = text.split("\\W+");
        for (String word : words) {
            if (KEYWORDS.contains(word)) {
                return true;
            }
        }return false;
    }}
