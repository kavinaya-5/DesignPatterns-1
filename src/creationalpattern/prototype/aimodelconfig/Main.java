package creationalpattern.prototype.aimodelconfig;

public class Main {
    public static void main(String[] args) {
        ImageModel imageModel=new ImageModel();
        imageModel.setModelName("Base model");
        imageModel.setModelType("generic");
        imageModel.setLearningRate(0.001);

        System.out.println(imageModel);
        ImageModel i2=(ImageModel) imageModel.clone();

        System.out.println("this is image model two:"+i2);

    }

}
