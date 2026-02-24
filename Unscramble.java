public class Unscramble {
    private String sentence;
    private String[] words;

    public Unscramble(String sentence) {
        this.sentence = sentence;
        this.words = sentence.split(" ");
    }

    public String unscrambleSentence() {
        String decrypted = "";

        for (int i = 0; i < words.length; i++) {
            decrypted += unscrambleWord(words[i]) + " ";
        }
        return decrypted.trim();
    }

    public String unscrambleWord(String word) {
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        return reversed;
    }

    public int getWordCount() {
        return words.length;
    }

    public void report() {
    }
}

