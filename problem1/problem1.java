//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Scanner
        Scanner s = new Scanner(System.in);



        int first_num = Integer.parseInt(br.readLine());
        String second_name = br.readLine();

        //process int*2
        // and let string unchanged

        int result1 = first_num * 2;
        int strlen = second_name.length();

        if (result1 <=10 && strlen <= 15 ){
            System.out.println(result1);
            System.out.println(second_name);
        }else{
            System.out.print("num exceeded");
        }



    }
}
