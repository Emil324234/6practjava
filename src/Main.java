import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<String> ProductList = ListProduct();
        for (String Product : ProductList)
        {
            System.out.println(Product);
        }
        List<String> DolznotbList = SpisokDolznostey();
        for (String Dolznostb : DolznotbList)
        {
            System.out.println(Dolznostb);
        }
        List<String> KolichestvoStankov = StankiQ();
        for (String Stanki : KolichestvoStankov)
        {
            System.out.println(Stanki);
        }
        List<String> Material = Materials();
        for (String Materials : Material)
        {
            System.out.println(Materials);
        }
        List <String> Services = Uslugi();
        for (String Uslugi : Services)
        {
            System.out.println(Uslugi);
        }
    }
    public static List<String> ListProduct()
    {
        List<String> ProductList = new ArrayList<>();
        ProductList.add("Продукция:");
        ProductList.add("Диван");
        ProductList.add("Кровать");
        ProductList.add("Гумибер");
        ProductList.add("Максим");
        ProductList.add("Табуретка");
        return ProductList;
    }
    public static List<String> SpisokDolznostey()
    {
        List<String> DolznostbList = new ArrayList<>();
        DolznostbList.add("Список должностей:");
        DolznostbList.add("Аудитор");
        DolznostbList.add("Аналитик");
        DolznostbList.add("Администратор");
        DolznostbList.add("Бухгалтер");
        DolznostbList.add("Диспетчер");
        return DolznostbList;
    }
    public static List<String> StankiQ()
    {
        List<String> KolichestvoStankov = new ArrayList<>();
        KolichestvoStankov.add("Количество рабочих станков:");
        KolichestvoStankov.add("15");
        KolichestvoStankov.add("105");
        KolichestvoStankov.add("666");
        KolichestvoStankov.add("23");
        KolichestvoStankov.add("32");
        return KolichestvoStankov;
    }

    public static List <String> Materials()
    {
        List <String> Material = new ArrayList<>();
        Material.add("Материалы: ");
        Material.add("Цельный массив дерева");
        Material.add("Клееный массив дерева");
        Material.add("Фанера");
        Material.add("Древесно-стружечная плита");
        return Material;
    }

    public static List <String> Uslugi()
    {
        List <String> Services = new ArrayList<>();
        Services.add("Услуги: ");
        Services.add("Распил");
        Services.add("Кромление");
        Services.add("Покраска");
        Services.add("Фрезеровка");
        Services.add("Присадка");
        return Services;
    }
}
