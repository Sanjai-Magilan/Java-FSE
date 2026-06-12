package Module1.FactoryMethodPatternExample;

public class WordDocument implements Document {
    @Override
    public void createDocument(){
        System.out.println("Word document created");
    }
}
