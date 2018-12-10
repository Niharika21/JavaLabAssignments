
/**
 * A class that has a method to recursively replaces characters in a String.
 * 
 * @author Charle's Hoot
 * @version 4.0
 */
public class RecursiveStringReplace
{

    /**
     * replace - Replace all instances of one character by another.
     * 
     * @param  s   The string to do the replacement on.
     * @param  from   The character to be replaced.
     * @param  to   the character to change to.
     * @return     A new string with the appropriate characters replaced.
     */
    public String replace(String s, char from, char to)
    {
        String result;
        if(s=="")
        	return null;

        // IMPLEMENT THIS RECURSIVE METHOD
        
        if(s.length()<1)    //if length of string is less than 1
	
        	return s;                     // then return string

        else
        {
        	char first;

        	if(from==s.charAt(0))       //if character exist in string then    
        		first=to;                //replace it with to character
        	else
        		first=s.charAt(0);          //else there is no change in string
	
        	return first+replace(s.substring(1),from,to);          //recursive call to replace function and adding previous string 

}
}
}
