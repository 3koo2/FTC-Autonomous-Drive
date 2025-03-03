package org.firstinspires.ftc.teamcode.actions;

public class ParallelAction implements Action{
    private final boolean[] counters;
    private final Action[] actions;
    public ParallelAction(Action... actions){
        this.actions = actions;
        // The counters array will be populated by false
        counters = new boolean[actions.length];
    }

    @Override
    public boolean run(){
        boolean result = false;
        for (int i = 0; i < actions.length; i++){
            if (!counters[i]){
                counters[i] = !actions[i].run();
            }
            if (!result) {
                result = counters[i];
            }
        }
        return result;
    }
}
