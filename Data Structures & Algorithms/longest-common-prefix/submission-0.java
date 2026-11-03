class Solution {
    public String longestCommonPrefix(String[] strs) {
        // find smallest string
        int len = strs[0].length();
        String smallStr = strs[0];
        for(int i=0; i<strs.length ; i++){
            if(len>strs[i].length()){
                len = strs[i].length();
                smallStr = strs[i];
            }
        }

        if(smallStr == "")
            return "";

        String commonPrefix = "";
        for(int s=0; s<smallStr.length(); s++){
            for(int i=0; i<strs.length ; i++){
                String tmp = strs[i];
                System.out.print(smallStr);
                if(smallStr.charAt(s) != tmp.charAt(s))
                    return commonPrefix;
            }
            commonPrefix = commonPrefix + smallStr.charAt(s);
        }

        return commonPrefix;
        
    }
}