package by.itacademy.courses.hw8.task3;
public class Main {
    public static void main(String[] args) {

            Clothes[] clothes = {
                    new Skirt("Юбка",Sizes.M, "черный", 100),
                    new Skirt("Юбка",Sizes.L, "синий", 150),
                    new Trousers("Штаны",Sizes.XL, "красный", 300),
                    new Trousers("Штаны",Sizes.XXL, "желтый", 400),
                    new TShirt("Майка",Sizes.S, "белый", 200),
                    new TShirt("Майка",Sizes.M, "красный", 250), };

        ClothesShop shop = new ClothesShop();

        shop.searchSize (clothes);
        shop.searchcolor (clothes);
        shop.dress(clothes);
    }
}

