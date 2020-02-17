import java.util.Arrays;

public class Main {
    public static void main(String [] args)
    {
        int N = Integer.parseInt(args[0]);

        for (int i = 0; i < N ; i++) {
            //Step 1 Split String
            String[] arrayOfWords = args[i+1].toString().split(" ");
            reverse(arrayOfWords);

            //Step 3 Print to console reversed array
            String lineTag = String.format("Case #%s: ", i+1);
            printArrayWithTag(lineTag, arrayOfWords, arrayOfWords.length);
        }
    }

    static void reverse(String strArray[])
    {
        //Step 2 Loop on words
        for(int i=0; i<strArray.length/2; i++){
            String temp = strArray[i];
            strArray[i] = strArray[strArray.length -i -1];
            strArray[strArray.length -i -1] = temp;
        }
    }

    static void printArrayWithTag(String tag, String strArray[], int size)
    {
        StringBuilder output = new StringBuilder();
        output.append(tag);
        for (int i=0; i < size; i++)
            output.append(strArray[i] + " ");
        System.out.println(output.toString());
    }
}
