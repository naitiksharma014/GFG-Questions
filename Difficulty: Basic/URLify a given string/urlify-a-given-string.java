class Solution {
    String URLify(String s) {
        int spaceCount = 0;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') spaceCount++;
        }

        int newLength = s.length() + 2 * spaceCount;
        char[] str = new char[newLength];

        int j = 0;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                str[j++] = '%';
                str[j++] = '2';
                str[j++] = '0';
            } else {
                str[j++] = s.charAt(i);
            }
        }

        return new String(str);
    }
}