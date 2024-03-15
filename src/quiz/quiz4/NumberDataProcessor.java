package quiz.quiz4;

public class NumberDataProcessor implements DataProcessor<Integer>{
    @Override
    public Integer processData(Integer integer) {
        return integer * 2;
    }
}
