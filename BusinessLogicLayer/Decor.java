package BusinessLogicLayer;

public class Decor {
    
    String theme;
    String decorRequests;
    Boolean needDecor;
    float decorPrice;

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getDecorRequests() {
        return decorRequests;
    }

    public void setDecorRequests(String decorRequests) {
        this.decorRequests = decorRequests;
    }

    public Boolean getNeedDecor() {
        return needDecor;
    }

    public void setNeedDecor(Boolean needDecor) {
        this.needDecor = needDecor;
    }

    public float getDecorPrice() {
        return decorPrice;
    }

    public void setDecorPrice(float decorPrice) {
        this.decorPrice = decorPrice;
    }
}
