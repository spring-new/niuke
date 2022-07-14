package suanfa;

import java.util.*;
import java.util.Stack;
public class Main {
    public static void main(String[] args) {



            Stack st = new Stack();
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            ArrayList<String> namelist = new ArrayList<String>();
            for (int i = 0; i < num;  ) {

                Scanner sc1 = new Scanner(System.in);
                //  Scanner sb = new Scanner(System.in);
                String str = sc1.nextLine();
                //String line = sc.nextLine();

                if (str.contains("push") && !str.trim().equals("push")) {
                    str = str.replace("push", "");
                    st.push(str.trim());
                    i++;
                }
                if (str.trim().equals("pop")) {
                    if (!st.empty()) {
                        Object p = st.pop();
                        //   System.out.println((String) p);
                        namelist.add((String) p);
                    } else {
                        // System.out.println("error");
                        namelist.add("error");

                    }
                    i++;
                }
                if (str.trim().equals("top")) {
                    if (!st.empty()) {
                        Object p = st.peek();
                        //System.out.println((String) p);

                        namelist.add((String) p);
                    } else {
                        //   System.out.println("error");
                        namelist.add("error");
                    }
                    i++;
                }
            }

            for (int i = 0; i < namelist.size(); i++) {
                System.out.println(namelist.get(i));
            }

        }
    }

