package structuralpattern.adapterpattern;

import structuralpattern.adapterpattern.adaptee.OpenAi;
import structuralpattern.adapterpattern.adapter.OpenAiAdapter;

public class Main {

    public static void main(String[] args) {

        OpenAi openAi=new OpenAi();
        OpenAiAdapter openAiAdapter=new OpenAiAdapter(openAi);
        System.out.println(openAiAdapter.generateResponse("Hello"));
    }
}
