//Lessions 5 is included as well.

class Main 
{
  public static void main(String[] args)
   {
    String words2[] = {"apple", "banana", "strawberry", "blueberries", "peach"};

    //For each loop.

    for (String fruit: words2)
    {
      System.out.println("Thing" + fruit);
    }

   /* for (String fruit: words2)
    {
      if (fruit.length()==5)
      {
        System.out.println(fruit);
      }
    }

     for (int i = 0; i < words2.length; i++)   //Prints the index value and the first and last letter of that string.
    {
      String first = words2[i].substring(0,1);
      String last = words2[i].substring(words2[i].length()-1, words2[i].length());
      System.out.println("Index value " + i + ": " + words2[i] + " " + first + " " + last);
    }
    
    System.out.println(); 

    int[] nums = {12, 65, 80, 70, 34, 22};
    int sum = 0;

    for (int c: nums)
    {
      sum += c;
    }
    System.out.printf("The average of the nums is: ");
    System.out.printf("'%.2f'%n", ((double)sum/nums.length))

   for (int i = nums.length-1; i > 3; i--)
    {
      nums[i] = nums[i -1];
    }
    nums[3] = 99;  
    for (int i = 0; i<nums.length; i++)
    {
      System.out.print(nums[i] + " ");
    }

    //Deleting items.

    for (int i = 2; i < nums.length-1; i++)
    {
      nums[i] = nums[i+1];    //Shifting all elements down.
    }

    System.out.println();
    System.out.println("shifting in arrays.");
    int[] nums2 = {1, 2, 3, 4};
    int temp = nums2[0];

    //Shift to the left.
    for (int i = 2; i < nums2.length-1; i++)
    {
      nums2[i] = nums2[i+1];    //Shifting all elements down.
    }

    nums[nums2.length-1]=temp;
    for (int i = 0; i<nums2.length; i++)  //Printing.
    {
      System.out.println(nums2[i] + " ");
    }
    System.out.println();


    //Shift to the right.
    int temp2 = nums2[nums2.length-1];

    for (int i = nums2.length-1; i > 0; i--)
    {
      nums2[i] = nums2[i-1];  
    }

    nums2[0] = temp2;

    for (int i = 0; i<nums2.length; i++)    //Printing.
    {
      System.out.println(nums2[i] + " ");
    }
    nums2[0] = temp2;



    //Reversing the elements uysing swap indide of a for loop. with the swap algorithm.
    for (int i = 0; i<nums2.length/2; i++)
    {
      int j = nums2.length-i-1; //A = B
      int temp3 = nums2[i];     //B = C
      nums2[i] = nums2[j];      //A = C
      nums2[j] = temp3;
    }
    for (int i = 0; i<nums2.length; i++)    //Printing.
    {
      System.out.println(nums2[i] + " ");
    } */
  }
}