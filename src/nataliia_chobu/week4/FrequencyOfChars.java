package nataliia_chobu.week4;

public class FrequencyOfChars {
    public static void main(String[] args) {
        System.out.println(frequencyOfChar("aabbcc"));
    }
    public static String frequencyOfChar(String str){
        String result="";

        for(int i=0;i <str.length();i++) {
            char ch=str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }
            if (!result.contains("" + ch)) {
                result += ""+ ch+ count;
            }
//            if (result.contains("" + ch)) {
//                continue;
//            }
//            result += "" + ch + count;

        }
        return result;

    }
}
