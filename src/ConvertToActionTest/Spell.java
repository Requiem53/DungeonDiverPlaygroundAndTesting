package ConvertToActionTest;

public class Spell implements Actionable{

    private final int num;

    public Spell(int num) {
        this.num = num;
    }

    public Action convertToAction(){
        return new Action() {
            @Override
            public void execute() {
                System.out.println(num);
            }
        };
    }
}
