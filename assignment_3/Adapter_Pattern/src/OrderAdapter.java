public class OrderAdapter implements NewOrderProcessor {
    private LegacyOrderProcessor legacyOrderProcessor;

    public OrderAdapter(LegacyOrderProcessor legacyOrderProcessor) {
        this.legacyOrderProcessor = legacyOrderProcessor;
    }

    @Override
    public void processNewOrder() {
        legacyOrderProcessor.processLegacyOrder();
    }
}