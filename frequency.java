public class frequency {
    public static void main(String[] args) {
        String s = "akshatraj";
        int freq[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                System.out.print((char)(i + 'a'));
                System.out.print(freq[i]);
            }
        }
    }
}