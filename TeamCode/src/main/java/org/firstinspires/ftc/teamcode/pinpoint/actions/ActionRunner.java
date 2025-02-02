package org.firstinspires.ftc.teamcode.pinpoint.actions;

public class ActionRunner {
    private Action[] actions;
    private int step;
    private int steps;
    public ActionRunner(Action[] actionSequence){
        this.step = 0;
        this.actions = actionSequence;
        this.steps = actionSequence.length;
    }

    public boolean runActions(){
        if (step < steps) {
            Action currentAction = this.actions[step];
            boolean result = currentAction.run();
            if (!result){
                step++;
            }

            return true;
        }
        return false;
    }
}
