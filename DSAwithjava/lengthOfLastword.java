public class lengthOfLastword {
    
        public int lengthOfLastWord(String s) {
           int i = s.length()-1;
            while(i>=0 && s.charAt(i) == ' '){
                i--;
            }
            int j = i;
            int count = 0;
            while(j >= 0 && s.charAt(j) != ' '){
                count++;
                j--;
            }
            return count;
        }
    }   
