public class Main {

    static ReverseStringArrays rsa = new ReverseStringArrays();

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);

        for (int i = 0; i < N; i++) {
            //Step 1 Split String
            String[] arrayOfWords = args[i + 1].toString().split(" ");
            rsa.reverse(arrayOfWords);

            //Step 3 Print to console reversed array
            String lineTag = String.format("Case #%s: ", i + 1);
            String strOutput = rsa.buildArrayWithTag(lineTag, arrayOfWords, arrayOfWords.length);
            System.out.println(strOutput);
        }
    }
}
