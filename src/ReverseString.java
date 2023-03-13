public class ReverseString {
    StringBuilder finalString= new StringBuilder();

    StringBuilder reverse(String str)
    {
        if ((str==null)||(str.length() <= 1)) {
            //System.out.println(str);
            finalString.append(str);

        } else
        {
            finalString.append(str.charAt(str.length()-1));
           // System.out.print(str.charAt(str.length()-1));
            reverse(str.substring(0,str.length()-1));
        }
        return finalString;
    }


    /* Driver program to test above function */
    public static void main(String[] args)
    {
        String str = "Amit kumar";
        ReverseString obj = new ReverseString();
        System.out.println(obj.reverse(str));
    }
}
