package creational.singleton.bt4;

public class MainElection {
    public static void main(String[] args) {
        User s1 = new User("63133655", "Nguyen Hoai Huy Dat");
        User s2 = new User("63130175", "Dinh Ba Dat");
        User s3 = new User("61232188", "Barrack Obama");
        User s4 = new User("32149213", "Osama Bin Laden");
        User s5 = new User("18516165", "Adolf Hitler");
        s1.vote(Candidate.JOE_BIDEN);
        s2.vote(Candidate.DONALD_TRUMP);
        s3.vote(Candidate.JOE_BIDEN);
        s4.vote(Candidate.DONALD_TRUMP);
        s5.vote(Candidate.JOE_BIDEN);
        ELection.getInstance().inVote();
        //s5.vote(Candidate.DONALD_TRUMP);
        //ELection.getInstance().inVote();
    }
}
