package suanfa;


import java.util.Stack;

public class Solution {
    /**
     * @param s string字符串
     * @return bool布尔型
     */
    public static boolean isValid(String s) {
        // write code here
        Stack<String> sk = new Stack();
        String str = s.replace(" ", "");

        int len = s.length();//字符串长度
        int j = 0;//走过的长度

        if(len%2!=0){
            return  false;
        }
        for (int i = 0; i < len; i++) {

            while (j < len && (sk.isEmpty() || !pipei(sk.peek(), s.substring(j, j + 1)))) {

                sk.push(s.substring(j, j + 1));
                j++;
            }

            if (!sk.isEmpty() &&j+1<=len&& pipei(sk.peek().trim(), s.substring(j, j + 1).trim())) {
                sk.pop();
                j++;
            } else if (!sk.isEmpty()) {
                System.out.println("false");
                return false;
            }
        }

        System.out.println("true");
        return true;
    }

    public static boolean pipei(String a, String b) {

        if ("(".equals(a) && ")".equals(b)) {
            return true;
        }


        if ("[".equals(a) && "]".equals(b)) {
            return true;
        }

        if ("{".equals(a) && "}".equals(b)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        isValid("()");
    }

}