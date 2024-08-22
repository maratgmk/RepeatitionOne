package loop.furniture;
/*
3 Используйте foreach. Создайте перечисление элементов мебели (кровать, стул, стол, шкаф, тумба и т.д.).
 Выведите все элементы мебели, кроме тех, на которых принято сидеть.
 */
public class SitPlace {
    public static void main(String[] args) {
        for (Furniture value : Furniture.values()) {
            if(!value.getType().equalsIgnoreCase("sit")){
                System.out.println(value.name());
            }
        }
    }
}
