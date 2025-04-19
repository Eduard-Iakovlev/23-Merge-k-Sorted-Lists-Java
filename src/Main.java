import output.Output;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int test = 0;
        List<List<Integer>> listsData = new ArrayList<>();
        List<Integer> listDataExpected = new ArrayList<>();

        Output output = new Output();

        test++;
        listsData.add(new ArrayList<>(List.of(1,4,5)));
        listsData.add(new ArrayList<>(List.of(1,3,4)));
        listsData.add(new ArrayList<>(List.of(2,6)));
        listDataExpected = new ArrayList<>(List.of(1,1,2,3,4,4,5,6));
        output.setOutputData(test, listsData, listDataExpected);
        output.printsolution();
        listsData.clear();
        listDataExpected.clear();

        test++;
        listsData = null;
        listDataExpected = null;
        output.setOutputData(test, listsData, listDataExpected);
        output.printsolution();



    }
}