import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import java.io.FileReader;
import java.io.IOException;
import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        List<Province> list = createProvinceList("provinces.csv");
        list.sort(comparatorByArea());
        /*
        list.sort(new Comparator<Province>(){//using anonumous inner class
            @Override
            public int compare(Province o1,Province o2){
                return Float.valueOf(o1.getArea()).compareTo(o2.getArea());
            }
        });
        */
        list.sort(comparatorByEn());
        list.sort(comparatorByTh());
        list.sort(comparatorByLength());
        list.sort(compareWithMultipleKeys());
        showList(list);
    
    }
    public static Comparator<Province> comparatorByArea() {//will sort in ascending order
        Comparator<Province> cmp = new Comparator<Province>() {
            @Override
            public int compare(Province o1,Province o2){
                return Float.valueOf(o1.getArea()).compareTo(o2.getArea());
            }
        };
        return cmp;
    }

    public static Comparator<Province> comparatorByEn(){
        Comparator<Province> cmp = new Comparator<Province>(){   
        @Override
            public int compare(Province o1,Province o2) {
                return o1.getNameEn().compareTo(o2.getNameEn());
            }
        };
        return cmp;
    }
    public static Comparator<Province> comparatorByTh(){//Must consider unicode of Thai vowels too!
        Comparator<Province> cmp = new Comparator<Province>(){   
        @Override
            public int compare(Province o1,Province o2) {
                Collator coll = Collator.getInstance(new Locale("th","TH"));
                return coll.compare(o1.getNameTh(), o2.getNameTh());
            }
        };
        return cmp;
    }
    public static Comparator<Province> comparatorByLength(){
        Comparator<Province> cmp = new Comparator<Province>(){   
        @Override
            public int compare(Province o1,Province o2) {
                return o1.getNameThLength()-o2.getNameThLength();
                //Java use sign of data to compare; + greater, - smaller, 0 equal
            }
        };
        return cmp;
    }

    public static Comparator<Province> compareWithMultipleKeys() {
        Comparator<Province> cmp = new Comparator<Province>(){   
            @Override
                public int compare(Province o1,Province o2) {
                    Collator coll = Collator.getInstance(new Locale("th","TH"));
                    if(o1.getNameThLength() == o2.getNameThLength()){
                        return coll.compare(o1.getNameEn(), o2.getNameTh());
                    }
                    else{
                        return o1.getNameThLength()-o2.getNameThLength();
                    }
                }
            };
            return cmp;
    }







    public static List<Province> createProvinceList(String fileName) {
        List<Province> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
            String line;
            while((line = br.readLine()) != null){
                String[] data = line.split("\\|");//Split data at |
                list.add(new Province(data[0],data[1],data[2],Float.parseFloat(data[3])));
            }
        } 
        catch(IOException e){
            e.printStackTrace();
        }

        return list;
    }
    public static void showList(List<Province> list) {
        for(Province prov : list){
            System.out.printf("%s %s %s %,.2f %d \n",prov.getNameTh(),prov.getNameEn(),prov.getAbbr(),prov.getArea(),prov.getNameThLength());
        }
    }
}