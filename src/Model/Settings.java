package Model;


public class Settings {
    
    boolean themeDark;
    boolean priorityOrder;
    
    

    public Settings(boolean themeDark, boolean priorityOrder) {
        this.themeDark = themeDark;
        this.priorityOrder = priorityOrder;
    }

    public boolean isThemeDark() {
        return themeDark;
    }

    public void setThemeDark(boolean themeDark) {
        this.themeDark = themeDark;
    }

    public boolean isPriorityOrder() {
        return priorityOrder;
    }

    public void setPriorityOrder(boolean priorityOrder) {
        this.priorityOrder = priorityOrder;
    }
    
    public int getPriorityOrder(){
        if(priorityOrder){
            return 1;
        }else{
            return 0;
        }
    }
    

    
  
    
}
