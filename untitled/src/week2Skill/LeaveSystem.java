package week2Skill;
abstract class LeaveApproval{
  protected LeaveApproval nextApproval;
   public void setNextApproval(LeaveApproval l){

   }
}
class TeamLead extends LeaveApproval{
   public void setNextApproval(LeaveApproval l){
    this.nextApproval=new Manager();
   }
}
class Manager extends LeaveApproval{
  public void setNextApproval(){
    this.nextApproval=new Director();
  }
}
class Director extends LeaveApproval{
  public void setNextApproval(LeaveApproval l){
    this.nextApproval=
  }
}
public class LeaveSystem {
  
}
