public class Solution {
    public String replaceSpace(StringBuffer str) {
    	int startIndex;
    	while((startIndex = str.indexOf(" ")) >= 0){
        	str.replace(startIndex, startIndex + 1, "%20");
    	}
    	System.out.println(str);
        return str.toString();
    }
}
