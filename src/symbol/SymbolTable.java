package symbol;

import java.util.ArrayList;
import java.util.List;

public class SymbolTable {

    private List<SymbolRow> symbolRows = new ArrayList<>();

    public List<SymbolRow> getSymbolRows() {
//        System.out.println("lllllllllllllllllll");
        return symbolRows;
    }

    public void setSymbolRows(List<SymbolRow> symbolRows) {
        this.symbolRows = symbolRows;
    }


    public void printSymbol(){
//       System.out.println("sumbolllllllllllllllllll");
        for(int i=0;i<symbolRows.size();i++){
//            System.out.println("forrrrrrrrrrrrrrr");
            if(symbolRows.get(i)!=null){
                System.out.println("Symbol : "+i);
                System.out.print("Symbol Type: "+symbolRows.get(i).getType()+ "\n ");
                System.out.print("Symbol Name: "+symbolRows.get(i).getName() + " \n ");
                System.out.print("Symbol Value: "+symbolRows.get(i).getValue()+ "\n  ");
                System.out.print("Line Number: " +symbolRows.get(i).getNumline()+" \n ");
                System.out.println();
                System.out.println("___________________________");
            }
        }

    }



}
