package niuke;

import java.lang.reflect.Method;
import java.util.Scanner;

public class 定义打印方法 {
}


 class Main2 {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String className = scanner.next();
            // print就是需要你定义的方法
            System.out.println(Class.forName(className).newInstance().toString());
            //print(Class.forName(className).newInstance());
        }
    }



}

class First {
    public String toString() {
        return "First";
    }
}

class Second {
    public String toString() {
        return "Second";
    }
}

class Third {
    public String toString() {
        return "Third";
    }
}