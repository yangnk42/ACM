public class Solution {
    public boolean Find(int target, int [][] array) {
		boolean found = false;
        int rows = array.length;
        int colunms = array[0].length;
        int row = 0;
        int column = colunms - 1;
        
        while(row < rows&& column >= 0){
            if(array[row][column] == target){
                found = true;
                break;
            }else if(array[row][column] > target){
                column --;
            }else{
                row ++;
            }
        }
        return found;
    }
}
