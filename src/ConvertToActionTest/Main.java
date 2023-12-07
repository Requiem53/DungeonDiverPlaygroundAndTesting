package ConvertToActionTest;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        ActionExecutor executor = new ActionExecutor();
        Spell testSpell = new Spell(5);
        Spell testSpell2 = new Spell(6);
        Spell testSpell3 = new Spell(7);
        Spell testSpell4 = new Spell(8);
        Spell testSpell5 = new Spell(9);

        Queue<Action> availableActions = new LinkedList<>();
        availableActions.add(testSpell.convertToAction());
        availableActions.add(testSpell2.convertToAction());
        availableActions.add(testSpell3.convertToAction());
        availableActions.add(testSpell4.convertToAction());
        availableActions.add(testSpell5.convertToAction());

        executor.executeActions(availableActions);
    }
}
