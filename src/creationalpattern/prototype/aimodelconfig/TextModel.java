package creationalpattern.prototype.aimodelconfig;

public class TextModel implements BaseModel{
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelType() {
        return modelType;
    }

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    public double getLearningRate() {
        return learningRate;
    }

    public void setLearningRate(double learningRate) {
        this.learningRate = learningRate;
    }

    private String modelName;
    private String modelType;
    private double learningRate;

    public TextModel()
    {

    }
    public TextModel(String modelName,String modelType,double learningRate)
    {
        this.modelName=modelName;
        this.modelType=modelType;
        this.learningRate=learningRate;
    }

    public BaseModel clone()
    {
        return new ImageModel(this.modelName,this.modelType,this.learningRate);
    }

    public String toString()
    {
        return this.modelType+""+this.modelName+" "+this.learningRate;
    }

}
