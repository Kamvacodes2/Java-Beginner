
package Chapter_8.Exercise_8_1;

public class Item {
    char color;
    
    // declare and code the setColor method
    public boolean setColor(char colorCode){
        if (colorCode == ' '){
            return false;
        }
        else {
            this.color = colorCode;
            return true;
        }
    }
    
    
}