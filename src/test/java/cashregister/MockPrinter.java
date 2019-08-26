package cashregister;

public class MockPrinter extends Printer {

    private String printText;

    public String getPrintText() {
        return printText;
    }

    @Override
    public void print(String printThis) {
        super.print(printThis);
        printText = printThis;
    }
}
