

public class ArrayListCustomDemo {
    public static void main(String[] args) {
        // Krijimi i objektit
        ArrayListCustom list = new ArrayListCustom();

        // Shtimi i elementeve permes metodes add()
        list.add("Profa Naim");
        list.add("elementi x");
        list.add(42);

        // Printimi i te gjithe arrayt
        System.out.println(list);

        // Printimi i nje elementi ne array
        System.out.println(list.get(1));

        // Shtimi me index te caktuar
        list.set(2, "Java");

        // shtimi i elementit
        list.add("elementi y");

        // Printimi i array
        System.out.println(list);

        // Fshirja nga array permes indeksit
        list.remove(3);

        // Printimi i array
        System.out.println(list);


        // Kontrollimi nese array e permban elemetin ne fjale
        System.out.println(list.contains("elementi x"));
        System.out.println(list.contains("elementi x"));

        // Gjetja e indeksit te nje lementi
        System.out.println(list.indexOf("Profa Naim"));
        System.out.println(list.indexOf("Profa Jon"));

        // Printimi i size te array
        System.out.println(list.size());

        // Kontrollimi a eshte zbrazet array
        System.out.println(list.isEmpty());

        // Zbrazja e tere arrayt
        list.clear();
        System.out.println(list);




    }
}
