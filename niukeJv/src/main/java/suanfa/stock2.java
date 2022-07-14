package suanfa;


import java.util.*;

class Main2 {
    public static void main(String[] args) {

        Stack st = new Stack();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        ArrayList<String> namelist = new ArrayList<String>();

        Scanner sc1 = new Scanner(System.in);

        for (int i = 0; i < num; i++) {
            String str = sc1.nextLine();

            if (str.contains("push") && !str.trim().equals("push")) {
                str = str.replace("push", "");
                st.push(str.trim());
            }
            if (str.trim().equals("pop")) {
                if (!st.empty()) {
                    Object p = st.pop();
                    namelist.add((String) p);
                } else {
                    namelist.add("error");
                }
            }
            if (str.trim().equals("top")) {
                if (!st.empty()) {
                    Object p = st.peek();
                    namelist.add((String) p);
                } else {
                    namelist.add("error");
                }
            }

        }
        for (int i = 0; i < namelist.size(); i++) {
            System.out.println(namelist.get(i));
        }

    }
}
