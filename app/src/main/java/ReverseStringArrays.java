import java.util.Arrays;

public class ReverseStringArrays {

    // time complexity of this algorithm is O(n/2) which is O(N) because we are iterating over array till midpoint only.
    public void reverse(String strArray[])
    {
        //
        for(int i=0; i<strArray.length/2; i++){
            String temp = strArray[i];
            strArray[i] = strArray[strArray.length -i -1];
            strArray[strArray.length -i -1] = temp;
        }
    }

    public String buildArrayWithTag(String tag, String strArray[], int size)
    {
        StringBuilder output = new StringBuilder();
        output.append(tag);
        for (int i=0; i < size; i++)
            output.append(strArray[i] + " ");
        return output.toString().trim();
    }
}
