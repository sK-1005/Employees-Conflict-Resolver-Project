/**
 * Created by shubham on 2/28/2017.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class isOfRelation {
    public static void main(String[] args) {
        try {
            System.out.println("Enter the relation and dispute parties");
            Scanner sc = new Scanner(System.in);
            // Taking Input
            String str = sc.nextLine();
            // Storing in String array by splitting ","
            String[] s1 = str.split(",");
            // Storing in String array by splitting "->"
            // and putting in our HashMap with [Key, value] Entry
            Map<String, String> mp = new HashMap<String, String>();
            for (int i = 0; i < s1.length - 2; i++) {             // HashMap implementation of String
                String[] s2;
                s2 = s1[i].split("->");
                mp.put(s2[1], s2[0]);
            }
            System.out.print(mp);
            String a1 = s1[s1.length - 2];//Storing two persons dispute!!
            String[] strng1 = relation(a1, mp);
            int path1 = strng1.length;
            String a2 = s1[s1.length - 1];
            String[] strng2 = relation(a2, mp);
            int path2 = strng2.length;
            if(path1<path2) {
                outerloop:
                for (int i = 0; i < path1; i++) {
                    for (int j = 0; j < path2; j++) {
                        if (strng1[i].equals(strng2[j])) {
                            System.out.println("Boss who will solve the matter between two employees will be:" + strng1[i]);
                            break outerloop;
                        }
                    }
                }
            }else if(path2<path1){
                for (int i = 0; i < path2; i++) {
                    for (int j = 0; j < path2; j++) {
                        if (strng2[i].equals(strng1[j])) {
                            System.out.println("Boss who will solve the matter between two employees will be:" + strng2[i]);
                        }
                    }
                }

            }else{
                System.out.println(" NO BOSS");
            }

        }catch(ArrayIndexOutOfBoundsException e) {
        }
    }
        public static String[] relation(String employees, Map<String,String> mpr){
            StringBuffer strng = new StringBuffer();
            while (mpr.containsKey(employees)) {
                strng.append(employees).append("\t");
                employees = mpr.get(employees);
            }
            strng.append(employees);
            String st[] = strng.toString().split("\t");
            return st;
        }

}