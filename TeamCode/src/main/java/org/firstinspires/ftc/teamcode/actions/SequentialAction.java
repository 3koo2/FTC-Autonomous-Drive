package org.firstinspires.ftc.teamcode.actions;

public class SequentialAction implements Action{
    private final Action[] actions;
    private int index;
    private final int max;
    public SequentialAction(Action... actions){
        this.actions = actions;
        index = 0;
        max = actions.length;
    }
    @Override
    public boolean run(){
        if (index < max){
            boolean result = actions[index].run();
            if (!result){
                index ++;
            }
        }
        return (index < max);
    }
}
