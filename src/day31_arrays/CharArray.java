package day31_arrays;

public class CharArray {


        /*char array with following values:
'j', 'a', 'v', 'a', ' ', 'i', 's', 'f', 'u', 'n'
  */


    public static void main(String[] args) {
        char[] letters = {'j', 'a', 'v', 'a' , ' ', 'i', 's', ' ', 'f', 'u', 'n'};
        for (char each : letters){
            System.out.print(each + " ");
        }

        String sentence = new String(letters);
        System.out.println("\nsentence = " + sentence);

        String item = "wooden spoon";
        char[] itemArray = item.toCharArray();
        System.out.println("itemArray.length = " + itemArray.length);
        System.out.println("item.length() = " + item.length());

        String[] fruits = {"bananas", "apples", "iwi", "mango", "papaya", "strawberry"};

        //for (int i = 0; i <fruits.length ; i++) {
           // System.out.print(fruits[i]+ "-");
      //  }
        String fruitStr = "";
        for(String each : fruits){
            System.out.print(each + "-");
            fruitStr += each + "-";
        }
        System.out.println("\nfruitStr = " + fruitStr);


        String[] languages = {"java", "python", "c++", "sql", "ruby", "javascript"};

        System.out.println(String.join("|",languages));
        System.out.println(String.join("##",languages));
        String joinedLanguages = String.join(" <> " , languages);
        System.out.println("joinedLanguages = " + joinedLanguages);

    }
}
