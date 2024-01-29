package aula3tiposcuringawildcardtypes;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> listObject = new ArrayList<>();
        List<Integer> listInteger = new ArrayList<>();

        // Uma lista do tipo integer não pode receber uma lista do tipo object
        // listObject = listInteger;

        // Supertipo de uma lista é List<?>
        // ? - tipo Curinga

        //
        List<?> listObject2 = new ArrayList<>();
        List<Integer> listInteger2 = new ArrayList<>();

        listObject2 = listInteger2;
    }
}
