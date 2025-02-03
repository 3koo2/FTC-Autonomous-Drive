package org.firstinspires.ftc.teamcode.actions;

public class ParallelAction implements Action{
    private Action[] actions;
    private boolean[] completed;
    private int steps;

    public ParallelAction(Action[] actions){
        this.actions = actions;
        this.steps = actions.length;
        this.completed = new boolean[this.steps];
    }
    @Override
    public boolean run(){
        for (int i = 0; i < this.actions.length; i++){
            if (!completed[i]) {
                boolean result = this.actions[i].run();
                completed[i] = !result;
            }
        }
        for (boolean results : completed){
            if (!results){
                return true;
            }
        }
        return false;
    }
}
