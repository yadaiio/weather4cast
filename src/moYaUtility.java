public class moYaUtility {
    public static void chageCursor(int row, int column){
        char escCode = 0x1B;
        
        System.out.print(String.format("%c[%d;%df",escCode,row,column));
        System.out.println("Hallo, Welt!");
    }
}