class Solution {
/**    public boolean isAnagram(String s, String t) {

 if(s.length()!=t.length())
            return false;

        int[] counter = new int[26];

        for(int i=0 ; i< s.length() ; i++){
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;

        }

        for(int count:counter){
            if(count!=0)
                return false;
        }

    return true;
    } **/

    // HashMap Solution
    public boolean isAnagram(String s, String t){
     
     HashMap<Character, Integer> map = new HashMap<>();
     HashMap<Character, Integer> mapOfT = new HashMap<>();

     if(s.length()!=t.length())
        return false;

     for(int i=0; i<s.length(); i++){
        if(map.containsKey(s.charAt(i)))
            map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
        else
            map.put(s.charAt(i), 1);

     }  

     for(int i=0; i<t.length(); i++){
        if(mapOfT.containsKey(t.charAt(i)))
            mapOfT.put(t.charAt(i), mapOfT.get(t.charAt(i)) + 1);
        else
            mapOfT.put(t.charAt(i), 1);

     }

     if(map.equals(mapOfT))
        return true;

    return false;






    }
}
