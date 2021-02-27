package BusinessLogicLayer;

public class Decor {
    
    String theme;   // Theme type
    String decorRequests;   // Additional decorations requests
    Boolean needDecor;  // Is decor needed
    double decorPrice;   // Price for decoration

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

    public double getDecorPrice() {
        return decorPrice;
    }

    public void setDecorPrice(double decorPrice) {
        this.decorPrice = decorPrice;
    }
}
