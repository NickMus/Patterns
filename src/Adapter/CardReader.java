package Adapter;

public class CardReader implements USB{

    private MemoryCard memoryCard;

    public CardReader(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }

    @Override
    public void connect() {
        memoryCard.insert();
        memoryCard.saveData();
    }
}
