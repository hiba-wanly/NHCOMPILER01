package symbol;

import java.util.ArrayList;
import java.util.List;

public class SymbolTable {

    private List<SymbolRow> symbolRows = new ArrayList<>();

    public List<SymbolRow> getSymbolRows() {
        System.out.println("lllllllllllllllllll");
        return symbolRows;
    }

    public void setSymbolRows(List<SymbolRow> symbolRows) {
        this.symbolRows = symbolRows;
    }


    public void print(){
        for(int i=0;i<symbolRows.size();i++){
            if(symbolRows.get(i)!=null){
                System.out.print("Symbol Name:  "+symbolRows.get(i).getName() + "  ");
                System.out.print("Symbol Type: "+symbolRows.get(i).getType()+ "  ");
                System.out.print("Symbol Value: "+symbolRows.get(i).getValue()+ "  ");
                System.out.print(" Line Number: " +symbolRows.get(i).getNumline()+" ");
                System.out.println();
            }
        }

    }



}
