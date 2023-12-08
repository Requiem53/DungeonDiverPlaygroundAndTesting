package ConvertToActionTest;

public class Spell implements Actionable{

    //Test
    private final int num;
    private final Action action = new Action() {
        private Actor actor;
        private Actor target;

        @Override
        public void execute() {
            if(actor != null && target != null)
                System.out.println(actor.num + target.num + num);
        }

        public void assignActor(Actor actor){
            this.actor = actor;
        }

        public void assignTarget(Actor target){
            this.target = target;
        }
    };

    public Spell(int num){
        this.num = num;
    }

    public Action getAction(){
        return action;
    }
}
