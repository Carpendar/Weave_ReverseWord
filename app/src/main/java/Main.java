public class Main {
    public static void main(String [] args)
    {
        StringBuilder reverseString = new StringBuilder();

        //Step 1 Split String
        String[] arrayOfWords = args[0].toString().split(" ");

        reverse(arrayOfWords);

        //Step 3 Print to console reversed array
        System.out.println(arrayOfWords.toString());

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
}
