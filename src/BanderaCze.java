import java.awt.Color;
public class BanderaCze {
    public static final int yellow=new Color(250,201,20).getRGB();
    public static final int red=new Color(250,0,0).getRGB();
    public static final int blue=new Color(17,13,99).getRGB();
    public static final int black=new Color(5,5,5).getRGB();
    public static final int white=new Color(255,255,255).getRGB();
    public static final int green=new Color(35,138,51).getRGB();
    public static void main(String[]args){
        int[][] flagMatrix={};
        for(int i=1;i<=2;i++){
            for(int j=1;j<=2;j++){
                flagMatrix=CzeFlag((i*12),(j*24));
                JOptionPaneArrays.showColorArray2D(null, flagMatrix);
            }
        }
    }
    public static int[][] CzeFlag(int altura, int ancho){
        int[][] flag= new int[altura][ancho];
        int rowIn=0,rowEnd=0,banIni=0,banEnd=0;
        rowIn=(altura*0)/1;
        rowEnd=(altura*1)/1;
        banIni=(ancho*0)/5;
        banEnd=(ancho*3)/5;
        for(int i=banIni;i<banEnd;i++){
            for(int j= rowIn; j< rowEnd;j++){
                flag[j][i]=blue;
            }
            rowIn++;
            rowEnd--;
        }
        rowIn=(altura*0)/2;
        rowEnd=(altura*1)/2;
        banIni=(ancho*0)/3;
        banEnd=(ancho*3)/3;
        for(int j= rowIn;j< rowEnd;j++){
            for(int i=banIni+1;i<banEnd;i++){
                flag[j][i]=white;
            }
            banIni++;

        }
        rowIn = (altura * 1) / 2;
        banIni = (ancho * 0) / 3;
        rowEnd = (altura * 2) / 2;
        banEnd = (ancho * 3) / 3;
        for (int i = rowEnd-1 ; i >= rowIn;i--) { 
            for (int j = banEnd-1 ; j > banIni; j--) {
                flag[i][j] = red; 
            }
            banIni++;
        }
        return flag;
     }
       
    }
