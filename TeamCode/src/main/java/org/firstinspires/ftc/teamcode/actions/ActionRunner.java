package org.firstinspires.ftc.teamcode.actions;
public class ActionRunner {
    private final Action action;
    private boolean completed = false;

    public ActionRunner(Action action){
        this.action = action;
    }

    // run action until completion
    public boolean run(){
        if (!completed) {
            completed = !action.run();
        }
        return !completed;
    }
}
