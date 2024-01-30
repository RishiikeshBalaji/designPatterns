package behavioral.observer;

public class User {

   private int u_id;

   public void stream(int token){
        
        if(token != 0){
            System.out.println("Streaming video for user: " + this.u_id);
        }
        else{
            System.out.println("Buffering for user: " + this.u_id + "...");
        }
   }

    public void setUserId(int u_id){
          this.u_id = u_id;
    }

}
