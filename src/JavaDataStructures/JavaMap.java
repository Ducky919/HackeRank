package JavaDataStructures;

import java.util.*;
import java.io.*;
class JavaMap{
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        HashMap<String,Integer> noteBook = new HashMap<>(n);
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            in.nextLine();
            noteBook.put(name,phone);
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
            if (noteBook.containsKey(s)) {
                System.out.println(s + "=" + noteBook.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}