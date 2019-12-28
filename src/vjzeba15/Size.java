package vjzeba15;

public enum Size {

    SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");
    
    private String shortcut;
    
    private Size(String shortcut){
        this.shortcut = shortcut;
    }
    private Size(){
        this.shortcut = "ALL";
    }
    
    public String getShortcut(){
        return shortcut;
    }
    public String toString(){
        String res = null;
        switch(this){
            case SMALL:
                res = "small";
                break;
            case MEDIUM:
                res = "middle";
                break;
            case LARGE:
                res = "large";
                break;
            case EXTRA_LARGE:
                res = "Extra large";
                break;
                
                
        }
        return res;
    }

    
    
    
}
