public class CalculatorProgram {
    private CalculatorClass calculationBackend;

    public CalculatorProgram(CalculatorClass calculationBackend){
        this.calculationBackend = calculationBackend;
    }

    public int addExact(int x, int y){
        return calculationBackend.addExact(x, y);
    }

    public int divideExact(int x, int y){
        return calculationBackend.divideExact(x, y);
    }
}