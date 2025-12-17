package enums;

public enum WaitType {
    EXTRASMALL(500),
    SMALL(5000),
    MEDIUM(10000),

    LARGE(20000);

    Integer wait;

    WaitType( Integer wait){
      this.wait=wait;
    }
    public Integer getWait() {
        return wait;
    }
}
