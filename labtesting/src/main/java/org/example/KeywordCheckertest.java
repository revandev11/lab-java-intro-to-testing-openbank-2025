package org.example;

import org.example.JavaKeywordChecker;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class KeywordCheckerTest {

    @Test
    void shouldDetectKeywordInSentence() {
        assertTrue(JavaKeywordChecker.containsJavaKeyword("Don't break my heart"));
        assertTrue(JavaKeywordChecker.containsJavaKeyword("class is important"));
    }

    @Test
    void shouldNotDetectKeywordInsideWord() {
        assertFalse(JavaKeywordChecker.containsJavaKeyword("I love to breakdance"));
        assertFalse(JavaKeywordChecker.containsJavaKeyword("breaker"));
    }

    @Test
    void shouldHandleNullAndEmpty() {
        assertFalse(JavaKeywordChecker.containsJavaKeyword(null));
        assertFalse(JavaKeywordChecker.containsJavaKeyword(""));
    }
}