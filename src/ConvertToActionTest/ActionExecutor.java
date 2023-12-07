package ConvertToActionTest;

import java.util.Queue;

public class ActionExecutor {

    private Action action;

    public void assignAction(Action action){
        this.action = action;
    }

    public void executeAction(){
        if(action != null) action.execute();
    }

    public void assignActorAndTarget(Actor actor, Actor target){
        action.assignActor(actor);
        action.assignTarget(target);
    }

    public void executeActions(Queue<Actionable> actions){
            while (!actions.isEmpty()){
                action = actions.peek().getAction();
                executeAction();
                actions.remove();
            }
    }
}
