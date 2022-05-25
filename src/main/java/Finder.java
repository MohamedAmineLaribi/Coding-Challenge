import java.util.ArrayList;

public class Finder {
    String[] StringList;

    public Finder(String[] StringList) {
        this.StringList = StringList;
    }

    public static Boolean CheckMatching(String element, String parameter) {
        if ((element == "") || (element == null)) {
            return false;
        }
        if (parameter == "") {
            return false;
        }
        if (element.length() < parameter.length()) {
            return false;
        }
        char[] chars = parameter.toCharArray();
        for (char charOfparameter : chars) {
            //check if the elements contains the char of parameter
            if (element.contains(Character.toString(charOfparameter)))
                // If element contains char, replace that with empty string.
                // I am using replaceFirst method to replace only first occurrence.
                element = element.replaceFirst(Character.toString(charOfparameter), "");
            else
                // If char is not present in element string then return false
                return false;
        }
        // If iteration is completed for each char it means all chars of parameter is present in
        // element.
        return true;
    }

    public ArrayList<String> find(String message) {
        ArrayList<String> result = new ArrayList<>();
        // check the matching of every element if it's true then add the element to result arrayList
        for (String element : this.StringList) {
            if (CheckMatching(element, message) == true) {
                result.add(element);


            }

        }

        return result;
    }

    public static void main(String[] args) {
        String[] list = new String[5];
        list[0] = "asd";
        list[1] = "asdd";
        list[2] = "fre";
        list[3] = "glk";
        list[4] = "lkm";
        Finder finder = new Finder(list);
        for (String s : finder.find("sad")) {
            System.out.println(s);
        }
    }
}
