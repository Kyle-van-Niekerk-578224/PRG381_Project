package BusinessLogicLayer;

public class Decor {
    
    String theme;   // Theme type
    String decorRequests;   // Additional decorations requests
    Boolean needDecor;  // Is decor needed
    float decorPrice;   // Price for decoration

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
