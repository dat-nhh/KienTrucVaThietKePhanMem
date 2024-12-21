package creational.singleton.bt4;

import java.util.ArrayList;
import java.util.List;

public class ELection {
    private static ELection instance;
     int biden = 0;
     int trump = 0;
     List<String> list = new ArrayList<>();

     private ELection() {}

     public static ELection getInstance() {
         if(instance == null)
            instance = new ELection();
         return instance;
     }

     public void vote(Candidate candidate, String a){
         for(String s : list)
             if (a == s)
                 return;
         if(candidate == Candidate.DONALD_TRUMP){
             trump++;
             list.add(a);
         }
         if(candidate == Candidate.JOE_BIDEN) {
             biden++;
             list.add(a);
         }
     }

     public void inVote() {
         System.out.println("Số vote của Joe Biden:" + biden);
         System.out.println("Số vote của Donald Trump:" + trump);
     }
}
