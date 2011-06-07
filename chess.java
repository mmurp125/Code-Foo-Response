import java.util.ArrayList;
public class chess {
    
    //Chess Board
    static enum Rows    {A, B, C, D, E, F, G, H};
    static enum Columns {ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT};
    //Spaces covered
    ArrayList spacesCovered;
    //Array with all Spaces
    static Space[] everySpace;
    static int i;
    static Knight caballus; //Short for Equus ferus caballus a.k.a. horse.
    public static void main(String[] args){
        //Make the array with all spaces
        everySpace = new Space[64];
        i = 0;
        for (Rows r : Rows.values()){
            for (Columns c : Columns.values()){
                everySpace[i++] = new Space(r, c);
            }
        }
        caballus = new Knight();
        
    }
    /*
     * Nested Classes
     * Normally thses would be in seperate class files,
     * but I wanted this all in one file.
     */
    static class Space {
        Rows r;
        Columns c;
        Space(Rows r, Columns c){
            this.r = r;
            this.c = c;
        }
    }
    
    static class Knight {
        //Fields
        Rows rLocal;
        Columns cLocal;
        //Constructor
        Knight(){
            rLocal = Rows.A;
            cLocal = Columns.ONE;
        }
        Knight(Rows r, Columns c){
            rLocal = r;
            cLocal = c;
        }
        //Methods

        Space getSpace(){
            Space currentSpace = new Space(rLocal, cLocal);
            return currentSpace;
        }

    }
}
