package string;

public class stringBuilder {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);
        // chat at 0 index
        System.out.println(sb.charAt(0));

        // set char at 0 index 
        sb.setCharAt(0, 'P');
        System.out.println(sb);
        // insert()
        sb.insert(0, 's');
        System.out.println(sb);

        // delet character
        sb.delete(0,1) ;
        System.out.println(sb);
        sb.replace(0, 1,"T");
        System.out.println(sb);
        sb.append(" hello");
        System.out.println(sb);
        int len = sb.length();
        System.out.println(len);
    }



}
    

