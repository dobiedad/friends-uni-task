import java.util.Arrays;

public class UniTask {

  public static void main(String[] args) {
    System.out.println(repeat("londontown", 5));
    int[] inputArray = new int[]{1,2,3};
    int[] expectedOutputArray = new int[]{3,2,1};

    if(!Arrays.equals(reverseArray(inputArray), expectedOutputArray)){
      throw new java.lang.RuntimeException("Array was not reversed correctly");
    }

    validatePassword("leoleoleoleoleoleoL123");
    generate10RandomNumbersAndListAllOdd();
    printDistinctElements(inputArray);
  }

  // assignment 5

  public static String repeat(String str, int times) {
    return new String(new char[times]).replace("\0", str);
  }

  public static int countVowels(String str) {
    return str.replaceAll("[^aeiouAEIOU]", "").length();
  }

  public static boolean validatePassword(String password) {
    boolean noUppercase = password.equals(password.toLowerCase());
    boolean noLowercase = password.equals(password.toUpperCase());
    int countOfDigitsInPassword = password.replaceAll("\\D", "").length();

    if (password.length() < 8 || noLowercase || noUppercase || countOfDigitsInPassword < 3) {
        System.out.println("password not valid");
        return false;
    } else {
      System.out.println("password valid");
        return true;
    }
  }

  // assignment 6
  public static int[] reverseArray(int[] arr) {
    for(int i = 0; i < arr.length / 2; i++)
    {
        int temp = arr[i];
        arr[i] = arr[arr.length - i - 1];
        arr[arr.length - i - 1] = temp;
    }

    System.out.println(Arrays.toString(arr));

    return arr ;
  }

  public static int generate10RandomNumbersAndListAllOdd() {
    int[] numbers = new int[10];
    //Generates 10 Random Numbers in the range 1 -100
    for(int i = 0; i < numbers.length; i++) {
      numbers[i] = (int)(Math.random()*100 + 1);
      if (!(i % 2 == 0) || !(numbers[i] % 2 == 0)) {
        System.out.println(numbers[i]);
      }
    }
    System.out.println(Arrays.toString(numbers));

    int sum = 0;
    for( int i : numbers) {
      sum += i;
    }
    System.out.println(sum);
    return sum;
  }

  public static void printDistinctElements(int[] arr){

       for(int i=0;i<arr.length;i++){
           boolean isDistinct = false;
           for(int j=0;j<i;j++){
               if(arr[i] == arr[j]){
                   isDistinct = true;
                   break;
               }
           }
           if(!isDistinct){
               System.out.print(arr[i]+" ");
           }
       }
   }
}
