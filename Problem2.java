// 205 : Isomorphic String

public boolean isIsomorphic(String s, String t) {
        
        if(s.length() != t.length() )
        {
            return false;
        }
        
         char[] sMap = new char[100];
         char[] tMap = new char[100];

        for (int i = 0; i < s.length(); i++)
        {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            
            if(sMap[sChar - ' '] != 0)
            {
            if(sMap[sChar - ' '] != tChar)
            {
                return false;
            }
        }
            else {
                sMap[sChar - ' '] =  tChar;
            }
            if(tMap[tChar - ' '] != 0)
            {
                if(tMap[tChar - ' '] != sChar)
                {
                    return false;
                }
            }
            else 
            {
                tMap[tChar - ' '] = sChar;
            }
       }
        return true;
}   */ 

