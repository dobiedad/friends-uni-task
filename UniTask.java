import java.util.Arrays;

public class UniTask {

  public static void main(String[] args) {
    calculateFloatData("1.23,2.54,4.5")

    System.out.println(repeat("na", 3));


    int[] inputArray = new int[]{1,2,3};
    int[] expectedOutputArray = new int[]{3,2,1};

    if(!Arrays.equals(reverseArray(inputArray), expectedOutputArray)){
      throw new java.lang.RuntimeException("Array was not reversed correctly");
    }

    validatePassword("leoleoleoleoleoleoL123");
    generate10RandomNumbersAndListAllOdd();
    printDistinctElements(inputArray);
  }

  // assignment 4
  	public static void printSubStringsInString(String input){
  		// change string to array of characters
  		String[] arrayOfCharacters = new String[input.length()];

  		// for each character we want to get the index
  		for(int i = 1; i <input.length(); i++){
  			// then we get the value from the next index
  			for(int nextIndex = i + 1; nextIndex < input.length();nextIndex++){
  				// then we get the value from the next index
  				String subString = input.substring(i,nextIndex);
  				System.out.println(subString);
  			}
  		}
  	}

  	public static void calculateFloatData(String input){
  		int sum=0;
  		float minEntry = 0.00f;
  		float maxEntry = 0.00f;

  		// get the number of parts in string when its split by a comma
  		String[] parts = input.split(",");
  		// create an empty array of floats with a length of parts
  		float[] floats = new float[parts.length];

  		// go through each part in array of parts
  	 for (int i = 0; i < parts.length; ++i) {
  		 // convert each value into a float
  			 float number = Float.parseFloat(parts[i]);
  			 // add the float to empty float array we previously defined
  			 floats[i] = number;
  	 }

  	 // go through all floats and calculate stuff
  		for (int i=0;i<floats.length;i++){
  			sum +=  floats[i];
  			minEntry = floats[i] < minEntry || i == 0 ? floats[i] : minEntry;
  			maxEntry = floats[i] > maxEntry || i == 0 ? floats[i] : minEntry;
  		}

  		System.out.println("a) Total:     "+sum+" ");
  		System.out.println("b) Average:   "+(sum/floats.length)+" ");
  		System.out.println("c) Minimum:   "+minEntry+" ");
  		System.out.println("d) Maximum:   "+maxEntry+" ");
  		System.out.println("e) Range:     "+(maxEntry-minEntry)+" ");
  	}

  // assignment 5
  public static String repeat(String str, int times) {
    //str = na
    //times = 3
    // create a new string and pass in length of characters = times = 3
    // "/0/0/0"
    // then you replace each null with the originial str = na
    // "/0/0/0" = "nanana"
    return new String(new char[times]).replace("\0", str);
  }

  public static int countVowels(String input) {
    String str = input.toLowerCase() // convert string to lowercase letters so we only compare lowercase
    int vowels = 0; //initialize the amount of vowels
    int length = str.length(); //determining the length of the string
    int i = 0;
    for (i=0;i<length;i++) //the loop for counting the amount of vowels in the string
    {
      char letter = str.charAt(i); //converting each letter to a character and comparing it with a vowel
      if (letter == 'a' || letter == 'e' || letter == 'i' ||letter == 'o'|| letter == 'u')
      {
       vowels++; //if one of the vowels are in the string, add that up to the amount of vowels.
      }
    }
    return  vowels;
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
    //var arr = [1,2,3,4]
    for(int i = 0; i < arr.length / 2; i++)
    {
        int temp = arr[i]
        // arr[0] = 1;
        arr[i] = arr[arr.length - i - 1];
        // arr[0] = arr[arr.length = 3 - 0 - 1 ]
        // array[0] = 4
        arr[arr.length - i - 1] = temp;
        //arr[4] = temp = 1
        // arr = [4,2,3,1]
    }

    System.out.println(Arrays.toString(arr));

    return arr ;
  }

  public static int generate10RandomNumbersAndListAllOdd() {
    // initialize numbers with 10 elements which will be ints
    int[] numbers = new int[10];
    int sum = 0;
    for(int i = 0; i < numbers.length; i++) {
      // numbers[i] = int which is a random number from 0 - 100
      numbers[i] = (int)(Math.random()*100 + 1);
      sum += numbers[i];
      // if not ((index % 2 == 0 (no remainder) or numbers[i] % 2 == 0) == even index or even number in array) == odd
      if (!(i % 2 == 0) || !(numbers[i] % 2 == 0)) {
        System.out.println(numbers[i]);
      }
    }

    System.out.println(Arrays.toString(numbers));
    System.out.println(sum);

    return sum;
  }

  public static void printDuplicatesElements(int[] arr){
    String [] array = new String[]{"leo","mari","leo","tamro","tamro"};
    HashMap<String, Integer> duplicateCountsObject = new HashMap<String, Integer>();
    for(int i=0;array.length()>i;i++){
       duplicateCountsObject.put(array[i], 0);
    }
    for (int i=0;i<array.length();i++){
      duplicateCountsObject.put(array[i],duplicateCountsObject.get(array[i])++);
    }
    String [] arrayOfkeysFromObject = duplicateCountsObject.keySet().toArray();
    for (int i=0;i<arrayOfkeysFromObject;i++){
      String name = arrayOfKeysFromObject[i];
      System.out.println(name + "has" + duplicateCountsObject.get(name));
    }
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
