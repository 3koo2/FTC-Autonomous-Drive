package org.firstinspires.ftc.teamcode.actions;

public class RaceAction implements Action{
    private final Action[] actions;
    public RaceAction(Action... actions){
        this.actions = actions;
    }

    @Override
    public boolean run(){
        boolean result = true;
        for (Action a : actions){
            boolean state = a.run();
            if (result){
                result = state;
            }
        }
        return result;
    }
}
