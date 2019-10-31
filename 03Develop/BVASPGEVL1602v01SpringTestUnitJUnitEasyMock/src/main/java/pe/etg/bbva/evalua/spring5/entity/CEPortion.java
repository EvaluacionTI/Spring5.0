package pe.etg.bbva.evalua.spring5.entity;

public enum CEPortion {
	SMALL(1), MEDIUM(2), LARGE(3);
    
    private int size;
     
    private CEPortion(int size) {
        this.size = size;
    }
     
    public int size() {
        return size;
    }

}
