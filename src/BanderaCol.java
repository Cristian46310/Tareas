import java.awt.Color;
public class BanderaCol{
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
                flagMatrix=ColFlag((i*12),(j*24));
                JOptionPaneArrays.showColorArray2D(null, flagMatrix);
            }
        }
    }
    public static int[][] ColFlag(int altura, int ancho){
        int[][] flag= new int[altura][ancho];
        int rowIn=0,rowEnd=0,banIni=0,banEnd=0;
        rowIn=(altura*0)/4;
        banIni=(ancho*0)/1;
        rowEnd=(altura*2)/4;
        banEnd=(ancho*1)/1;

        for(int i=rowIn;i<rowEnd;i++){
            for(int j=banIni;j<banEnd;j++){
                flag[i][j]=yellow;
            }
        }
        rowIn=(altura*2)/4;
        banIni=(ancho*0)/1;
        rowEnd=(altura*3)/4;
        banEnd=(ancho*1)/1;

        for(int i=rowIn;i<rowEnd;i++){
            for(int j=banIni;j<banEnd;j++){
                flag[i][j]=blue;
       }
     }
     rowIn=(altura*3)/4;
        banIni=(ancho*0)/1;
        rowEnd=(altura*4)/4;
        banEnd=(ancho*1)/1;

        for(int i=rowIn;i<rowEnd;i++){
            for(int j=banIni;j<banEnd;j++){
                flag[i][j]=red;
       }
    }
    return flag;
}

}
