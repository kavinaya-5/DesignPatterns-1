package structuralpattern.adapterpattern.adapter;

import structuralpattern.adapterpattern.target.AiModel;
import structuralpattern.adapterpattern.adaptee.OpenAi;

public class OpenAiAdapter implements AiModel {
    OpenAi openAi;
    public  OpenAiAdapter(OpenAi openAi)
    {
        this.openAi=openAi;
    }

    public String generateResponse(String prompt)
    {
        return openAi.generateCompletion(prompt);
    }
}
