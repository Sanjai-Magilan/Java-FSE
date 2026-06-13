package Module1.BuilderPatternExample;

public class TestBuilderPattern {
    public static void main(String[] args) {
        Product product= new ProductBuilder()
                .setCPU("Intel I9")
                .setGPU("RTX 5090")
                .setRAM("32GB DDR5")
                .setStorage("2TB SSD")
                .Build();
        product.display();

        Product Computer= new ProductBuilder()
                .setCPU("AMD Ryzen 9 series")
                .setGPU("RTX 6090")
                .setRAM("64GB DDR5")
                .setStorage("4TB SSD")
                .Build();
        Computer.display();
    }
}
