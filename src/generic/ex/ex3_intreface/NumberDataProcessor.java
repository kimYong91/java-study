package generic.ex.ex3_intreface;

public class NumberDataProcessor implements DataProcessor<Integer>{
    @Override
    public Integer processData(Integer data) {
        return data * 2;
    }
}
