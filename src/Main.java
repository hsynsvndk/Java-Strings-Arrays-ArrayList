import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    private static ArrayList<String> autoList = new ArrayList<String>();
    private static ArrayList<String> newAutoList = new ArrayList<String>();

    public static void main(String[] args) {
            addAuto();
            addNewAutoList();
            printNewAutoList();
    }
    public static void addAuto(){
        autoList.add("TJP567");
        autoList.add("456MTR893");
        autoList.add("Bgatti234");
        autoList.add("Renault822MTR");
        autoList.add("VW822MTR");
        autoList.add("Porsche822MTR");
        autoList.add("Tesla822MTR");
        autoList.add("Murat124MTR");
    }
    public static void addNewAutoList(){
        for (String auto:autoList){

            newAutoList.add((addCompanyName(addDate(autotoUpperCase(reverseAutoName(extractNumber(auto)))))));
        }
    }
    public static void printNewAutoList(){
        for (String auto:newAutoList){
            System.out.println("Yedek Parça"+newAutoList.indexOf(auto)+"==>"+auto);
        }
    }
    public static String autotoUpperCase(String auto){
        auto=auto.toUpperCase();
        return auto;
    }
    public static String reverseAutoName(String auto){
        StringBuilder input1 = new StringBuilder();
        input1.append(auto);
        input1 = input1.reverse();
        return input1.toString();
    }
    public static String extractNumber(String auto){
       auto = auto.replaceAll("[0-9]","");
       return auto;
    }
    public static String addCompanyName(String auto){
        return "ASLIAG_"+auto;
    }
    public static String addDate(String auto){
        LocalDate date = LocalDate.now();
        return auto+"_"+date.toString();
    }
}
