package ConvertToActionTest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        ActionExecutor executor = new ActionExecutor();
        Spell testSpell = new Spell(1);
        Spell testSpell2 = new Spell(2);
        Spell testSpell3 = new Spell(3);
        Spell testSpell4 = new Spell(4);
        Spell testSpell5 = new Spell(5);

        List<Actionable> availableActions = new ArrayList<>();

        availableActions.add(testSpell);
        availableActions.add(testSpell2);
        availableActions.add(testSpell3);
        availableActions.add(testSpell4);
        availableActions.add(testSpell5);

        Actor actor = new Actor(100);
        Actor target = new Actor(200);

        availableActions.get(0).getAction().assignActor(actor);
        availableActions.get(0).getAction().assignTarget(target);

        availableActions.get(1).getAction().assignActor(actor);
        availableActions.get(1).getAction().assignTarget(target);

        availableActions.get(2).getAction().assignActor(actor);
        availableActions.get(2).getAction().assignTarget(target);

        availableActions.get(3).getAction().assignActor(actor);
        availableActions.get(3).getAction().assignTarget(target);

        availableActions.get(4).getAction().assignActor(actor);
        availableActions.get(4).getAction().assignTarget(target);

        Queue<Actionable> queuedActions = new LinkedList<>(availableActions);

        executor.executeActions(queuedActions);

        System.out.println("Solo test");

        executor.assignAction(testSpell.getAction());
        executor.executeAction();
    }
}
