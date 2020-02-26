import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    @Test
    public void palindrome_1_mot_minuscules_pair_pal() {
        String s = "lool";
        assertEquals(1, Palindrome.numberOfPalindromWords(s));
    }

    @Test
    public void palindrome_1_mot_minuscules_impair_pal() {
        String s = "radar";
        assertEquals(1, Palindrome.numberOfPalindromWords(s));
    }

    @Test
    public void palindrome_1_mot_maj_pal() {
        String s = "Radar";
        assertEquals(1, Palindrome.numberOfPalindromWords(s));
    }

    @Test
    public void palindrome_2_mots_pal() {
        String s = "radar lol";
        assertEquals(2, Palindrome.numberOfPalindromWords(s));
    }

    @Test
    public void palindrome_1_mot_nonpal() {
        String s = "look";
        assertEquals(0, Palindrome.numberOfPalindromWords(s));
    }

    @Test
    public void palindrome_2_mots_nonpal() {
        String s = "coucou toi";
        assertEquals(0, Palindrome.numberOfPalindromWords(s));
    }

    //on ne prends pas en compte les virgules et les points etc
    @Test
    public void palindrome_phrase_1pal() {
        String s = "Coucou Lol.";
        assertEquals(1, Palindrome.numberOfPalindromWords(s));
    }

    @Test
    public void palindrome_nombre_dans_phrase() {
        String s = "Coucou 11";
        assertEquals(1, Palindrome.numberOfPalindromWords(s));
    }

    @Test
    public void palindrome_mot_1_lettre() {
        String s = "C";
        assertEquals(1, Palindrome.numberOfPalindromWords(s));
    }

    @Test
    public void palindrome_entree_null() {
        String s = null;
        assertEquals(0, Palindrome.numberOfPalindromWords(s));
    }

    @Test
    public void palindrome_entree_vide() {
        String s = "";
        assertEquals(0, Palindrome.numberOfPalindromWords(s));
    }

    @Test
    public void palindrome_entree_espace() {
        String s = " ";
        assertEquals(0, Palindrome.numberOfPalindromWords(s));
    }

    @Test
    public void palindrome_entree_unicode() {
        String s = " /// e // / ";
        assertEquals(4, Palindrome.numberOfPalindromWords(s));
    }


}
