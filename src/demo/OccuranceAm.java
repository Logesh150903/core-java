package demo;
class Amsterdam {
    public int countAm(String s) {
        String str = s.toLowerCase();
       System.out.println("str :"+str);
        int cnt = 0;
        String a[] = str.split(" ");
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals("am")) {
                cnt = cnt + 1;
            }
//            System.out.println(i+"--"+a[i]);
        
        }
        return cnt;
    }
}
public class OccuranceAm {//Source
    public static void main(String[] args) {
        
        Amsterdam a1 = new Amsterdam();
        //int count =a1.countAm(s);
        int count =a1.countAm("I am in AMsterdum Am I .I am fine? I am okay");
        System.out.println(count);
        //System.out.println("Print Count :"+count);
    }
}