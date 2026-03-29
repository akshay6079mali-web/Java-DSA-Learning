import java.util.Scanner;

class lcp {
    public String longestCommonPrefix(String[] strs) {
        
        String prefix = strs [0];

        for (int i = 1 ; i < strs.length ; i ++){
            
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring( 0, prefix.length() - 1);

                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }

    public void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of strings :");
        int n = sc.nextInt();
        System.out.println("Enter the strings :");
        String [] strs = new String [n];
        for (int i = 0; i < n; i++){
            strs[i] = sc.next();
        }

        System.out.print("The longest common prefix is : " + longestCommonPrefix(strs));
    }
}