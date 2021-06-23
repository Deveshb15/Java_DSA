package Recursion;

public class subSequence {
    public static void main(String[] args){
        String str = "abc";

        subSeq("", str);
    }

    public static void subSeq(String proc, String unproc){
        if(unproc.isEmpty()) {
            System.out.println(proc);
            return;
        }

        char ch = unproc.charAt(0);
        unproc = unproc.substring(1);
        
        subSeq(proc+ch, unproc);
        subSeq(proc, unproc);
    }
}
