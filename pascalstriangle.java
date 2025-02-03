import java.util.List;
import java.util.ArrayList;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle= new ArrayList<>();

for(int i=0; i<numRows; i++) { // Loop thru each row
    List<Integer> row = new ArrayList<>();
    row.add(1); // Add 1 for first element
        if(i>0) {
            List<Integer> previousRow = triangle.get(i-1); // Get previous row with i-1
        
         for (int j=1;j<i;j++) { // Loop thru the middle of row starting at element 1
            row.add(previousRow.get(j-1) + previousRow.get(j)); // Sum of previous row elements
         }
         row.add(1); // Add 1 for last element
        }

    triangle.add(row);
}
return triangle;
}

} 