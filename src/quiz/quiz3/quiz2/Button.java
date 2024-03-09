package quiz.quiz3.quiz2;

public class Button{

    private OnClickListener listener;

    public void setListener(OnClickListener listener) {
        this.listener = listener;
    }

    public void click () {
        if (!(listener == null)){
            listener.onClick();
        }
    }
}
