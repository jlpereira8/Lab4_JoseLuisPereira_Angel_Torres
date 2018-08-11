

package lab4_josepereira_angel_torres;

import java.util.ArrayList;


public class Tokyo {
    
    public String[][] battlefield;
    public String[][] bfVisible;
    private ArrayList evas = new ArrayList();
    private ArrayList angeles = new ArrayList();

    public Tokyo(Eva ev, Angeles an) {
        battlefield = new String[10][10];
        bfVisible = new String[10][10];
        
        battlefield[9][0]="PM";
        battlefield[9][2]="PM";
        battlefield[9][7]="PM";
        battlefield[9][9]="PM";
        
        
        battlefield[9][3] = "E0";
        battlefield[9][6] = "E0";
        
        battlefield[9][4] = "E1";
        battlefield[9][4] = "E2";
        
        battlefield[0][2] = "RR";
        battlefield[0][7] = "RR";
        
        battlefield[1][8] = "ZZ";
        battlefield[1][2] = "ZZ";
        battlefield[3][2] = "ZZ";
        battlefield[3][7] = "ZZ";
        
        battlefield[1][4] = "SS";
        battlefield[1][5] = "SS";
        
        
//        evas.add(new EVA_00());
//        evas.add(new EVA_00());
//        
//        evas.add(new EVA_01());
//        evas.add(new EVA_02());
//        
//        evas.add(new EVA_PM());
//        evas.add(new EVA_PM());
//        evas.add(new EVA_PM());
//        evas.add(new EVA_PM());
//        
//        angeles.add(new Ramiel());
//        angeles.add(new Ramiel());
//        
//        angeles.add(new Zeruel());
//        angeles.add(new Zeruel());
//        angeles.add(new Zeruel());
//        angeles.add(new Zeruel());
//        
//        angeles.add(new Sachiel());
//        angeles.add(new Sachiel());
        
    }
    
    public void colocar(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                battlefield[i][j] = "X";
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                bfVisible[i][j] = "__";
            }
        }
        
        bfVisible[9][0] = "PM";
        bfVisible[9][2] = "PM";
        bfVisible[9][7] = "PM";
        bfVisible[9][9] = "PM";
        
        bfVisible[9][3] = "E0";
        bfVisible[9][6] = "E0";
        
        bfVisible[9][4] = "E1";
        bfVisible[9][4] = "E2";
        
        
        bfVisible[0][2] = "RR";
        bfVisible[0][7] = "RR";
        
        bfVisible[1][8] = "ZZ";
        bfVisible[1][2] = "ZZ";
        bfVisible[3][2] = "ZZ";
        bfVisible[3][7] = "ZZ";
        
        bfVisible[1][4] = "SS";
        bfVisible[1][5] = "SS";
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                switch (bfVisible[i][j]) {
                    
                }
            }
        }
        
    }
    
    public void print() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                
               System.out.print(battlefield[i][j] + " ");
                
            }
            System.out.println("");
        }
    }
    
    public void imprimir() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (bfVisible[i][j].length() > 1) {
                    System.out.print(bfVisible[i][j] + " ");
                } else {
                    System.out.print(bfVisible[i][j] + " ");
                }
            }
            System.out.println("");
        }
    }
    
    

}
