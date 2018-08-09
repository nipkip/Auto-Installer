package home;

public class ProgramList<P> {
    public P[] gamingApplications;
    public P[]  IDEs;

    // Constructor
    public ProgramList(P[]  gamingApplications,P[]  IDEs){
        this.gamingApplications = gamingApplications;
        this.IDEs = IDEs;
    }

    // Dummy Constructor for Jackson, idk why this works lol
    public ProgramList(){}

    public P[]  getGamingApplications(){
        System.out.println(this.gamingApplications);
        return this.gamingApplications;
    }
    public P[]  getIDEs(){
        System.out.println(this.IDEs);
        return this.IDEs;
    }


}
