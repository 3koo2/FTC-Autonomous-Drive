# FTC-Actions
This repository contains the public FTC SDK for 2024 season Into The Deep, along a RoadRunner-like actions system.

The action system is heavily based off of RoadRunner's action system in order to be compatible and easy to use for those who are familiar with RoadRunner.
You can create a set of actions, using ParallelAction, SequentialAction, RaceAction, etc., and make your own actions bound to subsystems to control features unique to your robot.

These actions can be run using the ActionRunner class, eliminating the need to create a state machine in your autonomous codebase.

This system can be greatly utilized to write simpler, cleaner, and more readable autonomous code.

# Documentation
## Action Sequences

Sometimes, you might want to run mutiple actions in sequence or at the same time. The following classes allow for various custom-made actions to be combined into one action object that can be run.

All actions implement the Action interface, and therefore can be referenced by a variable of type Action.

### SequentialAction Class

`public SequentialAction(Action... actions)`

The SequentialAction class can combine multiple actions into a single action object, that when run will run them in sequence. When the action is run, it will go through each action given, run until completion, and then continue to the next action. If it is called and has no actions left to run, it will return `false`.

### ParallelAction Class

`public ParallelAction(Action... actions)`

The ParallelAction class combines multiple actions into one action object, and runs them all at the same time. When this action is called, it will run every action until that action is complete. It will continue to run each incomplete action until none remain. When none remain, it will return `false`.

### RaceAction Class

`public RaceAction(Action... actions)`

The RaceAction class is much like the ParallelAction class, however rather than running each incomplete action until completion, it runs each action until *any* of the actions are completed. When completed, the RaceAction will return `false`.

## Running Actions
### ActionRunner Class

`public ActionRunner(Action action)`

The ActionRunner class can be used to run an action. It accepts a single parameter of type Action. It will run this action once when called, and will continue to run this action when called until it is completed. An action is completed when it returns `false`.

`ActionRunner actionRunner = new ActionRunner(action);`

The above code will run the Action object referenced by the variable `action` until completion.
