package structuralPatterns.facade;

public class IdeFacade {

    Computer c;

    public IdeFacade(){
       this.c = new Computer();
    }
    public void run_button(String program){
       int bytecode =  c.compile(program);
       c.run(bytecode);
    }
}
