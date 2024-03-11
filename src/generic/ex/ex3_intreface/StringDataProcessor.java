package generic.ex.ex3_intreface;

public class StringDataProcessor implements DataProcessor<String>{
    @Override
    public String processData(String data) {
        return data.toUpperCase();
    }
}
